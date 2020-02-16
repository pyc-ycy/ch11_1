//IntelliJ IDEA
//ch11_1
//statusService
//2020/2/16
// Author:御承扬
//E-mail:2923616405@qq.com

package com.pyc.ch11_1;

import org.springframework.stereotype.Service;

@Service
public class statusService {
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
