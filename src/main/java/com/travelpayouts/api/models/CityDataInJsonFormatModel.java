/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CityDataInJsonFormatModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5188258304400704854L;
    private String code;
    private String name;
    private LinkedHashMap<String, CityDataInJsonFormatCoordinatesModel> coordinates;
    private String timeZone;
    private LinkedHashMap<String, String> nameTranslations;
    private String countryCode;
    /** GETTER
     * city IATA-code
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * city IATA-code
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * city name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * city name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * city coordinates
     */
    @JsonGetter("coordinates")
    public LinkedHashMap<String, CityDataInJsonFormatCoordinatesModel> getCoordinates ( ) { 
        return this.coordinates;
    }
    
    /** SETTER
     * city coordinates
     */
    @JsonSetter("coordinates")
    public void setCoordinates (LinkedHashMap<String, CityDataInJsonFormatCoordinatesModel> value) { 
        this.coordinates = value;
    }
 
    /** GETTER
     * timezone relative to GMT
     */
    @JsonGetter("time_zone")
    public String getTimeZone ( ) { 
        return this.timeZone;
    }
    
    /** SETTER
     * timezone relative to GMT
     */
    @JsonSetter("time_zone")
    public void setTimeZone (String value) { 
        this.timeZone = value;
    }
 
    /** GETTER
     * translation of city name
     */
    @JsonGetter("name_translations")
    public LinkedHashMap<String, String> getNameTranslations ( ) { 
        return this.nameTranslations;
    }
    
    /** SETTER
     * translation of city name
     */
    @JsonSetter("name_translations")
    public void setNameTranslations (LinkedHashMap<String, String> value) { 
        this.nameTranslations = value;
    }
 
    /** GETTER
     * country IATA-code
     */
    @JsonGetter("country_code")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * country IATA-code
     */
    @JsonSetter("country_code")
    public void setCountryCode (String value) { 
        this.countryCode = value;
    }
 
}
 