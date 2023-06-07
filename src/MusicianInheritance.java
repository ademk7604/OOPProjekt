public class MusicianInheritance extends Musician{

    public MusicianInheritance(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    public String sing(){
        return "Nothing Else Matters";
    }
}
