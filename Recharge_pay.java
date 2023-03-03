import java.util.Scanner;
public class Recharge_pay
{
    public static void main(String args[])
    {
        int pack,type;
        Scanner sc =new Scanner(System.in);
        System.out.println("\n 1.Prepaid\n 2.Postpaid\n 3.Exit from menu\n");
        System.out.println("Select your Service: ");
        type=sc.nextInt();
        switch(type)
        {
            case 1:
            System.out.println(" 1.239(1.5 gb/d)1/m\n 2.700(1.5 gb/d)3/m\n 3.2800(1.5 gb/d)1/y\n 4.Exit From Menu");
            System.out.println("Select your pack from above: ");
            pack=sc.nextInt();
            switch(pack)
            {
                case 1:
                System.out.println(" 1.Recharge for pack of Rs 239\n 2.Recharge Later\n 3.Exit");
                System.out.println("Choose from Above: ");
                int rec=sc.nextInt();
                switch(rec)
                {
                    case 1:
                    System.out.println("Recharge Successfull! ");
                    break;

                    case 2:
                    System.out.println("Recharge Unsuccessfull! ");
                    break;

                    case 3:
                    System.exit(0);
                }
                break;
                
            
                case 2:
                System.out.println(" 1.Recharge for pack of Rs 700\n 2.Recharge Later\n");
                System.out.println("Choose from Above: ");
                rec=sc.nextInt();
                switch(rec)
                {
                    case 1:
                    System.out.println("Recharge Successfull! ");
                    break;

                    case 2:
                    System.out.println("Recharge Unsuccessfull! ");
                    break;

                    case 3:
                    System.exit(0);
                }
                break;

                case 3:
                System.out.println(" 1.Recharge for pack of Rs 2800\n 2.Recharge Later\n ");
                System.out.println("Choose from Above: ");
                rec=sc.nextInt();
                switch(rec)
                {
                    case 1:
                    System.out.println("Recharge Successfull! ");
                    break;

                    case 2:
                    System.out.println("Recharge Unsuccessfull! ");
                    break;

                    case 3:
                    System.exit(0);
                }
                break;
         
            }
            break;
            case 2:
            System.out.println("Enter your postpaid bill amount: ");
            long post=sc.nextLong();
            System.out.println(" 1.You Want to pay it now\n 2.Later\n 3.Exit From Menu");
            System.out.println("Choose from above: ");
            int pay=sc.nextInt();
            switch(pay)
            {
                case 1:
                System.out.println("Recharge Payed Successfully! ");
                break;
                case 2:
                System.out.println("Your Postpaid Recharge is Pending!  ");
                break;
                case 3:
                System.exit(0);
            }
            break;
            case 3:
            System.exit(0);

            default:
            {
                System.out.println("Enter Valid Input!");
            }
            break;
            
            


        }
    }
        
}

//Contributed by Shreyash