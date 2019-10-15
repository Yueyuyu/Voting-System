package cn.edu.cqupt.educationfoundation.votingsystem.controller;

import cn.edu.cqupt.educationfoundation.votingsystem.common.response.Response;
import cn.edu.cqupt.educationfoundation.votingsystem.common.response.ResponseEntity;
import cn.edu.cqupt.educationfoundation.votingsystem.common.response.ResponseStatu;
import cn.edu.cqupt.educationfoundation.votingsystem.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author :DengSiYuan
 * @date :2019/10/15 8:54
 * @desc : Demo控制层
 */
@Slf4j
@Api("Demo模块")
@RequestMapping("demo")
@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @ApiOperation("获取所有demo")
    @GetMapping("allDemos")
    public ResponseEntity createCourse( ){
        return new ResponseEntity<>(ResponseStatu.SUCCESS, Response.SUCCESSFUL,demoService.allDemos());
    }


}
