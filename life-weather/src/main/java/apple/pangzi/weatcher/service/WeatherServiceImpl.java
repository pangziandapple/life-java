package apple.pangzi.weatcher.service;

import apple.pangzi.weather.api.service.WeatherService;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Override
    public String getWeather() {
        return "v1";
    }
}
