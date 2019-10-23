package apple.pangzi.weatcher.service;

import apple.pangzi.weather.api.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class TestServiceImpl implements TestService {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
