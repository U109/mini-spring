package zzz.springframework.beans.factory.support;

import zzz.springframework.beans.BeansException;
import zzz.springframework.core.io.Resource;
import zzz.springframework.core.io.ResourceLoader;

/**
 * @author zhangzhongzhen wrote on 2023/9/5
 * @version 1.0
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource);

    void loadBeanDefinitions(Resource... resources);

    void loadBeanDefinitions(String location);

    void loadBeanDefinitions(String... locations) throws BeansException;

}
