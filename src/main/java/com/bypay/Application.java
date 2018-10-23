package com.bypay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by CC on 2017/8/18.
 */
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.bypay.controller"})
//@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />

@SpringBootApplication
@MapperScan(basePackages = {"com.bypay.dao"})//这样不用再每个mapper上加注解了
public class Application extends SpringBootServletInitializer {

/*    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class,args);
    }*/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder bulider){

    return bulider.sources(Application.class);
}

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
