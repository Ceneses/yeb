package com.hcy.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @ClassName YebApp
 * @Description //TODO
 * @Author Han ChengYi
 * @Date 2021/3/10 12:28
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan({"com.hcy.server.mapper"})
public class YebApp {
    public static void main(String[] args) {
        SpringApplication.run(YebApp.class,args);
    }
}
