/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TheCalendarOfPricesForAMonthModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4849470483773791446L;
    private boolean success;
    private List<TheCalendarOfPricesForAMonthDatumModel> data;
    /** GETTER
     * true - request is successful, false - the response has error
     */
    @JsonGetter("success")
    public boolean getSuccess ( ) { 
        return this.success;
    }
    
    /** SETTER
     * true - request is successful, false - the response has error
     */
    @JsonSetter("success")
    public void setSuccess (boolean value) { 
        this.success = value;
    }
 
    /** GETTER
     * result of the request; in case of an error is equal to null
     */
    @JsonGetter("data")
    public List<TheCalendarOfPricesForAMonthDatumModel> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * result of the request; in case of an error is equal to null
     */
    @JsonSetter("data")
    public void setData (List<TheCalendarOfPricesForAMonthDatumModel> value) { 
        this.data = value;
    }
 
}
 