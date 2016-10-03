/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DataOnTheRoutesInJsonFormatModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5737834746805196430L;
    private String airlineIata;
    private String airlineIcao;
    private String departureAirportIata;
    private String departureAirportIcao;
    private String arrivalAirportIata;
    private String arrivalAirportIcao;
    private boolean codeshare;
    private int transfers;
    private List<String> planes;
    /** GETTER
     * IATA of airline
     */
    @JsonGetter("airline_iata")
    public String getAirlineIata ( ) { 
        return this.airlineIata;
    }
    
    /** SETTER
     * IATA of airline
     */
    @JsonSetter("airline_iata")
    public void setAirlineIata (String value) { 
        this.airlineIata = value;
    }
 
    /** GETTER
     * ICAO of airline
     */
    @JsonGetter("airline_icao")
    public String getAirlineIcao ( ) { 
        return this.airlineIcao;
    }
    
    /** SETTER
     * ICAO of airline
     */
    @JsonSetter("airline_icao")
    public void setAirlineIcao (String value) { 
        this.airlineIcao = value;
    }
 
    /** GETTER
     * IATA of airport of departure
     */
    @JsonGetter("departure_airport_iata")
    public String getDepartureAirportIata ( ) { 
        return this.departureAirportIata;
    }
    
    /** SETTER
     * IATA of airport of departure
     */
    @JsonSetter("departure_airport_iata")
    public void setDepartureAirportIata (String value) { 
        this.departureAirportIata = value;
    }
 
    /** GETTER
     * ICAO of airport of departure
     */
    @JsonGetter("departure_airport_icao")
    public String getDepartureAirportIcao ( ) { 
        return this.departureAirportIcao;
    }
    
    /** SETTER
     * ICAO of airport of departure
     */
    @JsonSetter("departure_airport_icao")
    public void setDepartureAirportIcao (String value) { 
        this.departureAirportIcao = value;
    }
 
    /** GETTER
     * IATA of airport of arrival
     */
    @JsonGetter("arrival_airport_iata")
    public String getArrivalAirportIata ( ) { 
        return this.arrivalAirportIata;
    }
    
    /** SETTER
     * IATA of airport of arrival
     */
    @JsonSetter("arrival_airport_iata")
    public void setArrivalAirportIata (String value) { 
        this.arrivalAirportIata = value;
    }
 
    /** GETTER
     * ICAO of airport of arrival
     */
    @JsonGetter("arrival_airport_icao")
    public String getArrivalAirportIcao ( ) { 
        return this.arrivalAirportIcao;
    }
    
    /** SETTER
     * ICAO of airport of arrival
     */
    @JsonSetter("arrival_airport_icao")
    public void setArrivalAirportIcao (String value) { 
        this.arrivalAirportIcao = value;
    }
 
    /** GETTER
     * it shows whether the flight performs the same company that sells the ticket
     */
    @JsonGetter("codeshare")
    public boolean getCodeshare ( ) { 
        return this.codeshare;
    }
    
    /** SETTER
     * it shows whether the flight performs the same company that sells the ticket
     */
    @JsonSetter("codeshare")
    public void setCodeshare (boolean value) { 
        this.codeshare = value;
    }
 
    /** GETTER
     * the number of direct
     */
    @JsonGetter("transfers")
    public int getTransfers ( ) { 
        return this.transfers;
    }
    
    /** SETTER
     * the number of direct
     */
    @JsonSetter("transfers")
    public void setTransfers (int value) { 
        this.transfers = value;
    }
 
    /** GETTER
     * IATA of airplane
     */
    @JsonGetter("planes")
    public List<String> getPlanes ( ) { 
        return this.planes;
    }
    
    /** SETTER
     * IATA of airplane
     */
    @JsonSetter("planes")
    public void setPlanes (List<String> value) { 
        this.planes = value;
    }
 
}
 