package zzz.springframework.beans.factory.support;

import zzz.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author: Zzz
 * @date: 2023/9/5 10:39
 * @description: 实例化策略接口
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args);

}
