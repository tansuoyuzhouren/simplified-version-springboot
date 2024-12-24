package com.simplified.springboot.TomcatServer;

import com.simplified.springboot.WebServiceCondition.ConditionalOnClass;
import com.simplified.springboot.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/**
 * 返回true就会把这个类当作配置类注册到 spring容器中
 */
@ConditionalOnClass("org.apache.catalina.startup.Tomcat")
public class TomcatWebServiceAutoConfiguration implements AutoConfiguration {
    @Bean
    public TomcatWebServer tomcatWebServer(){
        return new TomcatWebServer();
    }
}
