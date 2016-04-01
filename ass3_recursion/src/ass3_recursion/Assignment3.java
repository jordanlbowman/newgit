package ass3_recursion;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Assignment3 {

	public static void main(String[] args) {
		//create a Date to allow program to get current date/time
		//adapted from http://www.tutorialpoints.com/java/java_date_time.htm
		Date dNow = new Date( );
		SimpleDateFormat ft =
		new SimpleDateFormat ("EEEEEEEE MMMMMMM dd, yyyy h:mm:ss a z");
		System.out.println("Program start\nRunning " + ft.format(dNow) + "\n"); //print line with date/time in console

		int_method();

	}
	public static int a = 0;
	public static void int_method() {
		if (a==0){
			String anumber = JOptionPane.showInputDialog("Number");
			a = Integer.parseInt(anumber);
			System.out.println();
		}
		else {
		int b = 0;
		b = a/2;
		a = b;
		System.out.println(a);
		}
		int_method();
	}

}
