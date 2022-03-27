
public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {

		System.out.println();	//just like the way this looks
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {

		System.out.println();	//just like the way this looks
		String asteriskBox = "***Error: " + error + "***";
			for (int i = 0; i < asteriskBox.length(); i++){
		    System.out.print("*");
		
			}
		System.out.println();
		System.out.println(asteriskBox);
		for (int i = 0; i < asteriskBox.length(); i++){
		    System.out.print("*");
		
			}
		System.out.println(); 	//just like the way it looks
		}
}
