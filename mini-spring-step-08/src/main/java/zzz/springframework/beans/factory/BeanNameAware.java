package zzz.springframework.beans.factory;

/**
 * @author zhangzhongzhen wrote on 2023/9/12
 * @version 1.0
 * @description:
 */
public interface BeanNameAware extends Aware {

    void setBeanName(String name);

}