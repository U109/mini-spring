package zzz.springframework.beans.factory.config;

import zzz.springframework.beans.BeansException;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 */
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
