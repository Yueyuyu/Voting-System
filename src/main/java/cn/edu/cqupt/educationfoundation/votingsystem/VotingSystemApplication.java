package cn.edu.cqupt.educationfoundation.votingsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author :DengSiYuan
 * @date :2019/10/15 8:54
 * @desc : 启动入口
 */
@MapperScan(basePackages = "cn.edu.cqupt.educationfoundation.votingsystem.dao")
@SpringBootApplication
public class VotingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(VotingSystemApplication.class, args);
    }

}
