import java.util.ArrayList;

public class TabWindow {

	private static TabWindow sc;
	private ArrayList<String> urls;
	private TabWindow() {
		// TODO Auto-generated constructor stub
		urls=new ArrayList<String>();
		
	}
	
	public static TabWindow getInstance() {
		if(sc==null)
			sc=new TabWindow();
		return sc;
	}
	
	public void addUrl(String url) {
		urls.add(url);
	}
	
	public void showUrls() {
		for(String u:urls) {
			System.out.println(u);
		}
	}
	
	
	
}
