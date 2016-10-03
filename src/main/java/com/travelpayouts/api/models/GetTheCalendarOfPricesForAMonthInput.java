/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GetTheCalendarOfPricesForAMonthInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5376039288010091512L;
    private String currency = "RUB";
    private String origin;
    private String destination;
    private String month;
    private Boolean showToAffiliates = true;
    /** GETTER
     * the airline tickets currency
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * the airline tickets currency
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
    /** GETTER
     * the point of departure. The IATA city code or the country code. The length - from 2 to 3 symbols
     */
    @JsonGetter("origin")
    public String getOrigin ( ) { 
        return this.origin;
    }
    
    /** SETTER
     * the point of departure. The IATA city code or the country code. The length - from 2 to 3 symbols
     */
    @JsonSetter("origin")
    public void setOrigin (String value) { 
        this.origin = value;
    }
 
    /** GETTER
     * the point of destination. The IATA city code or the country code. The length - from 2 to 3 symbols. Note! If the point of departure and the point of destination are not specified, then the API shall bring 30 the most cheapest tickets, which have been found during the recent 48 hours, back.
     */
    @JsonGetter("destination")
    public String getDestination ( ) { 
        return this.destination;
    }
    
    /** SETTER
     * the point of destination. The IATA city code or the country code. The length - from 2 to 3 symbols. Note! If the point of departure and the point of destination are not specified, then the API shall bring 30 the most cheapest tickets, which have been found during the recent 48 hours, back.
     */
    @JsonSetter("destination")
    public void setDestination (String value) { 
        this.destination = value;
    }
 
    /** GETTER
     * the beginning of the month in the YYYY-MM-DD format
     */
    @JsonGetter("month")
    public String getMonth ( ) { 
        return this.month;
    }
    
    /** SETTER
     * the beginning of the month in the YYYY-MM-DD format
     */
    @JsonSetter("month")
    public void setMonth (String value) { 
        this.month = value;
    }
 
    /** GETTER
     * false - все цены, true - только цены, найденные с партнёрским маркером (рекомендовано). Значение по умолчанию - true.
     */
    @JsonGetter("show_to_affiliates")
    public Boolean getShowToAffiliates ( ) { 
        return this.showToAffiliates;
    }
    
    /** SETTER
     * false - все цены, true - только цены, найденные с партнёрским маркером (рекомендовано). Значение по умолчанию - true.
     */
    @JsonSetter("show_to_affiliates")
    public void setShowToAffiliates (Boolean value) { 
        this.showToAffiliates = value;
    }
 
}
 