package cn.edu.cqupt.educationfoundation.votingsystem.model.po;

import lombok.Data;
import lombok.ToString;

/**
 * @author :DengSiYuan
 * @date :2019/10/25 20:23
 * @desc :
 */
@Data
@ToString
public class AdminPo {

    private Integer userId;
    private String adminName;
    private String password;

}
