package cn.edu.cqupt.educationfoundation.votingsystem.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :DengSiYuan
 * @date :2019/10/14 23:00
 * @desc : swagger接口文档配置类
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Value("${swagger2.enable}")
    private boolean enable;

    @Bean
    public Docket algorithmApis() {
        List<Parameter> pars = new ArrayList<>();
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars)
                .enable(enable)
                .useDefaultResponseMessages(false);
    }

    private ApiInfo createApiInfo() {
        return new ApiInfoBuilder().title("重庆邮电大学教育基金会投票系统接口文档")
                .contact(new Contact("GeniusDSY", "https://geniusdsy.github.io", "2208864697@qq.com"))
                .version("1.0")
                .build();
    }
}
