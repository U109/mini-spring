package zzz.springframework.beans.factory.config;

import zzz.springframework.beans.BeansException;
import zzz.springframework.beans.factory.BeanFactory;

/**
 * @author zhangzhongzhen wrote on 2023/9/5
 * @version 1.0
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
