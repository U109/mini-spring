package zzz.springframework.beans.factory.config;

import zzz.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author zhangzhongzhen wrote on 2023/9/5
 * @version 1.0
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";


    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

}
