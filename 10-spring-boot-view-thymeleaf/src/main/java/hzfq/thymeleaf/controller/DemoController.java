package hzfq.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author huzhifengqing@qq.com
 * @since 2018年12月1日 上午9:11:23
 */
@Controller
public class DemoController {

	@RequestMapping(value = "/show")
	public String showInfo(Model model) {
		model.addAttribute("msg", "thymeleaf 第一个案例");
		return "index";
	}
}
