
public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {

		System.out.println(); 	//just like the way it looks
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < log.length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(log.charAt(i));
		}

		System.out.println(result.toString());
	}

	@Override
	public void Error(String error) {
		
		System.out.println(); 	//just like the way it looks
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
		   if (i > 0) {
		      result.append(" ");	//adding a space to beginning of loop
		    }

		   result.append(error.charAt(i));	//takes index and .appends a " "
		}

		System.out.println(result.toString());
	}

}
