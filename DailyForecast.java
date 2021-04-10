package Homework6;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DailyForecast {
    private String date;
    Temperature TemperatureObject;
    Day DayObject;
    Night NightObject;

    public DailyForecast() {
    }

    @JsonGetter ("Date")
    public String getDate() {
        return date;
    }

    @JsonGetter ("Temperature")
    public Temperature getTemperatureObject() {
        return TemperatureObject;
    }

    @JsonGetter ("Day")
    public Day getDayObject() {
        return DayObject;
    }

    @JsonGetter ("Night")
    public Night getNightObject() {
        return NightObject;
    }

    public void setDate(String date) {
        String dateShort = date.substring(0,10);
        this.date = dateShort;
    }

    public void setTemperatureObject(Temperature temperatureObject) {
        TemperatureObject = temperatureObject;
    }

    public void setDayObject(Day dayObject) {
        DayObject = dayObject;
    }

    public void setNightObject(Night nightObject) {
        NightObject = nightObject;
    }

    @Override
    public String toString() {
        return '\n' + "Прогноз на " + date + TemperatureObject + DayObject + NightObject;
    }
}
