public class LeapYear {

	public static void main(String[] args) {
		int y=365;
		if(y%4==0 && y%100!=0 && y%400==0) {

		System.out.println("leap year");
		}
		else {
		System.out.println("not leap year");
		}
		   }	
	}
