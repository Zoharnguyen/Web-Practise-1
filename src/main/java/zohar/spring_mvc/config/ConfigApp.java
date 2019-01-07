//package zohar.spring_mvc.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.multipart.commons.CommonsMultipartResolver;
//import org.springframework.web.multipart.support.StandardServletMultipartResolver;
//
//@Configuration
//@ComponentScan("zohar.spring_mvc.config")
//public class ConfigApp {
//    @Bean(name= "mutilpartResolver")
//    public CommonsMultipartResolver mutilpartResolver() {
//        CommonsMultipartResolver mutilpartResolver = new CommonsMultipartResolver();
//        mutilpartResolver.setMaxUploadSize(1024);
//        return mutilpartResolver;
//    }
//    
//    @Bean
//    public StandardServletMultipartResolver multipartServlet() {
//        return new StandardServletMultipartResolver();
//    }
//}
