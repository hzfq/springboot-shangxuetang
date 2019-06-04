package hzfq.quartz.scheduler;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import hzfq.quartz.service.UserService;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月4日
 */
public class CustomJob implements Job {

    @Autowired
    private UserService userService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 在业务类中注入业务方法，直接注入会有异常，需要实现AdaptableJobFactory类
        userService.addUser();
        System.out.println("Executing..." + new Date());
    }

}
