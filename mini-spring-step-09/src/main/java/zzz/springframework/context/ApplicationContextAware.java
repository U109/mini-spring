package zzz.springframework.context;

import zzz.springframework.beans.BeansException;
import zzz.springframework.beans.factory.Aware;

/**
 * @author zhangzhongzhen wrote on 2023/9/12
 * @version 1.0
 * @description:
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
