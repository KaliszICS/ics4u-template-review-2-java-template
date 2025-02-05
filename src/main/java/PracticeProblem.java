import java.util.Scanner;

public class PracticeProblem {

	static Scanner s = new Scanner(System.in);

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		s = new Scanner(System.in);
		//Write question 1 code here
		System.out.print("In: ");
		String in = s.nextLine();
		System.out.println(in);
	}

	public static void q2() {
		s = new Scanner(System.in);
		//Write question 2 code here
		System.out.print("In: ");
		int in = s.nextInt();
		s.nextLine();
		System.out.print("In: ");
		int in2 = s.nextInt();
		s.nextLine();
		System.out.println(in/in2);
		System.out.println(in%in2);
	}

	public static void q3() {
		s = new Scanner(System.in);
		//Write question 3 code here
		System.out.print("In: ");
		String in = s.nextLine();
		System.out.println(in + " was the text you wrote");
	}

	public static void q4() {
		s = new Scanner(System.in);
		//Write question 4 code here
		System.out.print("In: ");
		int in = s.nextInt();
		System.out.println(in*5);
	}

	public static void q5() {
		s = new Scanner(System.in);
		//Write question 5 code here
		System.out.print("In: ");
		boolean in = s.nextBoolean();
		s.nextLine();
		System.out.println(in + " is a boolean");
	}

	public static void q6() {
		s = new Scanner(System.in);
		//Write question 6 code here
		System.out.print("In: ");
		double in = s.nextDouble();
		s.nextLine();
		System.out.println(in - 3.2);
	}

}
