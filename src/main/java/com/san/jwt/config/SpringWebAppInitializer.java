package com.san.jwt.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebAppInitializer implements WebApplicationInitializer{

	//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(SpringConfig.class);
		appContext.register(LoginSecurityConfig.class);
		//appContext.register(PostgresDbConfig.class);
		//appContext.register(PostgresDBConfigEM.class);
		
		//webCtx.setServletContext(ctx);
		appContext.setConfigLocation("com.san.jwt.config");
	    servletContext.addListener(new ContextLoaderListener(appContext));
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(appContext));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
		
		
	}

}
