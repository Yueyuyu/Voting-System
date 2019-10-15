package cn.edu.cqupt.educationfoundation.votingsystem.util;

import cn.edu.cqupt.educationfoundation.votingsystem.common.excepction.ServerException;
import cn.edu.cqupt.educationfoundation.votingsystem.common.response.Response;
import cn.edu.cqupt.educationfoundation.votingsystem.common.response.ResponseEntity;
import cn.edu.cqupt.educationfoundation.votingsystem.common.response.ResponseStatu;

import java.util.function.Consumer;

/**
 * @author :DengSiYuan
 * @date :2019/10/14 23:00
 * @desc : 服务工具类
 */
public class ServiceUtil {

    public static ResponseEntity checkServerExecuteFailResponseEntity(boolean flag) {
        if (!flag) {
            return new ResponseEntity<>(ResponseStatu.SERVER_FAIL, "服务器错误", null);
        }
        return new ResponseEntity<>( ResponseStatu.SUCCESS, Response.SUCCESSFUL,null);
    }

    public static ResponseEntity checkThreeServiceFailResponseEntity(boolean flag, String msg){
        if (!flag) {
            return new ResponseEntity<>(ResponseStatu.THREE_SERVICE_FAIL, msg, null);
        }
        return new ResponseEntity<>( ResponseStatu.SUCCESS, Response.SUCCESSFUL,null);
    }

    public static ResponseEntity checkAuthenticationFailResponseEntity(boolean flag, String msg) {
        if (!flag) {
            return new ResponseEntity<>(ResponseStatu.AUTHENTICATION_FAIL, msg, null);
        }
        return new ResponseEntity<>( ResponseStatu.SUCCESS, Response.SUCCESSFUL,null);
    }

    public static ResponseEntity checkUserOperationFailResponseEntity(boolean flag, String msg) {
        if (!flag) {
            return new ResponseEntity<>(ResponseStatu.USER_OPERATION_ERROR, msg, null);
        }
        return new ResponseEntity<>( ResponseStatu.SUCCESS, Response.SUCCESSFUL,null);
    }

    public static ResponseEntity serverExecuteFailResponseEntity() {
        return new ResponseEntity<>(ResponseStatu.SERVER_FAIL, "响应服务器错误", null);
    }

    public static ResponseEntity threeServiceFailResponseEntity(String msg){
        return new ResponseEntity<>(ResponseStatu.THREE_SERVICE_FAIL, msg, null);
    }

    public static ResponseEntity authenticationFailResponseEntity(String msg) {
        return new ResponseEntity<>(ResponseStatu.AUTHENTICATION_FAIL, msg, null);
    }

    public static ResponseEntity userOperationFailResponseEntity(String msg) {
        return new ResponseEntity<>(ResponseStatu.USER_OPERATION_ERROR, msg, null);
    }

    public static void checkSqlExecuted(boolean... flags) {
        for (boolean flag : flags) {
            if (!flag) {
                throw new ServerException("数据库事务错误");
            }
        }

    }

    public static <T> void checkSqlExecuted(boolean flag, T t, Consumer<T> consumer) {
        if (!flag) {
            consumer.accept(t);
            throw new ServerException("服务器错误");
        }
    }

}
