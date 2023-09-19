public class Switch {
    public static void main(String args[]){
        int num = 34 ;

        switch(num){
            case 17 :System.out.println("--------->half of the 34<----------");
            break;
            case 34 : System.out.println("--------->34<----------");
            break;
            case 78 :System.out.println("--------->Double of the 34<----------");
            break; 

            default:System.out.println("It is Default Case .");
        }


        String operation = "div";
        float num1 = 23f , num2 = 34f;

        switch(operation){
            case "add" : System.out.println("Addition of the Numbers is --->"+ (num1 + num2) );
            break ;
            case "sub" : System.out.println("Sub of the Numbers is --->"+ (num1 - num2) );
            break ;
            case "mul" : System.out.println("Mul of the Numbers is --->"+ (num1 * num2) );
            break ;
            case "div" : System.out.println("Div of the Numbers is --->"+ (num1 / num2) );
            break ; 

            default : System.out.println("You Entered Wrong Choice!!!");
        }

    }
}
