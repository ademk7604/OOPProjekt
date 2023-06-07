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

        //Encapsulation // property lerin get yada set ne olmasini istiyordam orda private yapmis be belirtmisimdir.
        Musician james =new Musician("James","Guitar",50);{
            james.setAge(72,"Atil"); // programci Atil sifresini girdiginde yasi degistrebildi asagida gordu.
            System.out.println(james.getAge());
    // normalde boyle kullanim olmaz Enc. anlamak icin kullandik. kucuk a ile atil yazdigimda run da 50 veriyor
        }


    }
}
