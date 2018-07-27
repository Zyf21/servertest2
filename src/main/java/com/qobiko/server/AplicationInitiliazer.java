package com.qobiko.server;


import com.qobiko.server.config.WebConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AplicationInitiliazer  implements WebApplicationInitializer {

    private final static String DISPAtCHER ="dispatcher";

    public void onStartup(ServletContext servletContext) throws ServletException {



        AnnotationConfigApplicationContext ctx =new  AnnotationConfigApplicationContext();
        ctx.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener((WebApplicationContext) ctx));

        ServletRegistration.Dynamic sevlet = servletContext.addServlet(DISPAtCHER, new DispatcherServlet((WebApplicationContext) ctx));

        sevlet.addMapping("/");
        sevlet.setLoadOnStartup(1);
    }
}
