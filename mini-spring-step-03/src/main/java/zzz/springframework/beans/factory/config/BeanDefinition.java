package zzz.springframework.beans.factory.config;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:37
 * @description:
 */
@SuppressWarnings({"rawtypes"}) //告诉编译器忽略与原始类型（raw type）相关的警告信息。
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
