package zzz.springframework.context.support;

import zzz.springframework.beans.BeansException;
import zzz.springframework.beans.factory.ConfigurableListableBeanFactory;
import zzz.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 * @description: 获取 Bean 工厂和加载资源
 * 获取了 DefaultListableBeanFactory的实例化以及对资源配置的加载操作,在加载完成后即可完成对
 * spring.xml 配置文件中 Bean 对象的定义和注册，同时也包括实现了接口BeanFactoryPostProcessor、BeanPostProcessor 的配置 Bean 信息。
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
