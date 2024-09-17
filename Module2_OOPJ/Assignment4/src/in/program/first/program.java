package in.program.first;

public class program {

	public static void main(String[] args) {
		MoneymanagementUtil m = new MoneymanagementUtil();
		int choice;
		while((choice = MoneymanagementUtil.menulist())!= 0) {
			switch(choice) {
			case 1:
				m.acceptRecord();
				break;
			case 2:
				m.printRecord();
				break;
			}
		}

	}

}
