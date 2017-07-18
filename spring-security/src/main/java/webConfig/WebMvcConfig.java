package webConfig;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Fedor on 18.07.2017.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter
{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/error").setViewName("error");
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/login").setViewName("login");

    }
}
