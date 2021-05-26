package com.example.utils;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "mapping")
@PropertySource(factory = YamlPropertySourceFactory.class, value = "classpath:/tables-mapping.yml")
@Getter
@Setter
public class TableMapper {
    private Map<String, String> categoryToTableMapping;
}
