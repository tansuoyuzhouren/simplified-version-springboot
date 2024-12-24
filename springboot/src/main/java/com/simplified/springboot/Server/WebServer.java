package com.simplified.springboot.Server;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;


public interface WebServer {
    void toStart(AnnotationConfigWebApplicationContext applicationContext);
}
