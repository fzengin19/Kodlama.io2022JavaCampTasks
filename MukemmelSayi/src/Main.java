public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number  = 5;
        int total =0 ;
        for (int i = 0; i<number;i++)
        {
            if(number % i ==0)
            {
                total +=i;
            }
        }
        if(total == number)
        {
            System.out.println("Mükemmel sayıdır");
        }else{
            System.out.println("Mükemmel sayı değildir");
        }
    }
}