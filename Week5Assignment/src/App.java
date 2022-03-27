
public class App {
	
	static Logger logger;

	public static void main(String[] args) {

		AsteriskLogger asteriskLogger = new AsteriskLogger();
		SpacedLogger spacedLogger = new SpacedLogger();
		
		System.out.println("Begin test of Logger:");
		
		asteriskLogger.log("Info");
		asteriskLogger.Error("BROKEN");
		spacedLogger.log("Data");
		spacedLogger.Error("Busted");
	}

}
