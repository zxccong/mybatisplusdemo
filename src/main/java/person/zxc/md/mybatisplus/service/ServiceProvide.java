package person.zxc.md.mybatisplus.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zxccong
 * @date 2020/1/7
 */
@Getter
@Setter
@Component
public class ServiceProvide {

    @Autowired
    private UserService userService;
}
