import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo extends TimerTask {
public int stateCounter=0;
CareTaker caretaker = new CareTaker();

public Demo() {	}

	public void Start() {
		Timer timer = new Timer();
		
		timer.schedule(this, 0, 60*1000);
	}

	@Override
	public void run() {
		
		for(Webpage w : WebpageList.webpages) {
			URL address;
			try {
				address = new URL(w.getUrl());
				URLConnection connect = address.openConnection();
				long time = connect.getLastModified();
				Date modifiedDate = new Date(time);
				if(w.getLastDate()==null) {
					w.setLastDate(modifiedDate);
				}
			    if(modifiedDate.compareTo(w.getLastDate())>0) {
					 w.setLastDate(modifiedDate);
				 }
			
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			

		}
		WebpageList.setState(stateCounter);
		stateCounter++;
		try {
			caretaker.add(WebpageList.saveStatetoMementum());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
}
