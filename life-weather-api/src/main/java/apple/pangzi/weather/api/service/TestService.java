package apple.pangzi.weather.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("test")
public interface TestService {

    @GetMapping("/test")
    String test();
}
