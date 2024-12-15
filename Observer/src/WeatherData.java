class WeatherData {
    private String city;
    private String weather;
    private double temperature;

    public WeatherData(String city, String weather, double temperature) {
        this.city = city;
        this.weather = weather;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Город: " + city + ", Погода: " + weather + ", Температура: " + temperature + "°C";
    }
}