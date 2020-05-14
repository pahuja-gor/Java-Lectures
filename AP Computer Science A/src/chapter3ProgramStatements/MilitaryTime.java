package chapter3ProgramStatements;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class MilitaryTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner value = new Scanner(System.in);

		int mTime;

		do {

			System.out.print("Enter Military Time OR -1 to Quit: ");

			mTime = value.nextInt();

			int hour, minute;
			String stdTime;

			hour = mTime / 100;
			minute = mTime % 100;

			//System.out.println("hour: " + hour + " minute: " + minute + " mTime " + mTime);

			NumberFormat fmt = new DecimalFormat("00");

			if(mTime < 0 || mTime >= 2400 || minute > 59)
			{
				System.out.println("illegal time");
				continue;
			}


			if(hour < 12)
			{
				if(hour == 0) {
					hour = 12;
				}

				stdTime = hour + ":" +  fmt.format(minute) + " AM";
			}
			else if(hour > 12) {
				stdTime = (hour - 12) + ":" + fmt.format(minute) + " PM";
			}
			else
			{
				stdTime = hour + ":" + fmt.format(minute) + " PM";
			}

			System.out.println(stdTime);
		}while (mTime > -1);
	}

}
