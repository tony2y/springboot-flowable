package com.tony.flowable;

import org.flowable.ui.idm.conf.ApplicationConfiguration;
import org.flowable.ui.idm.servlet.AppDispatcherServletConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

//启用全局异常拦截器
@Import(value={
        // 引入修改的配置
        ApplicationConfiguration.class,
        AppDispatcherServletConfiguration.class,
        // 引入 DatabaseConfiguration 表更新转换
//        DatabaseConfiguration.class
})
// 移除 Security 自动配置
@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class TonyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TonyApplication.class, args);
    }


}
