package com.xdh.dao;

import com.xdh.Executable;
import com.xdh.info.Result;
import com.xdh.info.request.LoginMessage;
import com.xdh.utils.commons.ConnectionPool;
import com.xdh.utils.strings.ResourcesUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.JDBCType;

/**
 * @Package: com.xdh.dao
 * @ClassName: LoginDao
 * @Description: 登录方法
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 17:33
 * @Version: 1.0
 */
public class LoginDao implements Executable<Result, LoginMessage> {

    @Override
    public Result execute(LoginMessage params) {
        if (params.getLoginName() == null) {
            return new Result<>("0",
                    ResourcesUtil.getResourceBundleMessage(messagePath, "Missing.LoginMessage.LoginName"),
                    null);
        }
        if (params.getPassword() == null) {
            return new Result<>("0",
                    ResourcesUtil.getResourceBundleMessage(messagePath, "Missing.LoginMessage.Password"),
                   null);
        }
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = null;
        try {

            conn = pool.getConnection();
            String sql = "call sp_login(?,?,?,?) ";
            CallableStatement stmt = conn.prepareCall(sql);
            stmt.setString(1,params.getLoginName());
            stmt.setString(2,params.getPassword());
            stmt.registerOutParameter(3, JDBCType.CHAR);
            stmt.registerOutParameter(4, JDBCType.CHAR);
            stmt.execute();
            conn.commit();

//            dao 层持久
            return new Result<>(stmt.getString(3),
                    stmt.getString(4),
                    null);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>("0",
                    ResourcesUtil.getResourceBundleMessage(messagePath, "Service.Failed"),
                    null);
        } finally {
            pool.freeConn(conn);
        }
    }


}
