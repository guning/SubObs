package getweather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

import net.sf.json.JSONObject;


public class getWeather {
	
	public static JSONObject getJsonWeather() {
		JSONObject jsonObject = new JSONObject();
		try{
			URL weather = new URL("http://www.weather.com.cn/data/sk/101280101.html");
			URLConnection urlconnection = weather.openConnection();
			HttpURLConnection connection = null;
			
			if (urlconnection instanceof HttpURLConnection){
				connection = (HttpURLConnection) urlconnection;
			}else{
				jsonObject.put("bool","fail");
			}
			
			//数据流读取url返回
			BufferedReader in = new BufferedReader(
	            new InputStreamReader(connection.getInputStream(),"utf-8"));
	        String urlString = "";
	        String current;
	        while((current = in.readLine()) != null){
	           urlString += current;
	        }

	        //System.out.println(urlString);
	        
			JSONObject jsonWeather = new JSONObject(urlString);
	        //System.out.println(((JSONObject) jsonObject.get("weatherinfo")).get("city"));
	        
	        jsonObject.put("bool","success");
	        jsonObject.put("weatherinfo",(jsonWeather.get("weatherinfo")).toString());
	        
			
		}catch(IOException e){
			e.printStackTrace();
		}
		return jsonObject;
	}
		
	
	
}
