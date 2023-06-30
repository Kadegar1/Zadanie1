package org.example.flight;

public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;

    // konstruktor, gettery, settery itp.

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
