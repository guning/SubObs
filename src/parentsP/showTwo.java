package parentsP;

import net.sf.json.JSONObject;
import inter.DisplayEle;
import inter.Subject;
import inter.observer;

public class showTwo implements DisplayEle, observer {
	private Subject weatherData;
	private JSONObject weatherdata;
	
	public showTwo(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(JSONObject weatherdata) {
		// TODO Auto-generated method stub
		this.weatherdata = weatherdata;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(weatherdata.get("weatherinfo"));
	}

}
