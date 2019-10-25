package cn.edu.cqupt.educationfoundation.votingsystem.model.po;

import lombok.Data;
import lombok.ToString;

/**
 * @author :DengSiYuan
 * @date :2019/10/25 20:53
 * @desc :
 */
@Data
@ToString
public class VoteOptionFilePo {

    private Integer fileId;
    private Integer voteOptionId;
    private String fileUrl;

}
