package com.example.starter;

import org.springframework.context.annotation.Bean;

/**
 * @Desc
 * @Author qingteng
 * @Date 2025/4/15上午11:39
 */

public class StarterConfig {

    @Bean
    public CountService countService() {
        return new CountService();
    }
}
