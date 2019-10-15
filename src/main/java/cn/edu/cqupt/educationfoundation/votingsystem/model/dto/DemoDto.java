package cn.edu.cqupt.educationfoundation.votingsystem.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author :DengSiYuan
 * @date :2019/10/15 9:00
 * @desc : demo前端传入数据模型
 */
@Data
@ToString
@ApiModel(value = "demoDto",description = "demo前端传入数据模型")
public class DemoDto {

    @ApiModelProperty(name = "demoId",value = "demo编号",dataType = "int",required = true)
    private Integer demoId;

}
