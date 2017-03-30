package inter;


public interface Subject {
	public void registerObserver(observer o);
	public void removeObserver(observer o);
	public void notifyObserver();
}
