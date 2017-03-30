package station;

import net.sf.json.JSONObject;
import getweather.getWeather;
import parentsP.showOne;
import parentsP.showTwo;
import parentsP.weatherData;

public class stationOne {
	public static void main(String[] args) {
		weatherData weatherdata = new weatherData();
		showOne showone = new showOne(weatherdata);
		showTwo showtwo = new showTwo(weatherdata);
		
		getWeather getweather = new getWeather();
		JSONObject jsonweather = getweather.getJsonWeather();
		weatherdata.setWeather(jsonweather);
		
	}
}
