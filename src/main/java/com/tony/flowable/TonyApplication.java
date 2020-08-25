package com.tony.flowable;



import com.tony.flowable.config.DatabaseAutoConfiguration;
import org.flowable.ui.modeler.conf.ApplicationConfiguration;
import org.flowable.ui.modeler.servlet.AppDispatcherServletConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import({
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class,
        DatabaseAutoConfiguration.class
})
@ComponentScan(basePackages = {"com.tony","org.flowable.ui.modeler", "org.flowable.ui.common"})
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TonyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TonyApplication.class, args);
    }


}
