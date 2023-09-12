package zzz.springframework.context.support;

import zzz.springframework.beans.factory.support.DefaultListableBeanFactory;
import zzz.springframework.beans.factory.xml.XmlBeanDefinitionReader;
/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 * @description: 上下文中对配置信息的加载
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
