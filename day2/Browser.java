package week1.day2;

public class Browser {
	
	public void launchBrowser(String BrowserName) {
		String Broder=BrowserName;
		System.out.println(Broder);
	}
	
	public String loadUrl() {
		String URL="URL Loaded";
		return URL;
		
	}

	public static void main(String[] args) {
		
		Browser sample = new Browser();
		sample.launchBrowser("Chrome");
		System.out.println(sample.loadUrl());
		

	}

}
