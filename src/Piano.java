public class Piano implements Instrument,HouseDecor{

    String brand;

    boolean isDigital;

    @Override
    public void info() {
        System.out.println("Overrid Method");
    }
}
