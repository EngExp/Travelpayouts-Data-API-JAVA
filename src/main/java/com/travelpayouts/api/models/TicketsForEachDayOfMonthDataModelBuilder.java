/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.models;

import java.util.*;

public class TicketsForEachDayOfMonthDataModelBuilder 
        extends TicketsForEachDayOfMonthModelBuilder {
    //the instance to build
    private TicketsForEachDayOfMonthDataModel ticketsForEachDayOfMonthDataModel;

    /**
     * Default constructor to initialize the instance
     */
    public TicketsForEachDayOfMonthDataModelBuilder() {
        ticketsForEachDayOfMonthDataModel = new TicketsForEachDayOfMonthDataModel();
    }

    /**
     * IATA code of departure city
     */
    public TicketsForEachDayOfMonthDataModelBuilder origin(String origin) {
        ticketsForEachDayOfMonthDataModel.setOrigin(origin);
        return this;
    }

    /**
     * IATA code of destination city
     */
    public TicketsForEachDayOfMonthDataModelBuilder destination(String destination) {
        ticketsForEachDayOfMonthDataModel.setDestination(destination);
        return this;
    }

    /**
     * ticket price in the specified currency
     */
    public TicketsForEachDayOfMonthDataModelBuilder price(int price) {
        ticketsForEachDayOfMonthDataModel.setPrice(price);
        return this;
    }

    /**
     * number of stops
     */
    public TicketsForEachDayOfMonthDataModelBuilder transfers(int transfers) {
        ticketsForEachDayOfMonthDataModel.setTransfers(transfers);
        return this;
    }

    /**
     * IATA code of airline
     */
    public TicketsForEachDayOfMonthDataModelBuilder airline(String airline) {
        ticketsForEachDayOfMonthDataModel.setAirline(airline);
        return this;
    }

    /**
     * flight number
     */
    public TicketsForEachDayOfMonthDataModelBuilder flightNumber(int flightNumber) {
        ticketsForEachDayOfMonthDataModel.setFlightNumber(flightNumber);
        return this;
    }

    /**
     * departure Date
     */
    public TicketsForEachDayOfMonthDataModelBuilder departureAt(String departureAt) {
        ticketsForEachDayOfMonthDataModel.setDepartureAt(departureAt);
        return this;
    }

    /**
     * return Date
     */
    public TicketsForEachDayOfMonthDataModelBuilder returnAt(String returnAt) {
        ticketsForEachDayOfMonthDataModel.setReturnAt(returnAt);
        return this;
    }

    /**
     * when the found price expires (UTC+0)
     */
    public TicketsForEachDayOfMonthDataModelBuilder expiresAt(String expiresAt) {
        ticketsForEachDayOfMonthDataModel.setExpiresAt(expiresAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TicketsForEachDayOfMonthDataModel build() {
        return ticketsForEachDayOfMonthDataModel;
    }
}