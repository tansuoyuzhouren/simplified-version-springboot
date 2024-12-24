package com.simplified.springboot.JettyServer;
import com.simplified.springboot.WebServiceCondition.ConditionalOnClass;
import com.simplified.springboot.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass("org.eclipse.jetty.server.Server")
public class JettyWebServiceAutoConfiguration implements AutoConfiguration {
    @Bean
    public JettyWebServer jettyWebServer(){
        return new JettyWebServer();
    }
}
