package zohar.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class ControllerTest {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
    
    @RequestMapping("/sum")
    public String sum() {
        return "declareTags";
    }
    
    @RequestMapping("/directToGoogle")
    public String directToGoogle() {
        return "reponse";
    }
    
    @RequestMapping("/directivePage")
    public String directivePage() {
        return "directivePage";
    }
    
    @RequestMapping("/include")
    public String include() {
        return "include";
    }
    
    @RequestMapping("/errorPage")
    public String errorPage() {
        return "errorPage";
    }
    
    @RequestMapping("/forwardFrom")
    public String forwardFrom() {
        return "forwardFrom";
    }
    
    @RequestMapping("/includeJsp")
    public String includeJsp() {
        return "includeJsp";
    }
    
    @RequestMapping("/useBean")
    public String useBean() {
        return "useBean";
    }
    
    @RequestMapping("/useBeanScopeSession")
    public String useBeanScopeSession() {
        return "useBeanScopeSession";
    }
}
