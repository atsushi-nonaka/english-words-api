package com.example.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@PropertySource(value = "classpath:messages.properties", encoding = "utf-8")
@ConfigurationProperties(prefix = "")
@Data
public class LogMessages {
    private String insertStart;
    private String insertEnd;
    private String selectStart;
    private String selectEnd;
    private String updateStart;
    private String updateEnd;
    private String deleteStart;
    private String deleteEnd;
}
