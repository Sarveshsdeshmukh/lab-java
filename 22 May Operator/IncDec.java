public class IncDec {
    public static void main(String args[]){
        int a = 10 ;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        ++a;
        System.out.println(a);
        --a;
        System.out.println(a);
        System.out.println("-----------------------------------------------------");
        System.out.println("Here is the simple thing to be noted the that if we apply the incrementation or decrementation on the single element then it will not affect the result !");

        System.out.println("-----------------------------------------------------");

        int b = a++ + ++a + --a + a--;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------------------------------------------");

        System.out.println("The difference is only found when we try to apple assigining on to the another element !");

    }   
}
