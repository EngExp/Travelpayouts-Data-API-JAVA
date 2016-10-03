/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TheCalendarOfPricesForAMonthDatumModel 
        extends TheCalendarOfPricesForAMonthModel {
    private static final long serialVersionUID = 5207182591822785008L;
    private boolean showToAffiliates = true;
    private int tripClass;
    private String origin;
    private String destination;
    private String departDate;
    private String returnDate;
    private int numberOfChanges;
    private int value;
    private String foundAt;
    private int distance;
    private boolean actual;
    /** GETTER
     * false - all the prices, true - just the prices, found using the partner marker (recommended)
     */
    @JsonGetter("show_to_affiliates")
    public boolean getShowToAffiliates ( ) { 
        return this.showToAffiliates;
    }
    
    /** SETTER
     * false - all the prices, true - just the prices, found using the partner marker (recommended)
     */
    @JsonSetter("show_to_affiliates")
    public void setShowToAffiliates (boolean value) { 
        this.showToAffiliates = value;
    }
 
    /** GETTER
     * the flight class. 0 — the economy class, 1 — the business class, 2 — the first class.
     */
    @JsonGetter("trip_class")
    public int getTripClass ( ) { 
        return this.tripClass;
    }
    
    /** SETTER
     * the flight class. 0 — the economy class, 1 — the business class, 2 — the first class.
     */
    @JsonSetter("trip_class")
    public void setTripClass (int value) { 
        this.tripClass = value;
    }
 
    /** GETTER
     * the point of departure
     */
    @JsonGetter("origin")
    public String getOrigin ( ) { 
        return this.origin;
    }
    
    /** SETTER
     * the point of departure
     */
    @JsonSetter("origin")
    public void setOrigin (String value) { 
        this.origin = value;
    }
 
    /** GETTER
     * the point of destination
     */
    @JsonGetter("destination")
    public String getDestination ( ) { 
        return this.destination;
    }
    
    /** SETTER
     * the point of destination
     */
    @JsonSetter("destination")
    public void setDestination (String value) { 
        this.destination = value;
    }
 
    /** GETTER
     * the date of departure
     */
    @JsonGetter("depart_date")
    public String getDepartDate ( ) { 
        return this.departDate;
    }
    
    /** SETTER
     * the date of departure
     */
    @JsonSetter("depart_date")
    public void setDepartDate (String value) { 
        this.departDate = value;
    }
 
    /** GETTER
     * the date of return
     */
    @JsonGetter("return_date")
    public String getReturnDate ( ) { 
        return this.returnDate;
    }
    
    /** SETTER
     * the date of return
     */
    @JsonSetter("return_date")
    public void setReturnDate (String value) { 
        this.returnDate = value;
    }
 
    /** GETTER
     * the number of transfers
     */
    @JsonGetter("number_of_changes")
    public int getNumberOfChanges ( ) { 
        return this.numberOfChanges;
    }
    
    /** SETTER
     * the number of transfers
     */
    @JsonSetter("number_of_changes")
    public void setNumberOfChanges (int value) { 
        this.numberOfChanges = value;
    }
 
    /** GETTER
     * the cost of a flight, in the currency specified
     */
    @JsonGetter("value")
    public int getValue ( ) { 
        return this.value;
    }
    
    /** SETTER
     * the cost of a flight, in the currency specified
     */
    @JsonSetter("value")
    public void setValue (int value) { 
        this.value = value;
    }
 
    /** GETTER
     * the time and the date, for which a ticket was found
     */
    @JsonGetter("found_at")
    public String getFoundAt ( ) { 
        return this.foundAt;
    }
    
    /** SETTER
     * the time and the date, for which a ticket was found
     */
    @JsonSetter("found_at")
    public void setFoundAt (String value) { 
        this.foundAt = value;
    }
 
    /** GETTER
     * the distance between the point of departure and the point of destination
     */
    @JsonGetter("distance")
    public int getDistance ( ) { 
        return this.distance;
    }
    
    /** SETTER
     * the distance between the point of departure and the point of destination
     */
    @JsonSetter("distance")
    public void setDistance (int value) { 
        this.distance = value;
    }
 
    /** GETTER
     * the actuality of an offer
     */
    @JsonGetter("actual")
    public boolean getActual ( ) { 
        return this.actual;
    }
    
    /** SETTER
     * the actuality of an offer
     */
    @JsonSetter("actual")
    public void setActual (boolean value) { 
        this.actual = value;
    }
 
}
 