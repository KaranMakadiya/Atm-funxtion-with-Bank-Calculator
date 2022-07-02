import java.util.*;
import java.lang.*;
public class ATM 
{
     public static void sleep(){
        try{
            Thread.sleep(2000);            
        } catch(InterruptedException ex)
      {
          ex.printStackTrace();
     }
    }
    public static void main(String[] args)
    {  
        Scanner type = new Scanner(System.in);
        int PIN = 1234,n,N;
        int balance = 5000, withdraw, deposit;
        String ID = "WXYZ";
        System.out.print(" \n \t\t\t _/\\_ Welcome to ABC Bank Pvt.Ltd. _/\\_ ");
        sleep();
        System.out.print("\n Id = 'WXYZ' and PIN ='1234' ");
        sleep();
        System.out.print("\n Hello " +ID);
        System.out.print("\n Enter the PIN : ");
         int pin = type.nextInt();         
         while(pin!=PIN)
         {    System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			pin = type.nextInt();
         }
         System.out.println("Access Granted.You can now have access to your Account");       
       do{
             Scanner s = new Scanner(System.in);         
         System.out.println(" 1. Automated Teller Machine");
         System.out.println(" 2. Bank Calculator");
         System.out.println(" 3. For Exit");
         System.out.print("Please select operation you want to perform :  ");
         n = s.nextInt();         
           switch(n){            
               case 1:
            do{
            System.out.println(" 1. Automated Teller Machine");
            System.out.println(" 1. for Withdraw");
            System.out.println(" 2. for Deposit");
            System.out.println(" 3. for Check Balance");
            System.out.println(" 4. for EXIT");
            System.out.print("Enter the number for operation you want to perform : ");
             n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please use your money wisely");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
            case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;
            case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
                default :
                    System.out.print(""); 
            }
        } while(n!=4);
            break;
     case 2 :         
         do{
             Scanner c = new Scanner(System.in);
            System.out.println("\n 2. Bank Calculator");
            System.out.println(" 1. Simple Interest Calculator");
            System.out.println(" 2. Fixed Deposit Calculator");
            System.out.println(" 3. EMI Calculator");
            System.out.println(" 4. GST Calculator");
            System.out.println(" 5. for EXIT");
            System.out.print("Enter the number for what you want to calculate : ");
             N = c.nextInt();
            
            switch(N){
         case 1:
            System.out.println(" 1. Simple Interest Calculator");
            float A,y=1,I;
            float temp;
            Scanner inp = new Scanner(System.in);
            Scanner inr = new Scanner(System.in);
            Scanner it = new Scanner(System.in);
            System.out.print("\t Enter the Amount(P)(₹) : ");
            float p = inp.nextFloat();       
            System.out.print("\t Enter the Rate of Interest(I)(%) : ");
            float r = inr.nextFloat();          
            System.out.print("\t Enter the Time in peroid in Years : ");
            float t = it.nextFloat();        
             temp= (1+(r/100)/y);
              A=(float) (p*Math.pow(temp,(y*t)));
            System.out.println("\t Total Amount Deposit : " +p+ "₹");
              I=A-p;
            System.out.println("\t Total Interset Earn : "+I+ "₹");
            System.out.println("\t Total Amount : "+A+ "₹" );
          break;
         case 2:
               System.out.println(" 2. Fixed Deposit Calculator");
                float  fdy=1;
               Scanner fdp = new Scanner(System.in);
               Scanner fdr = new Scanner(System.in);
               Scanner fdt = new Scanner(System.in);
               System.out.print("\t Enter the Amount(P)(₹) : ");
                 p = fdp.nextFloat(); 
            System.out.print("\t Enter the Rate of Interest(I)(%) : ");
              r = fdr.nextFloat();          
            System.out.print("\t Enter the Time in peroid in Years : ");
              t = fdt.nextFloat();   
              temp= (1+(r/100)/fdy);
              A=(float) (p*Math.pow(temp,(fdy*t)));
            System.out.println("\t Total Amount Deposit : " +p+ "₹");
              I=A-p;
            System.out.println("\t Total Amount Return : "+I+ "₹");
            System.out.println("\t Total Amount : "+A+ "₹" );                    
           break;
          case 3:
                      System.out.println(" 3.  EMI Calculator");
                      Scanner a = new Scanner(System.in);         
                      float principal, rate, time, emi,interest,amount;  
                      System.out.print("Enter L oan Amount(P)₹ : ");
                       principal = a.nextFloat();
                      System.out.print("Enter Rate Of Interest(I)% : ");
                       rate = a.nextFloat();      
                      System.out.print("Enter Loan Tenure in year: ");
                        time = a.nextFloat();
                        rate=rate/(12*100); 
                        time=time*12;    
                        emi=   (float) ((principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1));
                        amount = emi*time;
                        interest= amount - principal;      
                    System.out.println("Monthly EMI  : "+emi+"₹");
                    System.out.println("Principal Amount  : "+principal+"₹");
                    System.out.println("Total Interest  : "+interest+"₹");
                    System.out.println("Total Amount  : "+amount+"₹");
               break;
            case 4:
                    System.out.println(" 4. GST Calculator");
                    Scanner b = new Scanner(System.in);
                    float ga , tax ,ts , gst , TA;         
                   System.out.print("Enter the Amount(A)₹ : ");
                    ga = b.nextFloat();
                   System.out.print("Enter the Tax Slab% : ");
                    tax = b.nextFloat();
                      ts=tax/100;
                      gst= ga*ts;
                      TA= ga+gst;
                System.out.println("Amount  : "+ga+"₹");
                System.out.println("Tax Slab   : "+tax+"%");
                System.out.println("Total GST  : "+gst+"₹");
                System.out.println("Total Amount  : "+TA+"₹");                    
              break;
           default :
                    System.out.print("");          
            }
        }while(N!=5);
        break;
                  default :
                    System.out.print("");
           }
           }while(n!=3);
        
                    System.out.print("\t\t !!.. Thank you for viewing this project ..!!");         
    }
}
