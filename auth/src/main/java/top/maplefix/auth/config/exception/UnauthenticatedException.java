package top.maplefix.auth.config.exception;

/**
 * @author: Maple
 * @description: 未登录的异常
 * @date: 2021/5/13 14:11
 */
public class UnauthenticatedException extends RuntimeException {
    public UnauthenticatedException() {
        super("未登录");
    }
}
