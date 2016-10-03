/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.models;

import java.util.*;

public class AirplaneDataInJsonFormatModelBuilder {
    //the instance to build
    private AirplaneDataInJsonFormatModel airplaneDataInJsonFormatModel;

    /**
     * Default constructor to initialize the instance
     */
    public AirplaneDataInJsonFormatModelBuilder() {
        airplaneDataInJsonFormatModel = new AirplaneDataInJsonFormatModel();
    }

    /**
     * plane IATA code
     */
    public AirplaneDataInJsonFormatModelBuilder code(String code) {
        airplaneDataInJsonFormatModel.setCode(code);
        return this;
    }

    /**
     * plane name
     */
    public AirplaneDataInJsonFormatModelBuilder name(String name) {
        airplaneDataInJsonFormatModel.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AirplaneDataInJsonFormatModel build() {
        return airplaneDataInJsonFormatModel;
    }
}