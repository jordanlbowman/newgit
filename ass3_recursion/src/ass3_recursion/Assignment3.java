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

		//string_method();
		//int_method();
		even_odd();

	}
	public static int a = 0;
	public static int count = 0;
	public static void int_method() {
		if (a==0){
			if(count>0){
				System.out.println("It ran through: " + count + " times");
				return;
			}
			else {
				String anumber = JOptionPane.showInputDialog("Number");
				a = Integer.parseInt(anumber);
				System.out.println();
			}
			
		}
		else {
		int b = 0;
		b = a/2;
		a = b;
		System.out.println(a);
		count++;
		}
		int_method();
	}
	
	public static String b = null;
	public static int count_b = 0;
	public static void string_method(){
		if (b==null){
			b = JOptionPane.showInputDialog("Word");
			count_b = b.length();
			count = 0;
		}
		else {
			if (count_b==count) {
				count = 0;
				return;
			}
			else {
				System.out.println(b.charAt(count));
				count++;
			}
		}
		string_method();
	}
	
	public static int number = 0;
	public static int run = 0;
	public static void even_odd(){
		if(run==0) {
			String anumber = JOptionPane.showInputDialog("Odd/Even Number");
			number = Integer.parseInt(anumber);
			run++;
		}
		else {
			if(number<=0) {
				if (number==0) {
					System.out.println("Your number is even");
					return;
				}
				else {
					System.out.println("Your number is odd");
					return;
				}
			}
			else {
				number=(number-2);
			}
			
		}
	even_odd();
	}

}
