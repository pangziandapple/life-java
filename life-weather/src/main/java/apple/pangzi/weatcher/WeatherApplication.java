package apple.pangzi.weatcher;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class WeatherApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(WeatherApplication.class).run(args);
    }
}
