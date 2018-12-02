package webService;

import javax.jws.WebService;

@WebService
public class WeatherInterfaceImp implements WeatherInterface{

    @Override
    public String querryWeather(String location) {
        // TODO Auto-generated method stub
        System.out.println("获取到的城市名称：" + location);
        String weather = "晴天";
        return weather;
    }

}
