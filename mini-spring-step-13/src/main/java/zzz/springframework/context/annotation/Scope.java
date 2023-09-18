package zzz.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @author zhangzhongzhen wrote on 2023/9/18
 * @version 1.0
 * @description: 定义拦截注解
 * 用于配置作用域的自定义注解，方便通过配置 Bean 对象注解的时候，拿到 Bean
 * 对象的作用域。不过一般都使用默认的 singleton
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";

}
