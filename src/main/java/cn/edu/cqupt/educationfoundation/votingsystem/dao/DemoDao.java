package cn.edu.cqupt.educationfoundation.votingsystem.dao;

import org.springframework.stereotype.Repository;

/**
 * @author :DengSiYuan
 * @date :2019/10/15 8:59
 * @desc : demo的dao接口层
 */
@Repository
public interface DemoDao {

    /**
     * 插入新的Demo
     * @return
     */
    Boolean insertDemo();
}
