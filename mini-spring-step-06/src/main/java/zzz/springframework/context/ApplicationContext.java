package zzz.springframework.context;

import zzz.springframework.beans.factory.ListableBeanFactory;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 * @description: 上下文接口 ApplicationContext，继承于 ListableBeanFactory，也就继承了关于 BeanFactory方法，比如一些 getBean 的方法。
 */
public interface ApplicationContext extends ListableBeanFactory {
}
