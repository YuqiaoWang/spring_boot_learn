package bupt.edu.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuqia on 2018/7/6.
 */
@RestController
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
