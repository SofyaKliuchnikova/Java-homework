package Homework6.entity;

public class DailyForecastModelForDB {
    //(id integer primary key autoincrement, city text, localdate text, tempMin real, tempMax real, textDay text, textNight text);
    private String city;
    private String localDate;
    private double tempMin;
    private double tempMax;
    private String textDay;
    private String textNight;

    public DailyForecastModelForDB() {
    }

    public DailyForecastModelForDB(String city, String localDate, double tempMin, double tempMax, String textDay, String textNight) {
        this.city = city;
        this.localDate = localDate;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.textDay = textDay;
        this.textNight = textNight;
    }

    public String getCity() {
        return city;
    }

    public DailyForecastModelForDB setCity(String city) {
        this.city = city;
        return this;
    }

    public String getLocalDate() {
        return localDate;
    }

    public DailyForecastModelForDB setLocalDate(String localDate) {
        this.localDate = localDate;
        return this;
    }

    public double getTempMin() {
        return tempMin;
    }

    public DailyForecastModelForDB setTempMin(double tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    public double getTempMax() {
        return tempMax;
    }

    public DailyForecastModelForDB setTempMax(double tempMax) {
        this.tempMax = tempMax;
        return this;
    }

    public String getTextDay() {
        return textDay;
    }

    public DailyForecastModelForDB setTextDay(String textDay) {
        this.textDay = textDay;
        return this;
    }

    public String getTextNight() {
        return textNight;
    }

    public DailyForecastModelForDB setTextNight(String textNight) {
        this.textNight = textNight;
        return this;
    }
}
