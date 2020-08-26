package com.tony.flowable;



import com.tony.flowable.config.AppDispatcherServletConfiguration;
import com.tony.flowable.config.ApplicationConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import({
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class
})
//@ComponentScan(basePackages = {"com.tony","org.flowable.ui.modeler", "org.flowable.ui.common"})
@SpringBootApplication(scanBasePackages = {"com.tony.flowable"},exclude = {SecurityAutoConfiguration.class})
public class TonyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TonyApplication.class, args);
    }


}
