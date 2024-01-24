//to check whether the number are prime number or not
//prime number are number >1 and only self derived


public class Primenocheck {
    public static void main(String[] args) {
        int num = 5;
        boolean check = false;

        for(int i=2 ; i<num; i++)
        {
            if(num%i !=0)
            {
                check= true;
                // System.out.println("It is a prime number"+num); // as it was giving many results
            }
            else{
            System.out.println("It is not a prime number");
            break;
            }
        }
        if(check)
        {
            System.out.println("It is a prime number");
        }
    }
}
