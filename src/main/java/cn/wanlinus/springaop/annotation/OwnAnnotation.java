package cn.wanlinus.springaop.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @author wanli
 * @date 2018-04-10 19:28
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OwnAnnotation {
    String value() default "";

    /**
     * 用于描述此注解的用途
     *
     * @return
     */
    String descript();
}
