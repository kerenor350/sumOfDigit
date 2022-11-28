import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println(" Enter a double digit");
            number = scanner.nextInt();
        }while (number > 100 || number <= 10);
        System.out.println("The sum of your digits is " + (sum(number)));
    }

    public static  int sum (int number){
        int firstDigit;
        int secondDigit;
        int result;

                firstDigit = number%10;
                secondDigit =number / 10;
                result = firstDigit+secondDigit;
        return result;
    }
    public static  int dif (int number){

        int result = 0 ;            //451
        while (number>10){          //yes
            result =result + number%10; //0+1 =1 +5 =6
            number=number / 10;             //45   -> 4
        }
        result += number; //6+4

        return result;
    }

    }