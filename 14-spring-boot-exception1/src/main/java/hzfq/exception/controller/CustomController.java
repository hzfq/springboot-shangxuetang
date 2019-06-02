package hzfq.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 异常处理：自定义错误页面
 * <p>
 * 默认处理异常机制：抛出异常后向/error发送请求，由{@code BasicErrorController}处理/error请求,
 * 
 * 并跳转到默认异常页面展示异常信息,自定义页面必须为{@code error.html}
 * 
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@Controller
public class CustomController {

    @RequestMapping("/show1")
    public String show1() {
        String content = null;
        content.length();
        return "index";
    }

}
