import java.util.ArrayList;
import java.util.List;

public class WebpageList  {

	public static  List<Webpage> webpages;
	public static int state;
	
public WebpageList() {
	webpages = new ArrayList<Webpage>();
}

	
public static State saveStatetoMementum() {
	return new State( webpages, state);
			
}
 public void getStateFromMementum(State s) {
	 this.state=s.getState();
	 this.webpages = s.getWebpages();
	 
 }


public static int getState() {
	return state;
}


public static void setState(int state) {
	state = state;
}


public static void AddWebpage(Webpage web) {
	if(!ContainsWebpage(web)) {
		webpages.add(web);
	}
}

	public static Boolean ContainsWebpage(Webpage web)	{
		
		for (Webpage w: webpages) {
			if(w.getUrl().equals(web.getUrl()))
			return true;
		}
		return false;
	}
	
	
	
	public static Webpage getWebpage(String s) {
		for (Webpage w: webpages) {
			if(w.getUrl().equals(s))
			return w;
			
		}
		return null;
	}
}





