package com.xdh.info.request;

import com.xdh.info.RequestMessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Package: com.xdh.info.request
 * @ClassName: LoginMessage
 * @Description: 登录消息的入参
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 17:37
 * @Version: 1.0
 */

@XmlRootElement(name = "loginMessage")
@XmlAccessorType(XmlAccessType.FIELD)
public class LoginMessage extends RequestMessage {
    /**
     * 登录用户名
     */
    @XmlElement(required = true)
    private String loginName;
    /**
     * 登录密码
     */
    @XmlElement(required = true)
    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
