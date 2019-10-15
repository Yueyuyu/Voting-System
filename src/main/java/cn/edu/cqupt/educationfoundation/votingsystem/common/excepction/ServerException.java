package cn.edu.cqupt.educationfoundation.votingsystem.common.excepction;

/**
 * @author :DengSiYuan
 * @date :2019/10/14 23:00
 * @desc : 服务器异常自定义异常
 */
public class ServerException extends RuntimeException {

    public ServerException(String msg) {
        super(msg);
    }

}
