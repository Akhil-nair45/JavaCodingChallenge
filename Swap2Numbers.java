//swapping two numbers with the help of third variable or temporary variable

public class Swap2Numbers{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = "+ a+" & b = "+b);

        //swaping values using temp variable
        int temp = a;//temp varible to store value of a in it
        a = b;
        b= temp;
        System.out.println("\nAfter Swapping :a = "+a + " and b = "+b);

}
}