//komenatrz
package org.example.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FlightLogger {
    private static final Logger LOGGER = LogManager.getLogger(FlightLogger.class);

    public static void logFlightInfo(Flight flight) {
        LOGGER.info("Flight info: " + flight.toString());
    }
}
