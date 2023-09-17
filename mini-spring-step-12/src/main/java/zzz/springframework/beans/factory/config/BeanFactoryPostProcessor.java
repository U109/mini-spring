package zzz.springframework.beans.factory.config;

import zzz.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 * @description: 允许自定义修改 BeanDefinition 属性信息
 *
 * 允许自定义修改应用程序上下文的bean定义，调整上下文的底层bean工厂的bean属性值
 * Allows for custom modification of an application context's bean definitions,adapting the bean property values of the context's underlying bean factory
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在 BeanFactory 加载 BeanDefinition 之后，实例化 Bean 之前调用.
     * 实现该接口，可以在 Spring 创建 bean 之前修改 bean 的定义属性。也就是说，
     * Spring 允许 BeanFactoryPostProcessor 在容器实例化 bean 之前读取配置元数据，
     * 并可以根据需要进行修改。例如可以把 bean 的 Scope 从 singleton 改为 prototype ，
     * 也可以把 property 的值给修改掉。
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory);
}
