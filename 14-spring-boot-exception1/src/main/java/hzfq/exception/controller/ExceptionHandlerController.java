package hzfq.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@Controller
public class ExceptionHandlerController {

    @RequestMapping("/show2")
    public String show2() {
        int a = 10 / 0;
        return "index";
    }

    /**
     * 返回{@code ModelAndView}用于封装异常信息和视图的指定
     * 
     * 不能跨Controller处理异常
     * 
     * @param exception 将异常信息注入方法中
     * @return
     */
    @ExceptionHandler(value = { java.lang.ArithmeticException.class }) // 指定方法可以处理的异常
    public ModelAndView arithmeticExceptionHandler(Exception exception) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("err", exception.toString());
        mv.setViewName("eh");
        return mv;
    }
}
