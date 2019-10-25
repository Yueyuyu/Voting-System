package cn.edu.cqupt.educationfoundation.votingsystem.model.po;

import lombok.Data;
import lombok.ToString;

/**
 * @author :DengSiYuan
 * @date :2019/10/25 20:54
 * @desc :
 */
@Data
@ToString
public class VoteRecordPo {

    private Integer voteId;
    private Integer activityId;
    private Integer voteOptionId;
    private String voteTime;
    private Integer voteUser;
    private String macAddress;
    private String ipAddress;
    private Integer status;

}
