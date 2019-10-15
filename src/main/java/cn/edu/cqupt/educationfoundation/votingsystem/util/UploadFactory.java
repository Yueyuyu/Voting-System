package cn.edu.cqupt.educationfoundation.votingsystem.util;


import com.qiniu.util.Auth;

/**
 * @author :DengSiYuan
 * @date :2019/10/14 23:00
 * @desc : 上传文件工厂类
 */
public class UploadFactory {

    public static UploadUtil createUpload(String accessKey, String secretKeySpec, String bucketHostName, String bucketName) {
        Auth auth = Auth.create(accessKey, secretKeySpec);
        return new QiniuUtil(bucketHostName, bucketName, auth);
    }

}
