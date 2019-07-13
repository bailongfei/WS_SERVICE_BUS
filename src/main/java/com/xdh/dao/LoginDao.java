package com.xdh.dao;

import com.xdh.info.ResponseResult;
import com.xdh.Executable;
import com.xdh.info.request.LoginMessage;
import com.xdh.utils.strings.ResourcesUtil;

/**
 * @Package: com.xdh.dao
 * @ClassName: LoginDao
 * @Description: 登录
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 17:33
 * @Version: 1.0
 */
public class LoginDao implements Executable<ResponseResult, LoginMessage> {

    @Override
    public ResponseResult execute(LoginMessage params) {
        if (params.getLoginName() == null) {
            return new ResponseResult<>("0",
                    ResourcesUtil.getResourceBundleMessage(messagePath, "Missing.LoginMessage.LoginName"),
                    new Object());
        }
        if (params.getPassword() == null) {
            return new ResponseResult<>("0",
                    ResourcesUtil.getResourceBundleMessage(messagePath, "Missing.LoginMessage.Password"),
                    new Object());
        }
        try {
//            dao 层持久
            return new ResponseResult<>("1",
                    ResourcesUtil.getResourceBundleMessage(messagePath, "Service.Succeed"),
                    new Object());
        } catch (Exception e) {
            return new ResponseResult<>("0",
                    ResourcesUtil.getResourceBundleMessage(messagePath, "Service.Failed"),
                    new Object());
        }
    }


}
