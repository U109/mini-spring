package zzz.springframework.beans.factory;

import zzz.springframework.beans.BeansException;

/**
 * @author zhangzhongzhen wrote on 2023/9/12
 * @version 1.0
 * @description:
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}