public class FibonnaciSeries {
    public static void main(String[] args) {
        int num1 =0;
        int num2=1;
        int next;
        System.out.println(num1+","+num2);

        for(int i =1; i<9; i++)
        {
            next = num1+num2;
            System.out.println(next);
            num1= num2 ;
            num2  = next;  // here this two is written bcoz after sout next will come then again 0 and 1 will be counted as we have declared num 1 and 2 as 0 and 1 respectively so num1 will bcome num2 and num2 will become next so loop will continue
        }
    }
}
