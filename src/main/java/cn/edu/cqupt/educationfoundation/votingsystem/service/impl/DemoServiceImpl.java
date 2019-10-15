package cn.edu.cqupt.educationfoundation.votingsystem.service.impl;

import cn.edu.cqupt.educationfoundation.votingsystem.dao.DemoDao;
import cn.edu.cqupt.educationfoundation.votingsystem.model.vo.DemoVo;
import cn.edu.cqupt.educationfoundation.votingsystem.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author :DengSiYuan
 * @date :2019/10/15 9:06
 * @desc : Demo服务层实现类
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoDao demoDao;

    @Override
    public DemoVo allDemos(){
        //调用dao持久层产生的结果，使用Po模型接住 DemoPo demoPo = demoDao.insertDemo();
        //进行转型  DemoVo demoVo = TransformUtil.transformOne(demoPo,new DemoVo());
        //进行数据的处理之后进行返回；
        DemoVo demoVo = new DemoVo();
        demoVo.setDemoId(1);
        demoVo.setName("这是一个示例Demo接口");
        return demoVo;
    }

}
