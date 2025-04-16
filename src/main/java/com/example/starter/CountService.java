package com.example.starter;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.servlet.http.HttpServletRequest;

/**
 * @Desc
 * @Author qingteng
 * @Date 2025/4/15下午3:03
 */
public class CountService implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void count() {
        HttpServletRequest request = context.getBean(HttpServletRequest.class);
        String ip = request.getRemoteAddr();
        System.out.println(String.format("receive remote %s", ip));
    }
}
