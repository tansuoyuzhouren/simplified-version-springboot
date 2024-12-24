package com.simplified.springboot.Core;
import com.simplified.springboot.Server.WebServer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class SpringApplication {

    public static void run(Class zclass) throws Exception {
        System.out.println("启动springBoot");
        /**
         * 创建Spring 容器
         *
         */
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();

        /**
         * 注册配置文件到容器里面
         */
        applicationContext.register(zclass);

        /**
         * 解析配置文件里面的 bean
         */
        applicationContext.refresh();

        /**
         * 启动服务器
         */

        WebServer bean = applicationContext.getBean(WebServer.class);
        bean.toStart(applicationContext);
    }

}
