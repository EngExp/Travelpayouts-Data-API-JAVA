/*
 * TravelpayoutsDataAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/03/2016
 */
package com.travelpayouts.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.travelpayouts.api.*;
import com.travelpayouts.api.models.*;
import com.travelpayouts.api.exceptions.*;
import com.travelpayouts.api.http.client.HttpClient;
import com.travelpayouts.api.http.client.HttpContext;
import com.travelpayouts.api.http.request.HttpRequest;
import com.travelpayouts.api.http.response.HttpResponse;
import com.travelpayouts.api.http.response.HttpStringResponse;
import com.travelpayouts.api.http.client.APICallBack;
import com.travelpayouts.api.http.client.APIStreamingCallBack;
import com.travelpayouts.api.controllers.syncwrapper.APICallBackCatcher;

public class AirplaneDataInJsonFormatController extends BaseStreamController<List<AirplaneDataInJsonFormatModel>> {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static AirplaneDataInJsonFormatController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the AirplaneDataInJsonFormatController class 
     */
    public static AirplaneDataInJsonFormatController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new AirplaneDataInJsonFormatController();
            }
        }
        return instance;
    }

    /**
     * API returns a file with a list of airplanes from the database
     * @return    Returns the void response from the API call 
     */
    public void getAirplaneDataInJsonFormatAsync(
                final APIStreamingCallBack<List<AirplaneDataInJsonFormatModel>> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/data/planes.json ");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5265708762320012466L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "X-Access-Token", Configuration.xAccessToken );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //OAUTH1.0 header to be appended for authorization
        OAuthUtility.appendOAuthParams(_request);

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            initializeStreamReader(callBack, _response);

                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}