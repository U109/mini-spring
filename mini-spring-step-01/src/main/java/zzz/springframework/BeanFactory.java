package zzz.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:09
 * @description:
 */
public class BeanFactory {

    private final Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name,beanDefinition);
    }
}
