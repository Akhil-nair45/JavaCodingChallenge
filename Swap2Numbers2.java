//here we are going to swap2 numbers without third variable erailier we did with the help of third variable

public class Swap2Numbers2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("Before Swapping a = "+a+" & b = "+b);

        //now we are going to swap 2 numbers without temporary variables
        //we are using 1st method now
        // a = a+b;  // 1+2 =3 updated value of a is 3
        // b = a-b;  // 3-2 =1 updated value of b is 1
        // a = a-b;  // 3-1 =2 updated values of a = 3-1 =2
        // System.out.println(a);
        // System.out.println(b);



        //another method to swap
        //2nd method 
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a);
        System.out.println(b);

    }
}
