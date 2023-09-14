import org.junit.Test;
import zzz.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangzhongzhen wrote on 2023/9/14
 * @version 1.0
 * @description:
 */
public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }

}
