package hzfq.exception.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理
 * 
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@ControllerAdvice
public class GlobalException {

    /**
     * 返回{@code ModelAndView}用于封装异常信息和视图的指定
     * 
     * 适用于全部的Controller
     * 
     * @param exception 将异常信息注入方法中
     * @return
     */
    @ExceptionHandler(value = { java.lang.ArithmeticException.class }) // 指定方法可以处理的异常
    public ModelAndView arithmeticExceptionHandler(Exception exception) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("err", exception.toString());
        mv.setViewName("error1");
        return mv;
    }

    /**
     * 返回{@code ModelAndView}用于封装异常信息和视图的指定
     * 
     * @param exception 将异常信息注入方法中
     * @return
     */
    @ExceptionHandler(value = { java.lang.NullPointerException.class }) // 指定方法可以处理的异常
    public ModelAndView nullPointerExceptionHandler(Exception exception) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("err", exception.toString());
        mv.setViewName("error2");
        return mv;
    }
}
