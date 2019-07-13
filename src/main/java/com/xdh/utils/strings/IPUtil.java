package com.xdh.utils.strings;

import org.apache.cxf.message.Message;
import org.apache.cxf.phase.PhaseInterceptorChain;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Package: com.xdh.utils.strings
 * @ClassName: IPUtil
 * @Description: 获取调用者ip
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 19:46
 * @Version: 1.0
 */
public class IPUtil {

    // ip的正则表达式
    private static String pattern = "((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}";

    /**
     * 获取调用者的ip地址
     *
     * @return ipAddress
     */
    public static String getClientIP() {
        try {
            Message message = PhaseInterceptorChain.getCurrentMessage();
            HttpServletRequest httpRequest = (HttpServletRequest) message.get(AbstractHTTPDestination.HTTP_REQUEST);
            return httpRequest.getRemoteHost();
        } catch (Exception e) {
            return "";
        }
    }

    /**
     *  判断是否为正确的ip地址
     *
     * @param ip ip 地址
     * @return boolean
     */
    public static boolean fitPattern(String ip) {
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(ip);
        return m.matches();
    }


}
