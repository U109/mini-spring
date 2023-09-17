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
     * @param beanName       Bean 的名称
     * @param beanDefinition Bean 的定义
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 使用Bean名称查询BeanDefinition
     */
    BeanDefinition getBeanDefinition(String beanName);

    /**
     * 判断是否包含指定名称的BeanDefinition
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * Return the names of all beans defined in this registry.
     * <p>
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();


}
