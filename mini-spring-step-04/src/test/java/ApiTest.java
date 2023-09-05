/**
 * @author zhangzhongzhen wrote on 2023/9/5
 * @version 1.0
 */

import org.junit.Test;
import zzz.springframework.beans.PropertyValue;
import zzz.springframework.beans.PropertyValues;
import zzz.springframework.beans.factory.config.BeanDefinition;
import zzz.springframework.beans.factory.config.BeanReference;
import zzz.springframework.beans.factory.support.DefaultListableBeanFactory;

public class ApiTest {


    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        // 4. UserService 注入 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 5. UserService 获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
