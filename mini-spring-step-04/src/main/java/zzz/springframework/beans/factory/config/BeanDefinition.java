package zzz.springframework.beans.factory.config;

import zzz.springframework.beans.PropertyValues;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:37
 * @description:
 */
@SuppressWarnings({"rawtypes"}) //告诉编译器忽略与原始类型（raw type）相关的警告信息。
public class BeanDefinition {


    private Class beanClass;
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
