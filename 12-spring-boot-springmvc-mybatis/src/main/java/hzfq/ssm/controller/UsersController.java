package hzfq.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import hzfq.ssm.domain.Users;
import hzfq.ssm.service.UsersService;

/**
 *
 * @author huzhifengqing
 * @email huzhifengqing@qq.com
 * @data 2019年6月2日
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 页面跳转
     * 
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

    /**
     * 添加用户
     * 
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(Users users) {
        usersService.addUser(users);
        return "ok";
    }

    /**
     * 查询全部用户
     * 
     * @param model
     * @return
     */
    @RequestMapping("/findUserAll")
    public String findUserAll(Model model) {
        List<Users> users = usersService.findUserAll();
        model.addAttribute("list", users);
        return "showUsers";
    }

    /**
     * 根据ID查询用户
     * 
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/findUserById")
    public String findUserById(Integer id, Model model) {
        Users user = usersService.findUserById(id);
        model.addAttribute("user", user);
        return "updateUser";
    }

    /**
     * 更新用户
     * 
     * @param users
     * @return
     */
    @RequestMapping("/editUser")
    public String editUser(Users users) {
        usersService.updateUser(users);
        return "ok";
    }

    /**
     * 删除用户
     * 
     * @param id
     * @return
     */
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer id) {
        usersService.deleteUserById(id);
        return "redirect:/users/findUserAll";
    }
}
