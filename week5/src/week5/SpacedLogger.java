package week5;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String logMessage) {
		// TODO Auto-generated method stub
		// build message
		StringBuilder result = new StringBuilder(logMessage);
		for (int i = 1; i < logMessage.length(); i++) {
			result.insert((i * 2) - 1, ' ');
		}

		// print message
		System.out.println(result.toString());
	}

	@Override
	public void Error(String errorMessage) {
		// TODO Auto-generated method stub
		// build message
		StringBuilder result = new StringBuilder(errorMessage);
		for (int i = 1; i < errorMessage.length(); i++) {
			result.insert((i * 2) - 1, ' ');
		}

		// print message
		System.out.println("Error: " + result.toString());

	}

}
