public class IamPerfect {
  public static void main(String[] args) {

    for(int num=2;num<=10000;num++)
    {
        if(perfect(num))
        {
            System.out.println(num + " is perfect.");
            System.out.printf("Factors: ");


            for(int i=1;i<num;i++)
            {
                if (num % i == 0)
                {
                     System.out.print(i+" ");
                }
            }
            System.out.print("\n"); // add this line to your code

        }
    }
}
public static Boolean perfect(int num)
{
    int sum = 0;

    for(int i=1;i<num;i++)
    {
        if (num % i == 0)
        {
            sum+=i;
        }
    }
    return sum==num;
}
}

