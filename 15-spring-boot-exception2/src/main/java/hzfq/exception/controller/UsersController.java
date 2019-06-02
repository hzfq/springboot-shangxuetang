package hzfq.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@Controller
public class UsersController {

    @RequestMapping("/showUser1")
    public String showUser1() {
        String content = null;
        content.length();
        return "index";
    }

    @RequestMapping("/showUser2")
    public String showUser2() {
        int a = 10 / 0;
        return "index";
    }
}
