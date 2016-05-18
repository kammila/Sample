package com.spring.mvc.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.spring.mvc.resolver.JsonViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.mvc")
public class HelloWorldRootConfig extends WebMvcConfigurerAdapter {
	
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/static/js/**")
				.addResourceLocations("/resources/static/js/");

		registry.addResourceHandler("/resources/static/css/**")
				.addResourceLocations("/resources/static/css/");

		registry.addResourceHandler("/resources/static/views/**")
				.addResourceLocations("/resources/static/views/");

		registry.addResourceHandler("/resources/static/**")
				.addResourceLocations("/resources/static/");

		registry.addResourceHandler("/webjars/**")
				.addResourceLocations("/webjars/");

	}
	
	
	@Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.ignoreAcceptHeader(true).defaultContentType(
                MediaType.TEXT_HTML);
    }
 
	 /*
     * Configure ContentNegotiatingViewResolver
     */
    @Bean
    public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setContentNegotiationManager(manager);
 
        // Define all possible view resolvers
        List<ViewResolver> resolvers = new ArrayList<ViewResolver>();
 
       
        resolvers.add(jsonViewResolver());
       
         
        resolver.setViewResolvers(resolvers);
        return resolver;
    }
    
  
    /*
     * Configure View resolver to provide JSON output using JACKSON library to
     * convert object in JSON format.
     */
    @Bean
    public ViewResolver jsonViewResolver() {
        return new JsonViewResolver();
    }
 
    	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	 

}
