/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.models;

import java.util.*;

public class GetTheCalendarOfPricesForAWeekInputBuilder {
    //the instance to build
    private GetTheCalendarOfPricesForAWeekInput getTheCalendarOfPricesForAWeekInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetTheCalendarOfPricesForAWeekInputBuilder() {
        getTheCalendarOfPricesForAWeekInput = new GetTheCalendarOfPricesForAWeekInput();
    }

    /**
     * the airline tickets currency
     */
    public GetTheCalendarOfPricesForAWeekInputBuilder currency(String currency) {
        getTheCalendarOfPricesForAWeekInput.setCurrency(currency);
        return this;
    }

    /**
     * the point of departure. The IATA city code or the country code. The length - from 2 to 3 symbols
     */
    public GetTheCalendarOfPricesForAWeekInputBuilder origin(String origin) {
        getTheCalendarOfPricesForAWeekInput.setOrigin(origin);
        return this;
    }

    /**
     * the point of destination. The IATA city code or the country code. The length - from 2 to 3 symbols
     */
    public GetTheCalendarOfPricesForAWeekInputBuilder destination(String destination) {
        getTheCalendarOfPricesForAWeekInput.setDestination(destination);
        return this;
    }

    /**
     * day or month of departure (yyyy-mm-dd or yyyy-mm)
     */
    public GetTheCalendarOfPricesForAWeekInputBuilder departDate(Date departDate) {
        getTheCalendarOfPricesForAWeekInput.setDepartDate(departDate);
        return this;
    }

    /**
     * day or month of return (yyyy-mm-dd or yyyy-mm)
     */
    public GetTheCalendarOfPricesForAWeekInputBuilder returnDate(Date returnDate) {
        getTheCalendarOfPricesForAWeekInput.setReturnDate(returnDate);
        return this;
    }

    /**
     * false - all the prices, true - just the prices, found using the partner marker (recommended).
     */
    public GetTheCalendarOfPricesForAWeekInputBuilder showToAffiliates(Boolean showToAffiliates) {
        getTheCalendarOfPricesForAWeekInput.setShowToAffiliates(showToAffiliates);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetTheCalendarOfPricesForAWeekInput build() {
        return getTheCalendarOfPricesForAWeekInput;
    }
}