package zzz.springframework.beans.factory;

import zzz.springframework.beans.BeansException;
import zzz.springframework.beans.factory.config.AutowireCapableBeanFactory;
import zzz.springframework.beans.factory.config.BeanDefinition;
import zzz.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
* @author zhangzhongzhen wrote on 2023/9/5
* @version 1.0
*/
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName);


    void preInstantiateSingletons() throws BeansException;

}