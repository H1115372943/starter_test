package com.example.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @Desc
 * @Author qingteng
 * @Date 2025/4/15上午11:39
 */
@EnableConfigurationProperties({CustomProperties.class})
public class StarterConfig {

    @Bean
    public CountService countService() {
        return new CountService();
    }
}
