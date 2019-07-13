package com.xdh.info;

/**
 * @Package: com.xdh.info
 * @ClassName: RequestMessage
 * @Description: TODO
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 17:26
 * @Version: 1.0
 */
public class RequestMessage {

    private String clientIP;

    private String serviceName;

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
