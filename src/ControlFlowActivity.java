import java.util.Scanner;

public class ControlFlowActivity {

    private static void evenOrOddTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("\t Enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.print("\t --> The number you entered is even.");
        } else {
            System.out.print("\t --> The number you entered is odd.");
        }
    }

    private static void factorialTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("\t Enter a number: ");
        int num = input.nextInt();

        long factorial = 1;

        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }

    private static void fibonacciTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("\t Enter first term: ");
        int firstTerm = input.nextInt();
        System.out.print("\t Enter second term: ");
        int secondTerm = input.nextInt();
        int n = 10;

        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    private static void leapYearTask() {

        Scanner input = new Scanner(System.in);
        System.out.print("\t Enter a year: ");
        // year to be checked
        int year = input.nextInt();
        boolean leap = false;
        // if the year is divided by 4
        if (year % 4 == 0) {
            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            // if the year is not century
            else
                leap = true;
        } else
            leap = false;

        if (leap)
            System.out.print("\t--> " + year + " is a leap year.");
        else
            System.out.print("\t--> " + year + " is not a leap year.");

    }

    private static void simpleCalc() {
        char operator;
        int number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        number1 = input.nextInt();

        System.out.println("Enter second number");
        number2 = input.nextInt();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }

    static void delimiter() {
        for (int i = 1; i < 50; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        while (true) {

            delimiter();

            Scanner input = new Scanner(System.in);

            String optionsPromt[] = new String[] {
                    "1. Odd or Even Task",
                    "2. Factorial Task",
                    "3. Fibonacci Task",
                    "4. Leap year Task",
                    "5. Simple Calculator Task",
            };

            System.out.println("Choose task to perform:");

            for (String string : optionsPromt) {
                System.out.println("\t" + string);
            }

            System.out.print("Choose a number:");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("* " + optionsPromt[option - 1].substring(3));
                    evenOrOddTask();
                    break;
                case 2:
                    System.out.println("* " + optionsPromt[option - 1].substring(3));
                    factorialTask();
                    break;
                case 3:
                    System.out.println("* " + optionsPromt[option - 1].substring(3));
                    fibonacciTask();
                    break;
                case 4:
                    System.out.println("* " + optionsPromt[option - 1].substring(3));
                    leapYearTask();
                    break;
                case 5:
                    System.out.println("* " + optionsPromt[option - 1].substring(3));
                    simpleCalc();
                    break;
                default:
                    System.out.println("TODO: default");
                    break;
            }
            System.err.println();
        }

    }
}
