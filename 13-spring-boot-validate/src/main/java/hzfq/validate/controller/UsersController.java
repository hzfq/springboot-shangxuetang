package hzfq.validate.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import hzfq.validate.domain.Users;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@Controller
public class UsersController {

    @RequestMapping("/addUser")
    public String showPage(@ModelAttribute("u") Users users) {
        return "addUser";
    }

    /**
     * 添加用户
     * 
     * @param users         @Valid 开启对Users对象的校验
     * @param bindingResult 封装校验结果
     * @return
     */
    @RequestMapping("/save")
    public String save(@ModelAttribute("u") @Valid Users users, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addUser";
        }
        System.out.println(users);
        return "ok";
    }
}
