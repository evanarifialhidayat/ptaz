package com.app.interview.ptaz.conf;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    @PropertySource("classpath:application.properties")
//    , @PropertySource(value = "classpath:git.properties")
})
public class ServletInitializer extends SpringBootServletInitializer {

}
