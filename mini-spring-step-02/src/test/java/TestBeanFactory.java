import zzz.springframework.beans.factory.config.BeanDefinition;
import zzz.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author zhangzhongzhen wrote on 2023/9/4
 * @version 1.0
 */
public class TestBeanFactory {


    public static void main(String[] args) {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        System.out.println(userService);
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
        System.out.println(userService_singleton);
    }


}
