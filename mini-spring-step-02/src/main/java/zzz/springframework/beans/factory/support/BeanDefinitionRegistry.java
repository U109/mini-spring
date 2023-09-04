package zzz.springframework.beans.factory.support;

import zzz.springframework.beans.factory.config.BeanDefinition;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:39
 * @description:
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName Bean 的名称
     * @param beanDefinition Bean 的定义
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
