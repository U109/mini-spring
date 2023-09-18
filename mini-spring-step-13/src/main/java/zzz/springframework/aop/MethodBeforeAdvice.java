package zzz.springframework.aop;
import java.lang.reflect.Method;
/**
 * @author zhangzhongzhen wrote on 2023/9/17
 * @version 1.0
 * @description: Advice 都是通过方法拦截器 MethodInterceptor 实现的。环
 * 绕 Advice 类似一个拦截器的链路
 */
public interface MethodBeforeAdvice extends BeforeAdvice {

    /**
     * Callback before a given method is invoked.
     *
     * @param method method being invoked
     * @param args   arguments to the method
     * @param target target of the method invocation. May be <code>null</code>.
     * @throws Throwable if this object wishes to abort the call.
     *                   Any exception thrown will be returned to the caller if it's
     *                   allowed by the method signature. Otherwise the exception
     *                   will be wrapped as a runtime exception.
     */
    void before(Method method, Object[] args, Object target) throws Throwable;

}