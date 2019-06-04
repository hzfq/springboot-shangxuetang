package hzfq.quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月4日
 */
public class QuartzMain {

    public static void main(String[] args) throws SchedulerException {
        // 1.创建Job对象
        JobDetail job = JobBuilder.newJob(QuartzJob.class).build();

        /**
         * simple trigger:通过Quartz提供的方法完成简单的重复调用
         * <p>
         * cron trigger:根据cron表达式指定调度时间
         */
        // 2.创建Trigger对象
//        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(2))
//                .forJob(job).build();
        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ? *"))
                .forJob(job).build();

        // 3.创建Scheduler对象
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.scheduleJob(job, trigger);

        // 4.启动调度器
        scheduler.start();
    }
}
