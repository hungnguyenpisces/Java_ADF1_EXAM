package Exercise2;

public class FlightMain {
    public static void main(String[] args) {
        Flight g1 = new Flight(857, "Toronto");
        g1.display();
        System.out.println();
        Flight fl2 = new Flight();
        fl2.inputFlight();
        fl2.display();
    }
}
