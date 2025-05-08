package com.example.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Desc
 * @Author qingteng
 * @Date 2025/4/16下午4:05
 */
@ConfigurationProperties(prefix = "demo.springboot.starter")
public class CustomProperties {
    private int rate;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
