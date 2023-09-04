package zzz.springframework.beans.factory.support;

import zzz.springframework.beans.BeansException;
import zzz.springframework.beans.factory.config.BeanDefinition;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:39
 * @description: 实例化 Bean 类
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{


    @Override
    protected abstract BeanDefinition getBeanDefinition(String beanName);

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

}
