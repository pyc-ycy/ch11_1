//IntelliJ IDEA
//ch11_1
//StatusEndPoint
//2020/2/16
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.ch11_1;

import org.springframework.beans.BeansException;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@ConfigurationProperties(prefix = "endpoints.status", ignoreUnknownFields = false)
public class StatusEndPoint extends AbstractEndpoint<String> implements
        ApplicationContextAware {
    ApplicationContext context;

    public StatusEndPoint(){
        super("status");
    }

    @Override
    public String invoke(){
        StatusService statusService = context.getBean(StatusService.class);

        return "The Current Status  is :"+statusService.getStatus();
    }

    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        this.context = arg0;

    }
}
