package org.example.test;

import org.example.flight.Flight;
import org.example.flight.FlightSimulator;
import org.example.logging.FlightLogger;

public class FlightSimulationTest {
    public static void main(String[] args) {
        Flight flight = new Flight("ABC123", "New York", "London");
        FlightSimulator simulator = new FlightSimulator();

        simulator.startSimulation(flight);

        // Instrukcje symulujące lot

        simulator.endSimulation();

        FlightLogger.logFlightInfo(flight);
    }
}
