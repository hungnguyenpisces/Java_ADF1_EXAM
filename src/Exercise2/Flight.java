package Exercise2;

import java.util.Scanner;

public class Flight {
    private int number;
    private String destination;
    Scanner sc = new Scanner(System.in);

    public Flight() {
        super();
        this.number = 0;
    }

    public Flight(int number, String destination) {
        super();
        this.number = number;
        this.destination = destination;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void inputFlight() {
        System.out.println("----------Input new Flight info---------");
        System.out.println("Flight number: ");
        this.number = sc.nextInt();
        sc.nextLine();
        System.out.println("Destination: ");
        this.destination = sc.nextLine();
    }

    public void display() {
        System.out.println("Flight number " + getNumber() + ", destination is " + getDestination());
    }
}
