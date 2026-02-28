package top.devilben.messagetrees;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "top.devilben.messagetrees.mapper")
public class MessageTreesApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessageTreesApplication.class, args);
    }
}
