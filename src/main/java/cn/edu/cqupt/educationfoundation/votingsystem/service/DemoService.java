package cn.edu.cqupt.educationfoundation.votingsystem.service;

import cn.edu.cqupt.educationfoundation.votingsystem.model.vo.DemoVo;
import org.springframework.stereotype.Service;

/**
 * @author :DengSiYuan
 * @date :2019/10/15 9:04
 * @desc : demo服务层接口
 */
@Service
public interface DemoService {

    /**
     * 查询所有Demo
     * @return
     */
    DemoVo allDemos();

}
