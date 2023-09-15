import java.util.Scanner;
public class RowdyNCalculator {
  
  public RowdyNCalculator() { 
  }
  
  
    public static void main(String[] args) {
    System.out.println("UTSA - FALL 2022 - CS1083 - Section 001 - Project I - RowdyNCalculator - written by Anusha Abdulla");
 
    
    Scanner scan = new Scanner (System.in);
    
    System.out.print("Please, input the number of calculations you want to perform: "); 
    int a = scan.nextInt();
    char operation1;
    int in;
    int in2;
    Double dub;
    Double dub2;
    char type;
    Double total = 0.0;
    
    for (int i = 1; i <= a; i++){
         System.out.println("Operation number " + i);
         System.out.print("Please, select your choice of datatype of operation (i - integer, d - double): ");
         operation1 = scan.next().charAt(0);
         if (operation1 == 'i'){
           System.out.print("Please, input the first integer value: ");
           in = scan.nextInt();
           System.out.print("Please, input the charachter of the operation (+, -, *, /, %): ");
           type = scan.next().charAt(0);
           System.out.print("Please, input the second integer value: ");
           in2 = scan.nextInt();
           if (type == '+'){
             System.out.println("The result of adding " + in + " and " + in2 + " is: " + (in + in2));
             total = total + in + in2;
           }
           else { if (type == '-'){
             System.out.println("The result of subtracting " + in + " and " + in2 + " is: " + (in - in2));
             total = total + (double)(in - in2);
           }
           else { if (type == '*'){
             System.out.println("The result of multiplying " + in + " and " + in2 + " is: " + (in * in2));
             total = total + (double)(in * in2);
           }
           else{ if (type == '/'){
             System.out.println("The result of dividing " + in + " and " + in2 + " is: " + (in / in2));
             total = total + (double)(in / in2);
           }
           else{ if (type == '%'){
             System.out.println("The result of modulo " + in + " and " + in2 + " is: " + (in % in2));
             total = total + (double)(in % in2);
           }
           else{
             System.out.println("Wrong datatype");
           }
           }
           }
           }
           }
           
         }
         else { if (operation1 == 'd'){
           
            System.out.print("Please, input the first double vlaue: ");
            dub = scan.nextDouble();
           System.out.print("Please, input the charachter of the operation (+, -, *, /, %): ");
           type = scan.next().charAt(0);
           System.out.print("Please, input the second integer value: ");
           dub2 = scan.nextDouble();
           if (type == '+'){
             System.out.print("The result of adding " + dub + " and " + dub2 + " with only 3 decimals is: ");
             System.out.printf("%.3f", (dub + dub2));
             System.out.println();
             total = total + (dub + dub2);
           }
           else { if (type == '-'){
             System.out.print("The result of subtracting " + dub + " and " + dub2 + " with only 3 decimals is: ");
             System.out.printf("%.3f", (dub - dub2));
             System.out.println();
             total = total + (dub - dub2);
           }
           else { if (type == '*'){
              System.out.print("The result of subtracting " + dub + " and " + dub2 + " with only 3 decimals is: ");
             System.out.printf("%.3f", (dub * dub2));
             System.out.println();
             total = total + (dub * dub2);
           }
           else{ if (type == '/'){
              System.out.print("The result of subtracting " + dub + " and " + dub2 + " with only 3 decimals is: ");
             System.out.printf("%.3f", (dub / dub2));
             System.out.println();
             total = total + (dub / dub2);
           }
           else{ if (type == '%'){
             System.out.print("The result of subtracting " + dub + " and " + dub2 + " with only 3 decimals is: ");
             System.out.printf("%.3f", (dub % dub2));
             System.out.println();
             total = total + (dub % dub2);
           }
           else{
             System.out.println("Wrong datatype");
           }
           }
           }
           }
           }
           
           }
           
         else {
          System.out.println("Wrong datatype");
    }
         }
    }
    System.out.println("Thank you for using the RowdyNCalculator!");

    System.out.print("The sum of the result of all " + a + " operations is: ");
    System.out.printf("%.3f", total);
  }

}


  

