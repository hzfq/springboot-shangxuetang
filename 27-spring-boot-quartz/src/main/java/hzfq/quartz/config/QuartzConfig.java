package hzfq.quartz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

import hzfq.quartz.scheduler.CustomJob;

/**
 * 配置类
 * 
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月4日
 */
@Configuration
public class QuartzConfig {

    /**
     * 1.创建Job对象
     */
    @Bean
    public JobDetailFactoryBean job() {
        JobDetailFactoryBean job = new JobDetailFactoryBean();
        // 关联自己的Job类
        job.setJobClass(CustomJob.class);
        return job;
    }

    /**
     * 2.创建Trigger对象 simple trigger/cron trigger
     */
    @Bean
    public SimpleTriggerFactoryBean simpleTrigger(JobDetailFactoryBean job) {
        SimpleTriggerFactoryBean trigger = new SimpleTriggerFactoryBean();
        // 关联Job和Trigger
        trigger.setJobDetail(job.getObject());
        trigger.setRepeatInterval(1000); // 执行间隔的毫秒数
        trigger.setRepeatCount(10); // 执行重复次数,实际执行10+1次
        return trigger;
    }

    /**
     * CRON Trigger
     * 
     * @param job
     * @return
     */
    @Bean
    public CronTriggerFactoryBean cronTrigger(JobDetailFactoryBean job) {
        CronTriggerFactoryBean trigger = new CronTriggerFactoryBean();
        trigger.setJobDetail(job.getObject());
        trigger.setCronExpression("0/2 * * * * ?");
        return trigger;
    }

    /**
     * 3.创建Scheduler对象
     * 
     * @param trigger CronTriggerFactoryBean/SimpleTriggerFactoryBean
     */
    @Bean
    public SchedulerFactoryBean scheduler(CronTriggerFactoryBean trigger,
            CustomAdaptableJobFactory customAdaptableJobFactory) {
        SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
        // 关联trigger
        scheduler.setTriggers(trigger.getObject());
        scheduler.setJobFactory(customAdaptableJobFactory);
        return scheduler;
    }
}
