package cn.edu.cqupt.educationfoundation.votingsystem.common.excepction;

/**
 * @author :DengSiYuan
 * @date :2019/10/14 23:00
 * @desc : 上传文件自定义异常
 */
public class UploadException extends RuntimeException {

    public UploadException(String msg) {
        super(msg);
    }

}
