package zzz.springframework.beans.factory.config;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:37
 * @description:
 */
public class BeanDefinition {


    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
