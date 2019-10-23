package apple.pangzi.weather.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("/v1/life-weather")
public interface WeatherService {

    @GetMapping("/weather")
    String getWeather();
}
