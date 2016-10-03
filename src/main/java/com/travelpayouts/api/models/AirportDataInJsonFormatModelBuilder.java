/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.models;

import java.util.*;

public class AirportDataInJsonFormatModelBuilder {
    //the instance to build
    private AirportDataInJsonFormatModel airportDataInJsonFormatModel;

    /**
     * Default constructor to initialize the instance
     */
    public AirportDataInJsonFormatModelBuilder() {
        airportDataInJsonFormatModel = new AirportDataInJsonFormatModel();
    }

    /**
     * airport IATA code
     */
    public AirportDataInJsonFormatModelBuilder code(String code) {
        airportDataInJsonFormatModel.setCode(code);
        return this;
    }

    /**
     * airport name
     */
    public AirportDataInJsonFormatModelBuilder name(String name) {
        airportDataInJsonFormatModel.setName(name);
        return this;
    }

    /**
     * airport longitude and latitude
     */
    public AirportDataInJsonFormatModelBuilder coordinates(LinkedHashMap<String, AirportDataInJsonFormatCoordinatesModel> coordinates) {
        airportDataInJsonFormatModel.setCoordinates(coordinates);
        return this;
    }

    /**
     * time zone relative to GMT
     */
    public AirportDataInJsonFormatModelBuilder timeZone(String timeZone) {
        airportDataInJsonFormatModel.setTimeZone(timeZone);
        return this;
    }

    /**
     * the name of the airport in different languages
     */
    public AirportDataInJsonFormatModelBuilder nameTranslations(LinkedHashMap<String, String> nameTranslations) {
        airportDataInJsonFormatModel.setNameTranslations(nameTranslations);
        return this;
    }

    /**
     * country IATA code
     */
    public AirportDataInJsonFormatModelBuilder countryCode(String countryCode) {
        airportDataInJsonFormatModel.setCountryCode(countryCode);
        return this;
    }

    /**
     * city IATA code
     */
    public AirportDataInJsonFormatModelBuilder cityCode(String cityCode) {
        airportDataInJsonFormatModel.setCityCode(cityCode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AirportDataInJsonFormatModel build() {
        return airportDataInJsonFormatModel;
    }
}