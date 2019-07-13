package com.xdh.utils.strings;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Package: com.xdh.utils
 * @ClassName: DateFormatUtil
 * @Description: 获取时间工具
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 15:04
 * @Version: 1.0
 */
public class DateFormatUtil {

    private static SimpleDateFormat SDF_FULL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
    private static SimpleDateFormat SDF_DATE = new SimpleDateFormat("yyyy-MM-dd");
    public enum SDF_Type{ SDF_FULL, SDF_DATE }

    /**
     * 获取完整时间 yyyy-MM-dd HH:mm:ss,SSS
     * @return dateString
     */
    public static String getFullDate(){
        return SDF_FULL.format(new Date())+"\t";
    }

    /**
     * 获取年月日 yyyy-MM-dd
     * @return dateString
     */
    public static String getNormalDate(){
        return SDF_DATE.format(new Date()+"\t");
    }

    /**
     * 获取时间
     * @param type 完整时间/正常时间
     * @return dateString
     */
    public static String getDate(SDF_Type type){
        if (type == SDF_Type.SDF_DATE){
            return getNormalDate();
        } else {
            return getDate();
        }
    }

    /**
     * 获取时间
     * @return 默认返回完整时间
     */
    public static String getDate(){
        return getFullDate();
    }

}
