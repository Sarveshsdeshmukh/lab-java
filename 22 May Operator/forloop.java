public class forloop {
    public static void main(String args[]){
        // int i ;

        // for(i = 0 ; i < 10 ; i++){
        //     System.out.println("<>  -------> " + i);
        // }

        int n = 5;


        for(int j = 0 ; j < n ; j++){
            for(int k = j ; k < n ; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
