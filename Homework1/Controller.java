package Homework6;

import java.io.IOException;

public class Controller {
    AccuweatherModel weatherModel = new AccuweatherModel();

    public void getWeather(String command, String selectedCity) throws IOException {
        switch (Functionality.fromValue(command)){
            case GET_CURRENT_WEATHER:
                weatherModel.getWeather(Period.NOW, selectedCity);
                break;
            case GET_WEATHER_IN_NEXT_FIVE_DAYS:
                weatherModel.getWeather(Period.FIVE_DAYS, selectedCity);
                break;
        }
    }


}
