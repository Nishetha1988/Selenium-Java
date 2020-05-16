
public class UDBrowserDisableNotMain extends UDBrowserDisableNot{

	public static void main(String[] args) throws Exception{

		init();
		
		LaunchBrowser("firefoxbrowser");
		
		OpenUrl("icici");
		
	}

}
