public class FibonacciSeries
{
    public static void main(String [] args)
    {
        int i= 0, j=1;
         System.out.println(i);
         System.out.println(j);
        while (i+j <1000)
        {
            int k= i+j;
            System.out.println(k);
            i=j;
            j=k;
        }
    }
}
