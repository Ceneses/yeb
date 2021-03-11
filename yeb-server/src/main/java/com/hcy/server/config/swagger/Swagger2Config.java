package com.hcy.server.config.swagger;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Swagger2Config
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2021/3/11 15:51
 * @Version 1.0
 **/
@Configuration
@EnableSwagger2
public class Swagger2Config {
    private String VERSION = "v 1.0";

    @Bean
    public Docket bookApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(bookApiInfo())
                .select()
                //扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.hcy.server.controller"))
                .paths(PathSelectors.any())
                .build()
                .securityContexts(securityContexts())
                .securitySchemes(securitySchemes());
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo bookApiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("云E办接口文档")
                //描述
                .description("云E办接口文档")
                .contact(new Contact("HCY","https://www.weishare.club/index.html","wo51study@163.com"))
                //版本号
                .version(VERSION)
                .build();
    }

    private List<ApiKey> securitySchemes(){
        /**
         * 设置请求头信息
         */
        List<ApiKey> result = new ArrayList<>();
        ApiKey apiKey = new ApiKey("Authorization", "Authorization", "Header");
        result.add(apiKey);
        return result;
    }

    /**
     * 设置需要登录认证的路径
     * @return
     */
    private List<SecurityContext> securityContexts(){
        ArrayList<SecurityContext> securityContexts = new ArrayList<>();
        securityContexts.add(getContextByPath("/hello/.*"));
        return securityContexts;
    }

    private SecurityContext getContextByPath(String pathRegex) {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex(pathRegex))
                .build();
    }

    private List<SecurityReference> defaultAuth() {
        List<SecurityReference> securityReferences = new ArrayList<>();
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        securityReferences.add(new SecurityReference("Authorization",authorizationScopes));
        return securityReferences;
    }
}
