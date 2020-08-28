package com.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.run.dao")
public class RunControllerApp {
    public static void main(String[] args) {
        SpringApplication.run(RunControllerApp.class,args);
    }
}
