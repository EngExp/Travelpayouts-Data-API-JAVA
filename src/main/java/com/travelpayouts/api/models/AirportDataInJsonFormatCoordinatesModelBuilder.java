/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.models;

import java.util.*;

public class AirportDataInJsonFormatCoordinatesModelBuilder 
        extends AirportDataInJsonFormatModelBuilder {
    //the instance to build
    private AirportDataInJsonFormatCoordinatesModel airportDataInJsonFormatCoordinatesModel;

    /**
     * Default constructor to initialize the instance
     */
    public AirportDataInJsonFormatCoordinatesModelBuilder() {
        airportDataInJsonFormatCoordinatesModel = new AirportDataInJsonFormatCoordinatesModel();
    }

    /**
     * airport longitude
     */
    public AirportDataInJsonFormatCoordinatesModelBuilder lon(double lon) {
        airportDataInJsonFormatCoordinatesModel.setLon(lon);
        return this;
    }

    /**
     * airport latitude
     */
    public AirportDataInJsonFormatCoordinatesModelBuilder lat(double lat) {
        airportDataInJsonFormatCoordinatesModel.setLat(lat);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AirportDataInJsonFormatCoordinatesModel build() {
        return airportDataInJsonFormatCoordinatesModel;
    }
}