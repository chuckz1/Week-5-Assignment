package week5;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger asteriskLog = new AsteriskLogger();
		Logger spaceLog = new SpacedLogger();
		
		asteriskLog.Log("First");
		asteriskLog.Error("Second");
		
		spaceLog.Log("Third");
		spaceLog.Error("Fourth");
	}

}
