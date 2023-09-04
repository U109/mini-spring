package zzz.springframework.beans.factory.support;

import zzz.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:40
 * @description:
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String,Object> singletonObjectMap = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjectMap.get(beanName);
    }

    protected void addSingleton(String beanName,Object singletonObject){
        singletonObjectMap.put(beanName,singletonObject);
    }

}
