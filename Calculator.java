package week1.day2;

public class Calculator {


	public void add(int num1,int num2,int num3) {

		int sum = num1 + num2 + num3;
		System.out.println("the addition is" + sum);
	}

	public void sub(int num1,int num2) {
		int sub = num1 - num2;
		System.out.println("the subraction is " + sub);
	}

	public void mul(double num1,double num2) {
		double mul = num1 * num2;
		System.out.println("the multiplication is " + mul);

	}

	public void div(float num1,float num2) {
		float div = num1 / num2;
		System.out.println("the division is" + div);

	}

}
