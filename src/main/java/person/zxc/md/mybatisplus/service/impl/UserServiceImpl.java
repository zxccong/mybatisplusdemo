package person.zxc.md.mybatisplus.service.impl;

import person.zxc.md.mybatisplus.model.User;
import person.zxc.md.mybatisplus.mapper.UserMapper;
import person.zxc.md.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zxccong
 * @since 2020-01-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public String getTest() {
        return "success";
    }
}
