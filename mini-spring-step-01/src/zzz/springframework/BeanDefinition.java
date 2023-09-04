package zzz.springframework;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:09
 * @description:
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
