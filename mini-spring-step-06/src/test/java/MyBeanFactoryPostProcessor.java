import zzz.springframework.beans.BeansException;
import zzz.springframework.beans.PropertyValue;
import zzz.springframework.beans.PropertyValues;
import zzz.springframework.beans.factory.ConfigurableListableBeanFactory;
import zzz.springframework.beans.factory.config.BeanDefinition;
import zzz.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}