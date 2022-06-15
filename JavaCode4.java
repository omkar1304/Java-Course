/*
        Topic : Loops in Java
*/

public class JavaCode4 {
    
    public static void main(String[] args) {
        
        // for loop
        System.out.println("For loop output");
        for(int i=1;i<=5;i++){

            System.out.println(i);
        }

        //while loop
        System.out.println("While loop output");
        int j = 1;

        while(j<=5){

            System.out.println(j);
            j = j + 1;
        }

        // do-while loop
        System.out.println("Do-While loop output");
        int x = 5;

        do{
            System.out.println(x); // it will run first time without checking
        }while(x>100);


        // for-each loop
        System.out.println("For-Each loop output");

        int k[] = {1,2,3,4,5}; 

        for(int res:k){ // same as map function
            System.out.println(res);
        }

    } 

}
