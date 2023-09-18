package zzz.springframework.aop;

/**
 * @author zhangzhongzhen wrote on 2023/9/17
 * @version 1.0
 * @description: Advisor 承担了 Pointcut 和 Advice 的组合，Pointcut 用于获取 JoinPoint，而
 * Advice 决定于 JoinPoint 执行什么操作。
 */
public interface PointcutAdvisor extends Advisor {

    /**
     * Get the Pointcut that drives this advisor.
     */
    Pointcut getPointcut();

}