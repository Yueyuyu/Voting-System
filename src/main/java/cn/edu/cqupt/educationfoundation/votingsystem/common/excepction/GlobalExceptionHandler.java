package cn.edu.cqupt.educationfoundation.votingsystem.common.excepction;

import cn.edu.cqupt.educationfoundation.votingsystem.common.response.ResponseEntity;
import cn.edu.cqupt.educationfoundation.votingsystem.common.response.ResponseStatu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author :DengSiYuan
 * @date :2019/10/14 23:00
 * @desc : 全局异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServerException.class)
    public ResponseEntity sqlExecutedExceptionHandler(ServerException e) {
        log.error("ServerException->{}",e);
        return new ResponseEntity<>(ResponseStatu.SERVER_FAIL, e.getMessage(), null);
    }

    @ExceptionHandler(UploadException.class)
    public ResponseEntity uploadExceptionHandler(UploadException e) {
        log.error("UploadException->{}",e);
        return new ResponseEntity<>(ResponseStatu.UPLOAD_FAIL, e.getMessage(), null);
    }

}
