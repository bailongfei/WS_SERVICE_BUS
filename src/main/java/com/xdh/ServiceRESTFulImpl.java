package com.xdh;

import com.xdh.info.RequestMessage;
import com.xdh.info.ResponseResult;
import com.xdh.info.request.LoginMessage;
import com.xdh.utils.strings.ResourcesUtil;

/**
 * @Package: com.xdh
 * @ClassName: ServiceRESTFulImpl
 * @Description: TODO
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 15:20
 * @Version: 1.0
 */
public class ServiceRESTFulImpl implements ServiceRESTFul {

    /**
     * 执行实现了Executable<R,T>接口的服务类。
     *
     * @param reqName  要调用的服务名。
     * @param params 请求参数
     * @return
     */
    @SuppressWarnings("unchecked")
    private <R extends ResponseResult<?>, T extends RequestMessage> R invokeExecutableService(String reqName, T params) {
        R res = null;
        if (reqName == null || params == null) {
            return res;
        }
        try {
            Class<?> c = Class.forName(ResourcesUtil.getResourceBundleMessage(reqName));
            res = ((Executable<R, T>) c.newInstance()).execute(params);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }


    /**
     * 统一执行接口
     * @param reqName  请求名
     * @param inMessage 入参
     * @param <R> 泛型
     * @param <T> 泛型
     * @return res
     */
    private <R, T extends RequestMessage> ResponseResult<R> executeService(String reqName, T inMessage) {
        inMessage.setClientIP("");
        inMessage.setServiceName(reqName);
        return invokeExecutableService(reqName,inMessage);
    }


    @Override
    public ResponseResult<Object> login(LoginMessage message) {
        return executeService("com.xdh.info.request.loginMessage",message);
    }
}