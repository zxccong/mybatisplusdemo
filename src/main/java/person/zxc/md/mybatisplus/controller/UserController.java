package person.zxc.md.mybatisplus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import person.zxc.md.mybatisplus.service.ServiceProvide;
import person.zxc.md.mybatisplus.service.UserService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zxccong
 * @since 2020-01-07
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ServiceProvide serviceProvide;

    @GetMapping("/test")
    public String test() {
        return serviceProvide.getUserService().getTest();
    }
	
}
