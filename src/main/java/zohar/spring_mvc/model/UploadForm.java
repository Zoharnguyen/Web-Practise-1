package zohar.spring_mvc.model;

import org.springframework.web.multipart.MultipartFile;

public class UploadForm {
    private String description;
    private MultipartFile[] files;

    public UploadForm(String description, MultipartFile[] files) {
        super();
        this.description = description;
        this.files = files;
    }

    public UploadForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }

}
