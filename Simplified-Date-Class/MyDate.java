public class MyDate {
	int day;
	int month;
	int year;

	{
	month = 1;
	day = 1;
	year = 2000;
	}

	public MyDate() {	
	}

	public MyDate(int m, int d, int y) {
		//A constructor that takes 3 arguments
		setDate(m, d, y);
	}

	public String toString() {
		return month + "/" + day + "/" + year;  
	}

	public void setDate(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}


}


