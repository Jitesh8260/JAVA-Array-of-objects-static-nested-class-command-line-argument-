/*Create a class Account having data members accNo, balance, timePeriod and intInYears(as
static and initialize with 7.5%). The class should also contain the following methods:
 floatcalculateInterst() which calculates and returns the interest amount.
 voidshowAccDetails() which displays account number, balance and calculated
interest amount.
 staticvoidchangeIntRate(float newRate) which changes the interest rate to newRate.
Create an array of object of the class Account. Store the details of each object through the
parameterized constructor. Display all the account details by calling the method
showAccDetails().Change the interest rate to a new one by calling the method
changeIntRate(). Finally display the account details after the change in interest rate*/

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter total number of accounts ");
         int n=scanner.nextInt();
         Account []people=new Account[n];
         for(int i=0;i<n;i++){
         System.out.println("Enter Account Details ");
         System.out.print("Account Number: ");
         int  ano = scanner.nextInt();
         System.out.print("Balance: ");
         int bal = scanner.nextInt();
         System.out.print("Time Period: ");
         int tp = scanner.nextInt();

         people[i] = new Account(ano,bal,tp);
         } 
         for(int j=0;j<n;j++){
            float intrest= people[j].calculateInterst();
            people[j].showAccDetails(intrest);
         }
         System.out.println("Enter new rate of Intrest");
         float newRate=scanner.nextFloat();
         System.out.println("Account details after Updation ");
         for(int k=0;k<n;k++){
            people[k].changeIntRate( newRate);
            float intrest= people[k].calculateInterst();
            people[k].showAccDetails(intrest);
         }
    }
}
class Account{
     int accNo;
     double balance; 
     double timePeriod; 
     static double intInYears =7.5;

     Account (int ano,double bal,double tp )
     {
        this.accNo=ano;
        this.balance=bal;
        this.timePeriod=tp;
     }
     float calculateInterst(){
        return (float) (balance*timePeriod*intInYears/100);
     }
     void showAccDetails(float intrest) {
         System.out.println("Account Number: " + accNo);
         System.out.println("Balance: " + balance);
         System.out.println("Intrest: "+intrest);
     }
     static void changeIntRate(float newRate){
        double intInYears= newRate;
     }
}
