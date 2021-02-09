import java.util.Scanner;
class Main {
  public static void main(String[] args)
 {
   Scanner scan = new Scanner(System.in);

   System.out.println("How much do the pants cost?");
   int clothes = scan.nextInt();
   System.out.println("How much was made in a day?");
   int numMoney = scan.nextInt();
   System.out.println(inventory(clothes,numMoney));
 }
 static int inventory(int dayAmount,int totalAmount)
 { 
 int amountLeft = totalAmount - dayAmount;
 return amountLeft;
 }
}