public class Printdigits {
    public static void main(String[] args) {
        int num =123;
        while(num>0)
        {
            System.out.println(num%10); // the above statement will give 3 as 123/10 will give reminder 3 
            num=num/10;  // here 123/10 =12 so 12 will go above in loop and then num%10 = 12/10 = 2 reminder so 2 will be printed  and so om
            System.out.println(num);  // comment this u will get 3 2 1 this is fir understandiung how it wil work it will give all value    
        }
    }
}
