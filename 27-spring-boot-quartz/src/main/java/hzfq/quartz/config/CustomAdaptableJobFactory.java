package hzfq.quartz.config;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月4日
 */
@Component("customAdaptableJobFactory")
public class CustomAdaptableJobFactory extends AdaptableJobFactory {

    // 可以将对象添加到IOC容器中,并完成对象注入
    @Autowired
    private AutowireCapableBeanFactory autowireCapableBeanFactory;

    // 将实例化的任务对象手动添加到IOC容器中并完成对象的注入
    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        Object object = super.createJobInstance(bundle);
        autowireCapableBeanFactory.autowireBean(object);
        return object;
    }
}
