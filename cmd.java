/*Write a program that will take two integer numbers from the command prompt and find
their GCD and LCM. If the user does not provide exactly two numbers of arguments then
the program should display error message.*/

public class cmd {
    public static void main(String[] args) {
        System.out.println("No of  Arguements: "+args.length);
         if(args.length==2){
        int i;
        int s=0;
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if(a>b){
            s=b;
        }
        else
            s=a;
        for(i=s;i>0;i--)
        {
            if(a%i==0 && b%i==0){
             System.out.println("GCD of "+a+" and "+b+" is "+i);
             System.out.println("LCM of "+a+" and "+b+" is "+(a*b)/i);
             break;
        }
        }
        }
        else{
            System.out.println("ERROR");
        }
    }
}
