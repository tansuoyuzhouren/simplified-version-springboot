package com.simplified.springboot.JettyServer;

import com.simplified.springboot.Server.WebServer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class JettyWebServer implements WebServer {
    @Override
    public void toStart(AnnotationConfigWebApplicationContext applicationContext) {
        // 创建一个 Jetty Server 实例，设置监听端口 8080
        Server server = new Server(8081);

        // 创建 Spring 上下文（可以是 Java 配置类）
        WebApplicationContext context = new AnnotationConfigWebApplicationContext();

        // 创建一个 ServletContextHandler 来配置 Servlet
        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.setContextPath("/"); // 设置应用上下文路径

        // 创建 DispatcherServlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        ServletHolder servletHolder = new ServletHolder(dispatcherServlet);

        // 注册 DispatcherServlet 到 contextHandler 中
        contextHandler.addServlet(servletHolder, "/*");

        // 启动 Jetty 服务器，配置 handler
        server.setHandler(contextHandler);

        // 启动服务器
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
