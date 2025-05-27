public class Program14 {
    public static void main(String[] args) 
    {
        for (int num = 1; num <= 100; num++)
         {
            int temp = num;
            int rev = 0;

            while (temp > 0)
             {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            if (rev == num)
                System.out.println(num);
        }
    }
}
