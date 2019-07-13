package com.xdh;

/**
 * @Package: com.xdh
 * @ClassName: Execute
 * @Description: 用于标记一个类为服务类。<br>
 * 服务类必须实现此接口的execute方法。<br>
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 17:22
 * @Version: 1.0
 */
public interface Executable<R, T> {

    String messagePath = "config/message/message";

    R execute(T params);
}
