package zzz.springframework.beans.factory;

/**
 * @author zhangzhongzhen wrote on 2023/9/13
 * @version 1.0
 * @description:
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();

}