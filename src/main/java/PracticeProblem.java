import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(input.nextLine().charAt(0));
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		Boolean bool;
		System.out.print("In: ");
		bool = input.nextBoolean();
		input.nextLine();
		System.out.println(!bool);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(input.nextInt() > 5);
		input.nextLine();
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		double fractionalDouble;
		System.out.print("In: ");
		fractionalDouble = input.nextDouble();
		input.nextLine();
		System.out.println(fractionalDouble <= 2.0 && fractionalDouble >= -2.0);
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		System.out.println(input.nextLine().equals("Hello World"));
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		int num;
		int num2;
		num = input.nextInt();
		input.nextLine();
		System.out.print("In: ");
		num2 = input.nextInt();
		input.nextLine();
		System.out.println(num <= num2);
	}

	public static void q7() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		double fractionalDouble1;
		double fractionalDouble2;
		fractionalDouble1 = input.nextInt();
		input.nextLine();
		System.out.print("In: ");
		fractionalDouble2 = input.nextInt();
		input.nextLine();
		System.out.println(fractionalDouble1 > fractionalDouble2);
	}

}
