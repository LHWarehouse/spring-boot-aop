package com.lh.pr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationTest {
    /**
     * 启动后，浏览器访问http://localhost:8080/user?name=zhangsan&age=18
     * 可以看到控制台打印的信息 包括接受的参数和响应的数据
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ApplicationTest.class,args);
    }
}
