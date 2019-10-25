package cn.edu.cqupt.educationfoundation.votingsystem.model.po;

import lombok.Data;
import lombok.ToString;

/**
 * @author :DengSiYuan
 * @date :2019/10/25 20:47
 * @desc :
 */
@Data
@ToString
public class VoteOptionPo {

    private Integer optionId;
    private Integer activityId;
    private String contributor;
    private String introduction;
    private String content;
    private Integer amount;

}
