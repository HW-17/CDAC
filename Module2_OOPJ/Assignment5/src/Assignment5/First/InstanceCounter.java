package Assignment5.First;

public class InstanceCounter {
	private static int counter;
	public InstanceCounter() {
		counter++;
	}
public static int getNumOfInstances() {
	return counter;
}
}
