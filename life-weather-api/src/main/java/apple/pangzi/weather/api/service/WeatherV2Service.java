package apple.pangzi.weather.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("life-weather")
public interface WeatherV2Service {

    @GetMapping("/weather/v2")
    String getWeather();
}
