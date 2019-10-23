package apple.pangzi.weather.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("/v2/life-weather")
public interface WeatherV2Service {

    @GetMapping("/weather")
    String getWeather();
}
