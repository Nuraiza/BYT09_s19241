import java.net.MalformedURLException;
import java.net.URL;

public class Observer {
	private String fullname;
	private Webpage webpage;
	
	public Observer(String n, String u) {
		this.fullname=n;
		webpage = new Webpage(u);
		if(WebpageList.ContainsWebpage(webpage)) {
			Webpage w = WebpageList.getWebpage(webpage.getUrl());
			w.Attach(this);
			}
		 else {
			webpage.Attach(this);
			WebpageList.AddWebpage(webpage);
		}
			
		
		
	}
	
public void update() {
	System.out.println("Observer of "+webpage.getUrl()+" webpage has been notified");
}

public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public Webpage getWebpage() {
	return webpage;
}

public void setWebpage(Webpage webpage) {
	this.webpage = webpage;
}





}
