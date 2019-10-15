package cn.edu.cqupt.educationfoundation.votingsystem.common.response;

/**
 * @author :DengSiYuan
 * @date :2019/10/14 23:00
 * @desc : 响应码
 */
public interface ResponseStatu {
    int SERVER_FAIL = 0;
    int SUCCESS = 1;
    int THREE_SERVICE_FAIL = 2;
    int AUTHENTICATION_FAIL = 3;
    int USER_OPERATION_ERROR = 4;
    int UPLOAD_FAIL = 5;
}