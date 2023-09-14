import zzz.springframework.context.ApplicationListener;
import zzz.springframework.context.event.ContextClosedEvent;

/**
 * @author zhangzhongzhen wrote on 2023/9/14
 * @version 1.0
 * @description:
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }

}
