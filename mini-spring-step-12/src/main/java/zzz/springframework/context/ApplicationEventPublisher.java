package zzz.springframework.context;

/**
 * @author zhangzhongzhen wrote on 2023/9/14
 * @version 1.0
 * @description: 事件发布者接口
 */
public interface ApplicationEventPublisher {

    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);
}
