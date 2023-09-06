package zzz.springframework.context;

import zzz.springframework.beans.BeansException;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 * @description:
 */
public interface ConfigurableApplicationContext  extends ApplicationContext{

    /**
     * 刷新容器
     */
    void refresh() throws BeansException;

}
