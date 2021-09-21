import java.util.Scanner;

public class ArmstrongNo
{
    public static void main(String [] args)
    {
        //Take input of no.
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter no= ");
        String str = sc.nextLine(); // read string
        int no = Integer.parseInt(str);*/ //convert string to integer

       // int no= 153   //hardcoded value
       int maxNumbers=0;
        for(int no= 0; no< 500 & maxNumbers<=5 ; no++)
        {

                int mod, arm = 0;
            // check length of digits
                String s = String.valueOf(no);
            int len = s.length();
            //System.out.println(len);
            // calculation
            int n = no;
            for (int i = 0; i < len; i++)
              {
                mod = n % 10;
                arm += (Math.pow(mod, len));
                n = n / 10;
              }
//            if(maxNumbers==5)
//            {s
//                break;
//            }

            // check if armstrong no or not
                if (no == arm)
                {
                    maxNumbers+=1;
                    System.out.println(no + " " + "is a Armstrong no");
                }
        }/*else {
                System.out.println(no + " " + "is not a Armstrong no");
            }*/

    }

}
