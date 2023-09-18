package zzz.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @author zhangzhongzhen wrote on 2023/9/17
 * @version 1.0
 * @description:
 */
public interface Advisor {

    /**
     * Return the advice part of this aspect. An advice may be an
     * interceptor, a before advice, a throws advice, etc.
     * @return the advice that should apply if the pointcut matches
     * @see org.aopalliance.intercept.MethodInterceptor
     * @see BeforeAdvice
     */
    Advice getAdvice();

}
