package top.maplefix.auth.util;

/**
 * @author: Maple
 * @description: 字符串判空工具
 * @date: 2021/5/13 9:21
 */
public class StringTools {

    public static boolean isNullOrEmpty(String str) {
        return null != str && !"".equals(str) && !"null".equals(str);
    }

    public static boolean isNullOrEmpty(Object obj) {
        return null == obj || "".equals(obj);
    }
}
