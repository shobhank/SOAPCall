package org.shobhank;

import com.cdyne.ws.weatherws.ForecastReturn;
import com.cdyne.ws.weatherws.Weather;
import com.cdyne.ws.weatherws.WeatherReturn;
import com.cdyne.ws.weatherws.WeatherSoap;

/*
 * This project uses SOAP call.
 * A Test Project
 */
public class WeatherForecaster {

	public static void main(String[] args) {
		Weather w = new Weather();
		WeatherSoap ws = w.getWeatherSoap();
		WeatherReturn forecast = ws.getCityWeatherByZIP("95126");
		System.out.println(forecast.getState());
		}

}
