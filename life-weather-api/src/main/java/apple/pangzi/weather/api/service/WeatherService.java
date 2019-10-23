package apple.pangzi.weather.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("life-weather")
public interface WeatherService {

    @GetMapping("/weather")
    String getWeather();
}
