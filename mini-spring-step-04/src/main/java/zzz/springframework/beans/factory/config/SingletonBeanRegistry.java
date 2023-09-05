package zzz.springframework.beans.factory.config;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:38
 * @description: 单例注册接口
 */
public interface SingletonBeanRegistry {

    //获取单例对象的接口
    Object getSingleton(String beanName);


}
