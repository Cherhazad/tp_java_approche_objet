package fr.diginamic.operations;

public class Operations {
	double a;
	double b;
	double result;
	char c;

	public void calcul(double a, double b, char c) {

		switch (c) {
		case '+':
			result = a + b;
			System.out.println(a + " + " + b + " = " + result);
			//return a + b;
			break;
		case '-':
			result = a - b;
			System.out.println(a + " - " + b + " = " + result);
			//return a - b;
			break;
		case '*':
			result = a * b;
			System.out.println(a + " * " + b + " = " + result);
			//return a * b;
			break;
		case '/':
			result = a / b;
			System.out.println(a + " / " + b + " = " + result);
			//return a / b;
			break;
		default: 
			System.out.println("Choisis ton type de calcul");
			
		}
	}

}
