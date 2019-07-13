package com.xdh.utils.strings;

import java.util.ResourceBundle;

/**
 * @Package: com.xdh.utils.strings
 * @ClassName: ResourcesUtil
 * @Description: 读取资源文件工具类
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 17:03
 * @Version: 1.0
 */
public class ResourcesUtil {

    /**
     * 读取指定properties文件的指定key
     *
     * @param filePath 文件目录  config/database/jdbc.properties
     * @param key      句柄名 jdbc.url
     * @return 返回值
     */
    public static String getResourceBundleMessage(String filePath, String key) {
        return key == null ? ""
                : ResourceBundle.getBundle(filePath).getString(key);
    }

    /**
     * 读取指定properties文件的指定key
     *
     * @param key      句柄名 jdbc.url
     * @return 返回值
     */
    public static String getResourceBundleMessage( String key) {
        return key == null ? ""
                : ResourceBundle.getBundle("config/methods/mapper").getString(key);
    }

    /**
     * 释放{@link AutoCloseable}资源。
     *
     * @param closeableResource 资源
     */
    public static void closeResource(AutoCloseable... closeableResource) {
        if (closeableResource != null) {
            for (AutoCloseable autoCloseable : closeableResource) {
                if (autoCloseable != null)
                    try {
                        autoCloseable.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                autoCloseable = null;

            }
        }
    }

}
