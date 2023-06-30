package org.example.flight;

public class FlightSimulator {
    private Flight currentFlight;

    public void startSimulation(Flight flight) {
        this.currentFlight = flight;
        // symulacja lotu
    }

    public void endSimulation() {
        this.currentFlight = null;
        // zakończenie symulacji
    }
}
