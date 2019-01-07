//package zohar.spring_mvc.config;
//
//import javax.servlet.MultipartConfigElement;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletRegistration;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.GenericWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//public class MainWebAppInitializer implements WebApplicationInitializer{
//    
//    private String LOCATION_FILE = "/upload";
//    private long MAX_LOAD_FILE = 5*1024*1024;
//    
//    @Override
//    public void onStartup(ServletContext sc) {
//        ServletRegistration.Dynamic appServlet = sc.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
//        appServlet.setLoadOnStartup(1);
//        MultipartConfigElement multipartConfigElement = new MultipartConfigElement(LOCATION_FILE, MAX_LOAD_FILE, MAX_LOAD_FILE*2, (int)MAX_LOAD_FILE/2);
//        appServlet.setMultipartConfig(multipartConfigElement);
//    }
//
//}
