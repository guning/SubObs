package parentsP;

import java.util.ArrayList;

import net.sf.json.JSONObject;
import inter.Subject;
import inter.observer;

public class weatherData implements Subject {
	
	private ArrayList observers;
	private JSONObject weatherdata;

	public weatherData() {
		observers = new ArrayList();
	}
	@Override
	public void registerObserver(observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	@Override
	public void removeObserver(observer o) {
		// TODO Auto-generated method stub
		if(observers.contains(o)){
			observers.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++){
			observer ober = (observer)observers.get(i);
			ober.update(weatherdata);
		}
	}
	
	public void setWeather(JSONObject weatherdata){
		this.weatherdata = weatherdata;
		notifyObserver();
	}

}
