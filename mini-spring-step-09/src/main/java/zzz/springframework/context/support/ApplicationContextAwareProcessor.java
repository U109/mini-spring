package zzz.springframework.context.support;

import zzz.springframework.beans.BeansException;
import zzz.springframework.beans.factory.config.BeanPostProcessor;
import zzz.springframework.context.ApplicationContext;
import zzz.springframework.context.ApplicationContextAware;

/**
 * @author zhangzhongzhen wrote on 2023/9/12
 * @version 1.0
 * @description: 包装处理器
 * 由于 ApplicationContext 的获取并不能直接在创建 Bean 时候就可以拿到，所以需要在 refresh 操作时，把 ApplicationContext 写入到一个包装的
 * BeanPostProcessor 中去，再由AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsBeforeInitialization方法调用。
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}