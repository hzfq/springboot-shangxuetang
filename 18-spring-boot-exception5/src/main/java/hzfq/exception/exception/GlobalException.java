package hzfq.exception.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 利用{@code HandlerExceptionResolver}处理全局异常
 * 
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@Configuration
public class GlobalException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
            Exception ex) {
        ModelAndView mv = new ModelAndView();

        // 判断异常类型做视图跳转
        if (ex instanceof ArithmeticException) {
            mv.setViewName("error1");
        } else if (ex instanceof NullPointerException) {
            mv.setViewName("error2");
        } else {
            mv.setViewName("error");
        }
        mv.addObject("err", ex.toString());

        return mv;
    }

}
