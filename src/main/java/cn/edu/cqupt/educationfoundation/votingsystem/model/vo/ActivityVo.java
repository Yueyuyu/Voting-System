package cn.edu.cqupt.educationfoundation.votingsystem.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author :DengSiYuan
 * @date :2019/10/25 11:13
 * @desc :
 */
@ApiModel(value = "activityVo",description = "活动展示数据模型")
@Data
@ToString
public class ActivityVo {

    @ApiModelProperty(name = "activityId",value = "活动id",dataType = "int")
    private Integer activityId;
    @ApiModelProperty(name = "title",value = "活动标题",dataType = "string")
    private String title;
    @ApiModelProperty(name = "introduction",value = "活动简介",dataType = "string")
    private String introduction;
    @ApiModelProperty(name = "detail",value = "活动详情",dataType = "string")
    private String detail;
    @ApiModelProperty(name = "createUserId",value = "创建人id",dataType = "int")
    private Integer createUserId;
    @ApiModelProperty(name = "createTime",value = "创建时间",dataType = "string")
    private String createTime;
    @ApiModelProperty(name = "deadLine",value = "截止时间",dataType = "string")
    private String deadLine;
    @ApiModelProperty(name = "condition",value = "状态(创建时不传)",dataType = "int",allowEmptyValue = true)
    private Integer condition;

}
