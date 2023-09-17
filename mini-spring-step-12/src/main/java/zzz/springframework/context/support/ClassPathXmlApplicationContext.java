package zzz.springframework.context.support;

import zzz.springframework.beans.BeansException;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 * @description: XML 文件应用上下文
 *
 * ClassPathXmlApplicationContext，是具体对外给用户提供的应用上下文方法。
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{

    private String[] configLocations;

    public ClassPathXmlApplicationContext() {
    }

    /**
     * 从 XML 中加载 BeanDefinition，并刷新上下文
     */
    public ClassPathXmlApplicationContext(String configLocations) throws BeansException {
        this(new String[]{configLocations});
    }

    /**
     * 从 XML 中加载 BeanDefinition，并刷新上下文
     */
    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }

}
