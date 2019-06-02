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
public class ExceptionController {

    @RequestMapping("/show1")
    public String show1() {
        String content = null;
        content.length();
        return "index";
    }

    @RequestMapping("/show2")
    public String show2() {
        int a = 10 / 0;
        return "index";
    }

    @RequestMapping("/show3")
    public String show3() throws Exception {
        throw new Exception("自定义异常测试");
    }

}
