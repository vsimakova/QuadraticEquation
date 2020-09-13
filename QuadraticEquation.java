
/**
 * Program solves quadratic equation using input from user which is values for
 * variables a, b and c. The variables a,b and c also called coefficients,
 * where a cannot be 0. d is discriminant.
 * 
 * @author Viktoryia Simakova
 * @version 3 May 2020
 */
import java.util.Scanner;
public class QuadraticEquation
{
    public static void main(String[]arg){
        double a, b, c, d, x1, x2;       //x1 and x2 are roots of the eqution
        String answer;                   //helps determine whether program should finish or no
        System.out.println("Let's solve quadratic equation!");
        Scanner input = new Scanner(System.in);
        do{                              //continues solve quadratic equation while user wants
            System.out.println("Enter a value for a coefficient: ");
            a = input.nextDouble();
            System.out.println("Enter value for b coefficient:");
            b = input.nextDouble();
            System.out.println("Enter value for c coefficient:");
            c = input.nextDouble();
            if(a!=0&&b!=0&&c!=0){        //determines case
                d = b*b-4*a*c;           //finds Discriminant
                if(d<0){
                    System.out.println("The Quadratic Equation has no roots");
                    System.out.println("because the Discriminant is negative.");
                }else if(d==0){
                    x1 = -b/(2*a);
                    System.out.println("The Quadratic Equation has one root");
                    System.out.println("because the Discriminant equals 0.");
                    System.out.printf("One root x = %.2f\n",x1);
                }else{
                    x1 = (-b+Math.sqrt(d))/(2*a);
                    x2 = (-b-Math.sqrt(d))/(2*a);
                    System.out.println("The Quadratic Equation has two roots.");
                    System.out.printf("First root x = %.2f\n",x1);
                    System.out.printf("Second root x = %.2f\n",x2);
                }
            }else{
                System.out.println("This is not a standart form of");
                System.out.println("Quadratic Equation!");
                //determines special case
                if(b==0&&c==0||a==0&&c==0||a==0&&b==0&&c==0){
                    x1 = 0;
                    System.out.println("x = "+x1);
                }else if(a==0&&b==0){
                    System.out.println("As far as a=0, b=o, there is only ");
                    System.out.println("coefficient c which is equals "+c);
                }else if(b==0){
                    x1=Math.sqrt(-c/a);
                    if(x1>=0){               //if c is positive there is no solution
                        System.out.printf("x = %.2f\n",x1);
                    }else{
                        System.out.println("No solution.");
                    }
                }else if(c==0){
                    x1=-b/a;
                    System.out.printf("x = %.2f\n",x1);
                }else if(a==0){
                    x1=-c/b;
                    System.out.printf("x = %.2f\n",x1);
                }
            }
            System.out.println("Would you like to solve again?");
            System.out.println("Enter 'y', if yes and something else, if no");
            answer = input.next();
        }while(answer.equalsIgnoreCase("y"));
        System.out.println("Bye!Have a nice day!");         //finish program
    }
}
