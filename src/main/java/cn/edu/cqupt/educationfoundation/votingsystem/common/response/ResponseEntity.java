package cn.edu.cqupt.educationfoundation.votingsystem.common.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author :DengSiYuan
 * @date :2019/10/14 23:00
 * @desc : 响应实体类
 */
@Data
@NoArgsConstructor
@ApiModel
@Slf4j
public class ResponseEntity<T> {
    @ApiModelProperty("错误状态码") private int status;
    @ApiModelProperty("提示信息") private String msg;
    @ApiModelProperty("业务数据") private T object;

    public ResponseEntity(int status, String msg, T object) {
        this.status = status;
        this.msg = msg;
        this.object = object;
        log.error(status + msg + object);
    }
}
