package CalcPack;

/**
 * @author Olga Chernopyatova
 *
 */
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        String operator;

        System.out.print("Enter > ");

        number1 = scanner.nextDouble();
        operator = scanner.next();
        number2 = scanner.nextDouble();

        if (operator.equals("*")){
            System.out.println("= " + (number1 * number2));
        }
        if (operator.equals("/")){
            System.out.println("= " + (number1 / number2));
        }
        if (operator.equals("+")){
            System.out.println("= " + (number1 + number2));
        }
        if (operator.equals("-")){
            System.out.println("= " + (number1 - number2));}
        else {
 
System.out.println("Try again ");
        }
}

	}


