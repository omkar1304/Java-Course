/*
        Topic : Encapsulation
*/


// Encapsulation -> to bind private data(variables) with public methods(functions)
// to access private variable we can use get and set method to access and assign value respectively.
class Student{

    // private variables
    private int roll_number;
    private String name;

   // Assigning value to private variables using set method
   public void setRoll_number(int roll_number){
       this.roll_number = roll_number;
   }

   public void setName(String name){
       this.name = name;
   }

    // Accessing private variables using get method
   public int getRoll_number(){
       return this.roll_number;
   }

   public String getName() {
       return this.name;
   }
}
public class JavaCode17 {

    public static void main(String[] args) {

        Student student = new Student();

        student.setRoll_number(36);
        student.setName("Omkar");

        System.out.println(student.getRoll_number());
        System.out.println(student.getName());

    }
}
