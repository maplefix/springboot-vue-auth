package top.maplefix.auth.config.exception;

/**
 * @author: Maple
 * @description: 访问权限不足的接口/数据 所报的异常
 * @date: 2021/5/13 14:11
 */
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException() {
        super("用户无此接口权限");
    }
}
