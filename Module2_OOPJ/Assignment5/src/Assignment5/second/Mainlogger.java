package Assignment5.second;

public class Mainlogger {

	public static void main(String[] args) {
		Logger l1 = Logger.getInstance();
		l1.log("First log");
		l1.log("Second log");
		System.out.println(l1.getLog());
		System.out.println(l1.clearLog());
		l1.log("Third log");
		System.out.println(l1.getLog());

	}

}
