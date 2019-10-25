package cn.edu.cqupt.educationfoundation.votingsystem.model.po;

import lombok.Data;
import lombok.ToString;

/**
 * @author :DengSiYuan
 * @date :2019/10/25 20:20
 * @desc :
 */
@Data
@ToString
public class ActivityImagesPo {

    private Integer activityImageId;
    private Integer activityId;
    private String message;
    private String url;
}
