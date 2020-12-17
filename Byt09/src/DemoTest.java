import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class DemoTest {

	public static void main(String[] args) {
		
		
	}
	
	
	@Test
	public void test() {
		WebpageList list = new WebpageList();
		Observer anna = new Observer("Anna Samanova", "http://www.pja.edu.pl/");
		Observer amanda = new Observer("Amanda Kravets", "http://www.pja.edu.pl/");
		Observer sara = new Observer("Sara Krull", "http://www.pja.edu.pl/");
		Observer elis = new Observer("Elis Fitsgerald", "http://www.pja.edu.pl/");
		Observer olya = new Observer("Olya Fitsgerald", "http://www.google.com/");
		Observer mina = new Observer("Mina Carlson", "http://www.google.com/");
		Observer rozali = new Observer("Rozali Winston", "http://www.yahoo.com/");
		Observer bella = new Observer("Bella Swan", "http://www.yahoo.com/");
		Observer tina = new Observer("Tina Turner", "http://www.wikipedia.com/");
		Demo demo = new Demo();
		demo.Start();
		
		assertEquals(4,list.webpages.size());
		assertEquals(4, list.getWebpage("http://www.pja.edu.pl/").getObservers().size());
		assertEquals(2, list.getWebpage("http://www.google.com/").getObservers().size());
		assertEquals(2, list.getWebpage("http://www.yahoo.com/").getObservers().size());
		assertEquals(1, list.getWebpage("http://www.wikipedia.com/").getObservers().size());
		
	}
	

}
