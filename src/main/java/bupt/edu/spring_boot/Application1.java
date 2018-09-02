package bupt.edu.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuqia on 2018/7/6.
 */
@RestController
@EnableAutoConfiguration
public class Application1 implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8899);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application1.class, args);
    }

    @RequestMapping("/hello")
    public String port(){
        return "port 8899";
    }
}
