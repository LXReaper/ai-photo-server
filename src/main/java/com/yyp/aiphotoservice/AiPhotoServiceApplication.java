package com.yyp.aiphotoservice;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@MapperScan("com.yyp.aiphotoservice.mapper")
@SpringBootApplication(exclude = {
})
public class AiPhotoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiPhotoServiceApplication.class, args);
    }

}
