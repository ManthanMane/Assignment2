public class Program9 {
    public static void main(String[] args) 
    {
        int num = 121, rev = 0, original = num;
        while (num != 0)
         {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(original == rev ? "Palindrome" : "Not Palindrome");
    }
}
