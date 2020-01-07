package person.zxc.md.mybatisplus.service;

import person.zxc.md.mybatisplus.model.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zxccong
 * @since 2020-01-07
 */
public interface UserService extends IService<User> {

    String getTest();
	
}
