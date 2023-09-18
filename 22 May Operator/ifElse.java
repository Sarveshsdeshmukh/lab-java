public class ifElse {
    public static void main(String args[]){
        System.out.println("---------------------------------------------------------------------");
        int age = 90 ;
        if(age >= 18){
            System.out.println("You are eligible for the Voting !");
        }else{
            System.out.println("You are a Kid ; Please Stay in Your Home !");
        }
        System.out.println("---------------------------------------------------------------------");

        System.out.println("Examples of the If-Else Ladder ");

        if(age >= 18 && age <= 60){
            System.out.println("You are adult ; jeelo apni Zindagi");
        }else if(age >60){
            System.out.println("You are now Old Man !");
        }else{
            System.out.println("You are now Kid !");
            System.out.println("You can also Live your Zindagi !");
        }
        System.out.println("---------------------------------------------------------------------");
    
        System.out.println("Example of the If else (Nested)");
        System.out.println("---------------------------------------------------------------------");

        if(age < 18){
            System.out.println("You are child !");
        }else if(age >= 18 && age <= 40 ){
            if(age >= 18 && age <= 30){
                System.out.println("You are in your  To Young Age ! and also tennager ! ");
            }
            else{
                System.out.println("You are in your  past Young Age !");
            }
        }else if(age >= 40 && age <= 60){
            if(age >= 40 && age <= 50){
                System.out.println("You are in your  To Matured Age !");
            }else{
                System.out.println("You are in your  past Matured Age !");
            }
        }else{
            System.out.println("You are in your Old Age !");
        }

        System.out.println("---------------------------------------------------------------------");

    }
}
