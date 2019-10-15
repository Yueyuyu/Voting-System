package cn.edu.cqupt.educationfoundation.votingsystem.util;


import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author :DengSiYuan
 * @date :2019/9/15 15:43
 * @desc : 随机编号的生成
 */
public class UUIDUtil {

    private static String getRandomString(){
        return UUID.randomUUID().toString().replace("-", "");
    }

}
