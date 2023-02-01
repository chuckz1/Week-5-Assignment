package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String logMessage) {
		// TODO Auto-generated method stub
		System.out.println("***" + logMessage + "***");
	}

	@Override
	public void Error(String errorMessage) {
		// TODO Auto-generated method stub
		
		//build the box
		StringBuilder box = new StringBuilder("******");
		for (int i = 0; i < errorMessage.length(); i++) {
			box.append('*');
		}
		
		//print the box
		System.out.println(box.toString());
		System.out.println("***" + errorMessage + "***");
		System.out.println(box.toString());
	}

}
