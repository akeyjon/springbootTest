package webService;

import javax.jws.WebService;

@WebService
public interface WeatherInterface {

    String querryWeather(String location);
}
