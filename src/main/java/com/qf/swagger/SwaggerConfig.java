package com.qf.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //配置Swagger的Bean实例
    @Bean
    public Docket creatDocket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    //配置API的基本信息
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("网易云音乐")//测试API文档的文档标题
                .description("接口")//测试API文档的文档描述
                .termsOfServiceUrl("")//跳转的链接，可以写我的博客地址
                .version("1.0")//版本号
                .build();
    }
}
