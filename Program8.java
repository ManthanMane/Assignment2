public class Program8 {
    public static void main(String[] args)
     {
        int num = 1234, rev = 0;
        while (num != 0) 
        {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse: " + rev);
    }
}
