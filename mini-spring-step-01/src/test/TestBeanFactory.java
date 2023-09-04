package test;

import zzz.springframework.BeanDefinition;
import zzz.springframework.BeanFactory;

/**
 * @author: Zzz
 * @date: 2023/9/4 17:15
 * @description:
 */
public class TestBeanFactory {

    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
