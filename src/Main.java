public class Main {

    public static void main(String[] args) {

        /*
        User myUser = new User();
        myUser.name= "Atil";
        myUser.job= "Istructor";

        User newUser = new User();
        newUser.name= "Kirk";
        newUser.job= "Musician";

         */

        User myUser = new User("Atil","Instructor");
        System.out.println(myUser.name);

        //Encapsulation
        Musician james =new Musician("James","Guitar",50);{
            System.out.println(james.getName());

        }


    }
}
