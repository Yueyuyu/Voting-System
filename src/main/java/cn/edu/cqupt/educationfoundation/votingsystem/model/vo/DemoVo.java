package cn.edu.cqupt.educationfoundation.votingsystem.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author :DengSiYuan
 * @date :2019/10/15 9:01
 * @desc : demo展示数据模型
 */
@Data
@ToString
@ApiModel(value = "demo展示层数据模型",description = "demo展示数据模型")
public class DemoVo {

    @ApiModelProperty(name = "demoId",value = "demo的id",dataType = "int")
    private Integer demoId;
    @ApiModelProperty(name = "name",value = "demo名称",dataType = "string")
    private String name;

}
