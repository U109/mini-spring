package zzz.springframework.beans.factory.config;

import zzz.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 * @description: 允许自定义修改 BeanDefinition 属性信息
 *
 * Allows for custom modification of an application context's bean definitions,adapting the
 * bean property values of the context's underlying bean factory
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在 BeanFactory 加载 BeanDefinition 之后，实例化 Bean 之前调用
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory);
}
