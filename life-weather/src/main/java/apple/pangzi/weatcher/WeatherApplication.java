package apple.pangzi.weatcher;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WeatherApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(WeatherApplication.class).run(args);
    }
}
