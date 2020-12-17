import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class State {
	public   List<Webpage> webpages;
	private int state;
	
	
	public State(List<Webpage> o, int s) {
		this.webpages=o;
		this.state=s;
		
	}
	public int getState() {
		return this.state;
	}
	public List<Webpage> getWebpages() {
		return this.webpages;
	}
	
}
