public class Logical{
    public static void main(String args[]){
        int a = 10 ;
        int b = 34;
        int c = 23;

        System.out.println((a < b) && (b < c) && (c > a));
        System.out.println((a < b) || (b > c) || (c > a));
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("---------------------------------------------Another Result ---------------------------------------");

        boolean result ;
        result = ((a < b) && (b < c) && (c > a));
        System.out.println(result);
    }
}