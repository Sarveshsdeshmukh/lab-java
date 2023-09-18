import java.util.Scanner;
public class pattern {
    public static void main(String args[]){
        int i , j  ;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        int  n = myObj.nextInt();
        
        for( i = 0 ; i <= n ; i++){
            for(j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
