package com.company;

import java.security.PrivateKey;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double balance=30000.00;
        int pinn;
        Scanner kb=new Scanner(System.in);
        System.out.println("Please Enter Your Pin:");
        pinn=kb.nextInt();
        System.out.println("Select Transaction:\n Press 1 for Withdrawals.\n Press 2 for Deposit.\n Press 3 for Balance Enquiry\n" +
                "Press 4 for Transfer\n Press 5 for Bills Payment");
        int number;
        number=kb.nextInt();
        switch (number)
        {
            case 1:
                System.out.println("Select amount to withdraw:\n 1-#500 \n 2-#2000 \n 3-#4000 \n 4-#8000 \n 5-#10000 \n 6-#15000\n" +
                        "7-#20000 \n 8- Input other Amount:");
                int number1;
                number1=kb.nextInt();
               if (number1==8)
                {
                    int subnum;
                    subnum=kb.nextInt();
                }
               if (number1>balance){
                  System.out.println("Insufficent Funds!");
               }
               else {
                   System.out.println("Do You need a Receipt;\n 1- Yes \n 2- No");
                   int receipt;
                   receipt=kb.nextInt();
                   System.out.println("Please Take Your cash\n\n\n");
               }
                    break;
            case 2:
                System.out.println("Enter Name of depositor:");
                String deposit_name;
                kb.nextLine();
                deposit_name=kb.nextLine();
                System.out.println("Enter Amount to deposit:");
                int deposit_amt;
                deposit_amt=kb.nextInt();
                System.out.println("Enter Phone Number:");
                int deposit_phone_no;
                deposit_phone_no=kb.nextInt();

                System.out.println(deposit_name+"\n"+deposit_amt+"\n"+deposit_phone_no);
                System.out.println("Please confirm if the details are correctly entered, if yes press 1 to proceed, +\n"
                        +"if no press 2 to re-enter.");
                int re_deposit;
                re_deposit=kb.nextInt();
                if (re_deposit==1){
                    System.out.println("Do You need a Receipt;\n 1- Yes \n 2- No");
                    int receipt;
                    receipt=kb.nextInt();
                    System.out.println("Transaction Successful!");
                }
                else {
                    while (re_deposit==2){
                    }
                }

                break;
            case 3:
                System.out.println("Current Balance="+" "+ "#" + balance+"0");
                break;
            case 4:
                System.out.println("Enter Receipent Account Number:");
                int recnum;
                recnum=kb.nextInt();
                System.out.println("Please Enter your transfer password:");
                int password;
                password=kb.nextInt();
                System.out.println("Enter amount:");
                int tamount;
                tamount=kb.nextShort();

                break;
            case 5:
                System.out.println("We are not ready for now");
                break;
            default:
                System.out.println("Invalid Input!");
                System.exit(0);
        }

        System.out.println("Do You need a Receipt;\n 1- Yes \n 2- No");
        int receipt;
        receipt=kb.nextInt();
        System.out.println("Do You need Want to perform another transaction;\n 1- Yes \n 2- No");
        int perform;
       // perform=kb.nextInt();//looping back to the top
            System.out.println("Transaction Ended, Please remove your card.");



    }
}
