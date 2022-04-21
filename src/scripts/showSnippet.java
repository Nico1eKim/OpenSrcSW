package scripts;

import java.util.ArrayList;

public class showSnippet {
	
	String fileDir;
	String query;
	
	public showSnippet(String fileDir, String query) {
		this.fileDir = fileDir;
		this.query = query;
		makeKeyword mk = new makeKeyword("./collection.xml");
	    
	}
	
	public void print() {
		String title;
		
		ArrayList<String> snippet = new ArrayList<>();
		
		
		
		
	}
}
