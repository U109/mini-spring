import zzz.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @author zhangzhongzhen wrote on 2023/9/14
 * @version 1.0
 * @description:
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }

}