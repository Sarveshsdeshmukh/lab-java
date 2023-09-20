public class whileDo{
    public static void main(String args[]){
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }

        int j = 0;
        do{
            System.out.println("We're in the Do While Loop.");
            j++;
        }while(j < 5);
    }
}