package cn.edu.cqupt.educationfoundation.votingsystem.model.po;

import lombok.Data;
import lombok.ToString;

/**
 * @author :DengSiYuan
 * @date :2019/10/25 11:13
 * @desc :
 */
@Data
@ToString
public class ActivityPo {

    private Integer activityId;
    private String title;
    private String introduction;
    private String detail;
    private Integer createUserId;
    private String createTime;
    private String deadLine;
    private Integer condition;

}
