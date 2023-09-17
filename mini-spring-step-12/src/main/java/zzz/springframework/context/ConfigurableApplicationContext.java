package zzz.springframework.context;

import zzz.springframework.beans.BeansException;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 * @description:
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     */
    void refresh() throws BeansException;

    /**
     * 虚拟机关闭钩子注册调用销毁方法
     */
    void registerShutdownHook();

    /**
     * 手动执行关闭
     */
    void close();

}
