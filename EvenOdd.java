import java.util.Scanner;

   public class EvenOdd{

         public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
             System.out.println("enter num: ");
            int num = scan.nextInt();
            findEvenOdd(num);
         }
         public static void findEvenOdd(int num){
            if(num%2==0){
               System.out.println(num+" is even");
            }
            else{
                System.out.println(num+" is odd");
            }
         }
   }