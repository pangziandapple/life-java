package apple.pangzi.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("apple.pangzi.user.mapper")
public class UserApplication {

    public static void main(String[] args) {
        new SpringApplication(UserApplication.class).run(args);
    }
}
