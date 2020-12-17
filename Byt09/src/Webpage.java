import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Webpage {
	private URL address;
	private String url;
	private Date lastDate;
	private List<Observer> observers = new ArrayList<Observer>();
	
	
	public Webpage( String a) {
		
		try {
			URL url = new URL(a);
			this.address=url;
			this.url = a;
			this.lastDate= null;
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public void Attach(Observer o) {
		observers.add(o);
	}
	
	
	public void NotifyAllObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
		
	}


	public URL getAddress() {
		return address;
	}

	public void setAddress(URL address) {
		this.address = address;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
		NotifyAllObservers();
	}
	public String toString() {
		return  "Webpage address: "+this.url+"  Date of last modification: "+this.lastDate.toString()+" Number of observers: "
		+this.observers.size();
	}
	
	
	
}