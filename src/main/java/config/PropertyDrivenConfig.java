package config;

import dao.IDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.Map;

@Configuration
@PropertySource("classpath:app.properties")
public class PropertyDrivenConfig {

    private final Map<String, IDao> candidates;

    public PropertyDrivenConfig(Map<String, IDao> candidates) {
        this.candidates = candidates;
    }
}
