package hzfq.exception.exception;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

/**
 * 利用{@code SimpleMappingExceptionResolver}全局异常处理,无法传递错误异常信息
 * 
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@Configuration
public class GlobalException {

    /**
     * 该方法返回值必须是{@code SimpleMappingExceptionResolver}
     * 
     * @return
     */
    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();

        // key为异常全类名,value为错误视图名
        Properties mappings = new Properties();
        mappings.setProperty("java.lang.ArithmeticException", "error1");
        mappings.setProperty("java.lang.NullPointerException", "error2");

        resolver.setExceptionMappings(mappings); // 映射异常类名和错误视图名
        return resolver;
    }
}
