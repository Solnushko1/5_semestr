import java.util.HashMap;
import java.util.Map;
class WeatherService {
    public EventManager events;
    private Map<String, WeatherData> weatherDataMap;

    public WeatherService() {
        this.events = new EventManager("weather_update");
        this.weatherDataMap = new HashMap<>();
    }

    public void updateWeather(String city, String weather, double temperature) {
        WeatherData data = new WeatherData(city, weather, temperature);
        weatherDataMap.put(city, data);
        System.out.println("\nОбновлена погода в городе " + city + ": " + weather + ", " + temperature + "°C");
        events.notify("weather_update", data.toString(), city);
    }

}