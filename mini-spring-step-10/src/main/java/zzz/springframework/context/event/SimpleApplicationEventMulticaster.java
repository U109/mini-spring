package zzz.springframework.context.event;

import zzz.springframework.beans.factory.BeanFactory;
import zzz.springframework.context.ApplicationEvent;
import zzz.springframework.context.ApplicationListener;

/**
 * @author zhangzhongzhen wrote on 2023/9/14
 * @version 1.0
 * @description:
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }

}