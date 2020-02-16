//IntelliJ IDEA
//ch11_1
//StatusHealth
//2020/2/16
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.ch11_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class StatusHealth implements HealthIndicator {
    @Autowired
    StatusService statusService;

    @Override
    public Health health() {
        String status = statusService.getStatus();

        if(status == null || !status.equals("running")){
            return Health.down().withDetail("Error", "Not Running").build();
        }
        return Health.up().build();
    }
}
