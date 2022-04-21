package scripts;

public class MidTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String command1 = args[0];
		String path = args[1];
		String command2 = args[2];
		String query = args[3];
		
		if(command1.equals("-m")) {
			if(command2.equals("-q")) {
				showSnippet ss = new showSnippet(path, query);
				
			}
		}
	}

}
