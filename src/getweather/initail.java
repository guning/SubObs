package getweather;

import net.sf.json.JSONObject;

public class initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getWeather json = new getWeather();
		System.out.println(((JSONObject) json.getJsonWeather()).get("weatherinfo"));
	}

}
