package person.zxc.md.mybatisplus.model;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableLogic;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxccong
 * @since 2020-01-07
 */
@Data
@Accessors(chain = true)
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	private String id;
	private String nickname;
    /**
     * 真实姓名
     */
	@TableField("real_name")
	private String realName;
    /**
     * 密码
     */
	private String password;
    /**
     * 手机号
     */
	private String mobile;
    /**
     * 手机号区号
     */
	@TableField("area_code")
	private String areaCode;
    /**
     * 创建时间
     */
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
    /**
     * 更新时间
     */
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
    /**
     * 删除标识
     */
	@TableField(fill = FieldFill.INSERT)
    @TableLogic
	private Integer deleted;


	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
