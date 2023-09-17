package zzz.springframework.beans.factory.config;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:38
 * @description: 单例注册接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);

}
