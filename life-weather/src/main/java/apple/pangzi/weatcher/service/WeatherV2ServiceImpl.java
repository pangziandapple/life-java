package apple.pangzi.weatcher.service;

import apple.pangzi.weather.api.service.WeatherV2Service;
import org.springframework.stereotype.Service;

@Service
public class WeatherV2ServiceImpl implements WeatherV2Service {
    @Override
    public String getWeather() {
        return "V1";
    }
}
