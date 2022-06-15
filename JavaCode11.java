/*
        Topic : Arrays (1D, 2D, jagged)
*/

public class JavaCode11 {
    
    public static void main(String[] args) {
        
        // ! 1D array
        int a[] = {1,2,3,4,5};

        // display element using for loop
        for(int i=0;i<a.length;i++){

            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println();

        // display element using for-each loop
        for(int i: a){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // ! 2D array
        int b[][] = { {1,2,3}, {4,5,6}, {7,8,9}};

        // display element using for loop
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                    System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // display element using for-each loop
        
        for(int p[] : b){  // here p[] -> because p taking each inner array in b.
            for(int q : p){
                System.out.print(q + " ");
            }
            System.out.println();
        }

        System.out.println();

        // ! Jagged array

        int c[][] = { {1,2,}, {3,4,5,6}, {7}};  //jagged -> not in same length(inner)

        // display element using for loop
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                    System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // display element using for-each loop
        
        for(int p[] : c){  // here p[] -> because p taking each inner array in b.
            for(int q : p){
                System.out.print(q + " ");
            }
            System.out.println();
        }


    }
}
