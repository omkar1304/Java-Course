/*
        Topic : IF-Else & Switch & Ternary
*/

public class JavaCode3 {
    
    public static void main(String[] args) {
        
        // if-else

        int n = 7;

        if(n==0){
            System.out.println("Zero Number");
        }
        else if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }


        // switch
        int n1=10, n2=5;
        char c = '+';

        switch(c){

            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println((double)n1/n2); // to get value in decimal format
                break;
            default:
                System.out.println("Wrong Choice");
        }

        // Ternary Operator

        int number = 5;
        int res;
        // condition?exp1:exp2 
        res = (number>10)?1:2;
        System.out.println(res);
    }
}
