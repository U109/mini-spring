import zzz.springframework.beans.BeansException;
import zzz.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author zhangzhongzhen wrote on 2023/9/6
 * @version 1.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
