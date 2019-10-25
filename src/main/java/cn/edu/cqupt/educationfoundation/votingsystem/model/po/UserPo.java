package cn.edu.cqupt.educationfoundation.votingsystem.model.po;

import lombok.Data;
import lombok.ToString;

/**
 * @author :DengSiYuan
 * @date :2019/10/25 20:24
 * @desc :
 */
@Data
@ToString
public class UserPo {

    private Integer userId;
    private String openId;
    private String nickName;
    private String country;
    private String province;
    private String city;
    private String avatarUrl;
    private String registerTime;
    private Integer age;
    private Integer gender;
    private Integer isDisabled;

}
