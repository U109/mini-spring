package zzz.springframework.beans.factory;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:40
 * @description:
 */
public interface BeanFactory {

    Object getBean(String beanName);

    Object getBean(String name, Object... args);

    //按照类型获取 Bean
    <T> T getBean(String name, Class<T> requiredType);
}
