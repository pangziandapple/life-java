package apple.pangzi.weatcher.service;

import apple.pangzi.weather.api.service.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "test";
    }
}
