package com.buutcamp.configuration.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com.buutcamp")
@EnableWebMvc
@PropertySource("classpath:webconfig.properties")
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${prefix}")
    private String prefix;

    @Value("${suffix}")
    private String suffix;

    @Bean
    public UrlBasedViewResolver urlBasedViewResolver() {
        UrlBasedViewResolver urlBasedViewResolver =
                new UrlBasedViewResolver();
        //urlBasedViewResolver.setPrefix("/WEB-INF/views/");
        //urlBasedViewResolver.setSuffix(".jsp");
        urlBasedViewResolver.setPrefix(prefix);
        urlBasedViewResolver.setSuffix(suffix);
        urlBasedViewResolver.setViewClass(JstlView.class);

        return urlBasedViewResolver;
    }
}
