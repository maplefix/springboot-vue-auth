package top.maplefix.auth.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: Maple
 * @description: 访问此接口需要的权限
 * @date: 2021/5/13 9:16
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresPermissions {
    /**
     * 权限值
     * @return
     */
    String[] value();

    /**
     * 逻辑关系，默认是且
     * @return
     */
    Logical logical() default Logical.AND;
}
