package zzz.springframework.beans.factory.support;

import zzz.springframework.beans.factory.BeanFactory;
import zzz.springframework.beans.factory.config.BeanDefinition;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:39
 * @description: 抽象类定义模板方法
 *
 * AbstractBeanFactory 首先继承了 DefaultSingletonBeanRegistry，也就具备了使用
 * 单例注册类方法。
 *
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);
}
