package flowcontrol;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        do{
            System.out.println("- Number Analyzer Tool - ");
            System.out.println("1.  Check if a number is positive, negative, or zero\n" +
                    "2. Determine if a number is even or odd\n" +
                    "3. Display numbers from 1 to a given number\n" +
                    "4. Display Fibonacci series up to a given number\n" +
                    "5. Exit");
            result = scanner.nextInt();

            switch (result) {
                case 1:
                    System.out.println("Enter any number : ");
                    int choice = scanner.nextInt();
                    if (choice>=0){
                        System.out.println("Positive number");
                    }
                    else if (choice<0){
                        System.out.println("Negative number");
                    }
                    else{
                        System.out.println("Zero");
                    }
                    break;
                case 2:
                    System.out.println("Enter any number : ");
                    choice = scanner.nextInt();
                    if(choice%2==0){
                        System.out.println("Even number");
                    }
                    else{
                        System.out.println("Odd number");
                    }
                    break;
                case 3:
                    System.out.println("Enter any number : ");
                    choice = scanner.nextInt();
                    for(int i=1;i<=choice;i++){
                        System.out.println(i+"/n");
                        break;
                    }
                case 4:
                    System.out.println("Enter anny number: ");
                    choice = scanner.nextInt();
                    if(choice==0 || choice ==1){
                        System.out.println('0'+'1');
                    }
                    int a=0;
                    int b=1;
                    int ch=0;
                    int ri=1;
                    System.out.println(a);
                    System.out.println(b);
                    while (ri!=choice){
                        ch=a+b;
                        System.out.println(ch);
                        a=b;
                        b=ch;
                        ri=ri+1;

                    }
                case 5:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid option");

            }

        } while (result!=5);




    }

}
