package Homework6;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.rmi.server.RemoteRef;
import java.util.List;

public class AccuweatherModel {
    private static final String PROTOCOL = "http";
    private static final String API_KEY = "BgADgfAxi1eSeAG2eeUWYrHNL5Cwlocc";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String CURRENT_CONDITIONS_ENDPOINT = "currentconditions";
    private static final String API_V1 = "v1";
    private static final String LOCATIONS_ENDPOINT = "locations";
    private static final String CITIES_ENDPOINT = "cities";
    private static final String AUTOCOMPLETE_ENDPOINT = "autocomplete";
    private static final String FORECASTS_ENDPOINT = "forecasts";
    private static final String DAILY_ENDPOINT = "daily";
    private static final String FIVE_DAYS_ENDPOINT = "5day";



    public static final OkHttpClient okHttpClient = new OkHttpClient();
    public static final ObjectMapper objectMapper = new ObjectMapper();

    public void getWeather(Period period, String selectedCity) throws IOException {
        String cityKey = detectCityKey(selectedCity);
        if (period == Period.NOW) {
            HttpUrl httpUrl = new HttpUrl.Builder()
                    .scheme(PROTOCOL)
                    .host(BASE_HOST)
                    .addPathSegment(CURRENT_CONDITIONS_ENDPOINT)
                    .addPathSegment(API_V1)
                    .addPathSegment(cityKey)
                    .addQueryParameter("apikey", API_KEY)
                    .addQueryParameter("language", "ru-ru")
                    .build();
            Request request = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(httpUrl)
                    .build();
            Response response = okHttpClient.newCall(request).execute();
            String responseString = response.body().string();

            String forecastWeather =  objectMapper.readTree(responseString).get(0).at("/WeatherText").asText();
            String forecastTemperature =  objectMapper.readTree(responseString).get(0).at("/Temperature")
                    .at("/Metric").at("/Value").asText();
            System.out.println(forecastWeather + ". Текущая температура " + forecastTemperature + " градусов.");
        }

        if (period == Period.FIVE_DAYS){
            //дз со звездочкой
            HttpUrl httpUrl = new HttpUrl.Builder()
                    .scheme(PROTOCOL)
                    .host(BASE_HOST)
                    .addPathSegment(FORECASTS_ENDPOINT)
                    .addPathSegment(API_V1)
                    .addPathSegment(DAILY_ENDPOINT)
                    .addPathSegment(FIVE_DAYS_ENDPOINT)
                    .addPathSegment(cityKey)
                    .addQueryParameter("apikey", API_KEY)
                    .addQueryParameter("language", "ru-ru")
                    .addQueryParameter("metric", "true")
                    .build();
            Request request = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(httpUrl)
                    .build();
            Response response = okHttpClient.newCall(request).execute();

            String responseString = response.body().string();

            String responseHeadlineText = objectMapper.readTree(responseString).at("/Headline/Text").asText();

            String responseDailyForecastDay1 =
                    objectMapper.readTree(responseString).at("/DailyForecasts").get(0).at("/Day/IconPhrase").asText();
            String responseDailyForecastDay1MinimumDegrees = objectMapper.readTree(responseString).
                    at("/DailyForecasts").get(0).at("/Temperature/Minimum/Value").asText();
            String responseDailyForecastDay1MaximumDegrees = objectMapper.readTree(responseString).
                    at("/DailyForecasts").get(0).at("/Temperature/Maximum/Value").asText();

            String responseDailyForecastDay2 = objectMapper.readTree(responseString).at("/DailyForecasts").get(1)
                    .at("/Day/IconPhrase").asText();
            String responseDailyForecastDay2MinimumDegrees = objectMapper.readTree(responseString).
                    at("/DailyForecasts").get(1).at("/Temperature/Minimum/Value").asText();
            String responseDailyForecastDay2MaximumDegrees = objectMapper.readTree(responseString).
                    at("/DailyForecasts").get(1).at("/Temperature/Maximum/Value").asText();

            String responseDailyForecastDay3 = objectMapper.readTree(responseString).at("/DailyForecasts").get(2)
                    .at("/Day/IconPhrase").asText();
            String responseDailyForecastDay3MinimumDegrees = objectMapper.readTree(responseString).
                    at("/DailyForecasts").get(2).at("/Temperature/Minimum/Value").asText();
            String responseDailyForecastDay3MaximumDegrees = objectMapper.readTree(responseString).
                    at("/DailyForecasts").get(2).at("/Temperature/Maximum/Value").asText();

            String responseDailyForecastDay4 = objectMapper.readTree(responseString).at("/DailyForecasts").get(3)
                    .at("/Day/IconPhrase").asText();
            String responseDailyForecastDay4MinimumDegrees = objectMapper.readTree(responseString).
                    at("/DailyForecasts").get(3).at("/Temperature/Minimum/Value").asText();
            String responseDailyForecastDay4MaximumDegrees = objectMapper.readTree(responseString).
                    at("/DailyForecasts").get(3).at("/Temperature/Maximum/Value").asText();

            String responseDailyForecastDay5 = objectMapper.readTree(responseString).at("/DailyForecasts").get(4)
                    .at("/Day/IconPhrase").asText();
            String responseDailyForecastDay5MinimumDegrees = objectMapper.readTree(responseString).
                    at("/DailyForecasts").get(4).at("/Temperature/Minimum/Value").asText();
            String responseDailyForecastDay5MaximumDegrees = objectMapper.readTree(responseString).
                    at("/DailyForecasts").get(4).at("/Temperature/Maximum/Value").asText();


            System.out.println(responseHeadlineText); // вывести кусочек, а не весь ответ
            System.out.println("Сегодня: " + responseDailyForecastDay1 + ". Температура от " +
                    responseDailyForecastDay1MinimumDegrees + " до " + responseDailyForecastDay1MaximumDegrees
                    + " градусов.");
            System.out.println("Завтра: " + responseDailyForecastDay2 + ". Температура от " +
                    responseDailyForecastDay2MinimumDegrees + " до " + responseDailyForecastDay2MaximumDegrees
                    + " градусов.");
            System.out.println("Послезавтра: " + responseDailyForecastDay3 + ". Температура от " +
                    responseDailyForecastDay3MinimumDegrees + " до " + responseDailyForecastDay3MaximumDegrees
                    + " градусов.");
            System.out.println("Через 2 дня: " + responseDailyForecastDay4 + ". Температура от " +
                    responseDailyForecastDay4MinimumDegrees + " до " + responseDailyForecastDay4MaximumDegrees
                    + " градусов.");
            System.out.println("Через 3 дня: " + responseDailyForecastDay5 + ". Температура от " +
                    responseDailyForecastDay5MinimumDegrees + " до " + responseDailyForecastDay5MaximumDegrees
                    + " градусов.");
        }
    }

    public String detectCityKey(String selectedCity) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS_ENDPOINT)
                .addPathSegment(API_V1)
                .addPathSegment(CITIES_ENDPOINT)
                .addPathSegment(AUTOCOMPLETE_ENDPOINT)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("q", selectedCity)
                .build();
        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();
        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();
        String cityKey =  objectMapper.readTree(responseString).get(0).at("/Key").asText();
        return cityKey;
    }

}
