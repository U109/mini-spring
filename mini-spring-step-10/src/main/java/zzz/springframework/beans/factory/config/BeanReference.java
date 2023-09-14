package zzz.springframework.beans.factory.config;

/**
 * @author: Zzz
 * @date: 2023/9/5 16:23
 * @description: Bean 的引用
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
