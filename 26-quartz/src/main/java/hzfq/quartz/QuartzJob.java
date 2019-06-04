package hzfq.quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 定义任务类
 * 
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月4日
 */
public class QuartzJob implements Job {

    /**
     * 任务触发时执行的方法
     */
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Executing... " + new Date());
    }

}
