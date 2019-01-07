package zohar.spring_mvc.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import zohar.spring_mvc.model.UploadForm;


@Controller
public class ControllerUploadFile {
    @RequestMapping(value= "/uploadonefile", method=RequestMethod.GET)
    public String uploadOneFileHandler(Model model) {
        UploadForm uploadForm = new UploadForm();
        model.addAttribute("uploadForm", uploadForm);
        return "uploadonefile";
    }
    
    @RequestMapping(value= "/uploadonefile", method=RequestMethod.POST)
    public String uploadFileHandlerPost(HttpServletRequest request, Model model, @ModelAttribute("uploadonefile") UploadForm uploadForm) throws IOException {
        return this.doUpload(request, model, uploadForm);
    }
    
    @RequestMapping(value= "/uploadmultifile", method=RequestMethod.GET)
    public String uploadMultiFileHandler(Model model) {
        UploadForm uploadForm = new UploadForm();
        model.addAttribute("uploadForm", uploadForm);
        return "uploadmultifile";
    }
    
    @RequestMapping(value= "/uploadmultifile", method=RequestMethod.POST)
    public String uploadMultiFileHandlerPost(HttpServletRequest request, Model model,
            @ModelAttribute("uploadForm") UploadForm uploadForm) throws IOException {
        return this.doUpload(request, model, uploadForm);
    }
    
    public String doUpload(HttpServletRequest request, Model model, @ModelAttribute("uploadForm") UploadForm uploadForm) throws IOException {
        String uploadRootPath= request.getServletContext().getRealPath("upload");
//        File uploadRootDir = new File(uploadRootPath);
//        // Tạo thư mục gốc upload nếu nó không tồn tại.
//        if (!uploadRootDir.exists()) {
//            uploadRootDir.mkdirs();
//        }
        List<String> uploadSucess = new ArrayList<String>();
        List<String> uploadFail = new ArrayList<String>();
        for(MultipartFile file : uploadForm.getFiles()) {
            String nameOrigin = file.getOriginalFilename();
            if(nameOrigin!=null && nameOrigin.length() > 0) {      
                File fileServer = new File(uploadRootPath+ File.separator + nameOrigin);
                try {
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(fileServer));
                    stream.write(file.getBytes());
                    stream.close();
                    uploadSucess.add(fileServer.getAbsolutePath());
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }                
            } else {
                uploadFail.add(nameOrigin);
            }
        }
        model.addAttribute("uploadSucess", uploadSucess);
        model.addAttribute("uploadFail", uploadFail);
        return "resultupload";
    }
}
