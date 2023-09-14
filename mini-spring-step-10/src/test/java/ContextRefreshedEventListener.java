import zzz.springframework.context.ApplicationListener;
import zzz.springframework.context.event.ContextRefreshedEvent;

/**
 * @author zhangzhongzhen wrote on 2023/9/14
 * @version 1.0
 * @description:
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }

}