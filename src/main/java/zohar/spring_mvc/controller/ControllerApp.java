package zohar.spring_mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import zohar.spring_mvc.model.User;

@Controller
public class ControllerApp {

    @RequestMapping("/")
    public String hello(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }

    @RequestMapping("/check")
    public String checkLogin(@Valid @ModelAttribute("user") User user, BindingResult br, Model model) {
        if (br.hasErrors()) {
            return "login";
        } else {
            String pass = user.getPassword();
            if ("admin".equals(pass)) {
                return "home";
            } else {
                model.addAttribute("message", user.getUserName());
                return "loginFail";
            }
        }
    }

    @RequestMapping("/page1")
    public String viewPage1() {
        return "viewPage1";
    }

    @RequestMapping("/imageVideo")
    public String viewImageVideo() {
        return "imageVideo";
    }
}
