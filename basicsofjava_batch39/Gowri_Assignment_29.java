package basicsofjava_batch39;

import java.util.Scanner;

//diff methods with Local Variables with scanner class
public class Gowri_Assignment_29 {

	static void add()
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a+b);
	}
	static void sub()
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a-b);
	}
	static void mul()
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a*b);
	}
	static void div()
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a/b);
	}
	static void mod()
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		System.out.println(a%b);
	}

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		add();
		sub();
		mul();
		div();
		mod();



	}

}
