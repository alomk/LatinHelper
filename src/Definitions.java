import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Definitions {
	
	private WebClient driver;
	
	public Definitions() {
		driver = new WebClient();
	}
	
	public String getDefinitions(String address) {
		try{
			final HtmlPage page = driver.getPage(address);
			return page.asText();
		}catch(Exception e){
			return "Error";
		}
	}
}
