package com.tony.flowable;



import com.tony.flowable.config.AppDispatcherServletConfiguration;
import com.tony.flowable.config.ApplicationConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import tk.mybatis.spring.annotation.MapperScan;

@Import({
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class
})
//@ComponentScan(basePackages = {"org.flowable.ui.modeler.rest.app", "org.flowable.ui.common.service"})
@MapperScan(basePackages = "com.tony.flowable.mapper")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TonyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TonyApplication.class, args);
    }


}
