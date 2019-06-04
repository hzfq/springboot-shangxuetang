package hzfq.scheduled.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月4日
 */
@Component
public class ScheduledDemo {

    /**
     * 定时方法：{@code @Scheduled}设置定时任务<br>
     * cron属性：cron表达式，定时任务触发时间的字符串表达形式<br>
     * 
     */
    @Scheduled(cron = "10,15 * * * * ?")
    public void scheduledMethod() {
        System.out.println("定时器被触发：" + new Date());
    }
}
