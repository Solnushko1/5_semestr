public class WeatherApp {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();

        User alex = new User("Алексей", "Воронеж");
        User maria = new User("Мария", "Москва");
        User ivan = new User("Иван", "Воронеж");

        weatherService.events.subscribe("weather_update", alex);
        weatherService.events.subscribe("weather_update", maria);
        weatherService.events.subscribe("weather_update", ivan);

        weatherService.updateWeather("Воронеж", "Солнечно", 25.0);
        weatherService.updateWeather("Москва", "Облачно", 15.0);
        weatherService.updateWeather("Москва", "Дождь", 10.0);
        weatherService.updateWeather("Воронеж", "Дождь", 18.0);
    }
}
