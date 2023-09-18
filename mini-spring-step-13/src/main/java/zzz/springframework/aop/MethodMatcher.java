package zzz.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author zhangzhongzhen wrote on 2023/9/16
 * @version 1.0
 * @description: 方法匹配，找到表达式范围内匹配下的目标类和方法。
 */
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     * @return whether or not this method matches statically
     */
    boolean matches(Method method, Class<?> targetClass);
}
