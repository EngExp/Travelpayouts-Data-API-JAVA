# Getting Started
## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](http://apidocs.io/illustration/java?step=import0&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](http://apidocs.io/illustration/java?step=import1&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](http://apidocs.io/illustration/java?step=import2&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](http://apidocs.io/illustration/java?step=import3&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

## How to Use

The following section explains how to use the TravelpayoutsDataAPI library in a new console project.     
    
#### 1. Starting a new project
For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](http://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](http://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location	```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](http://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](http://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](http://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)


#### 2. Add reference of the library project
The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *TravelpayoutsDataAPILib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](http://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

Clicking the ``` Add ``` button will open a dialog where you need to specify TravelpayoutsDataAPI in ``` Group Id ``` and TravelpayoutsDataAPILib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

#### 3. Write sample code
Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](http://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Travelpayouts Data API-Java&workspaceName=TravelpayoutsDataAPI&projectName=TravelpayoutsDataAPILib&rootNamespace=com.travelpayouts.api)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *TravelpayoutsDataAPILib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

#### Authentication and Initialization
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| xAccessToken | TODO: add a description |
| oAuthToken | The OAuth token to be set before API calls |
| oAuthTokenSecret | The OAuth token secret to be set before API calls |
| oAuthClientId | The OAuth client id to be set before API calls |
| oAuthClientSecret | The OAuth client secret to be set before API calls |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String xAccessToken = "af9512dd115b1081290b9ca7f0d418a2";
String oAuthToken = "oAuthToken"; // The OAuth token to be set before API calls
String oAuthTokenSecret = "oAuthTokenSecret"; // The OAuth token secret to be set before API calls
String oAuthClientId = "oAuthClientId"; // The OAuth client id to be set before API calls
String oAuthClientSecret = "oAuthClientSecret"; // The OAuth client secret to be set before API calls

TravelpayoutsDataAPIClient client = new TravelpayoutsDataAPIClient(xAccessToken, oAuthToken, oAuthTokenSecret, oAuthClientId, oAuthClientSecret);
```

# Class Reference
## <a name="list_of_controllers"></a>List of Controllers

* [TravelpayoutsDataAPIController](#travelpayouts_data_api_controller)
* [ThePricesForTheAirlineTicketsController](#the_prices_for_the_airline_tickets_controller)
* [NonStopTicketsController](#non_stop_tickets_controller)
* [PopularAirlineRoutesController](#popular_airline_routes_controller)
* [ThePopularDirectionsFromACityController](#the_popular_directions_from_a_city_controller)
* [DataOnTheRoutesInJsonFormatController](#data_on_the_routes_in_json_format_controller)
* [ThePricesForTheAlternativeDirectionsController](#the_prices_for_the_alternative_directions_controller)
* [TheCalendarOfPricesForAWeekController](#the_calendar_of_prices_for_a_week_controller)
* [CheapestTicketsController](#cheapest_tickets_controller)
* [TicketsForEachDayOfMonthController](#tickets_for_each_day_of_month_controller)
* [DataOfCountriesInJsonFormatController](#data_of_countries_in_json_format_controller)
* [CityDataInJsonFormatController](#city_data_in_json_format_controller)
* [AirportDataInJsonFormatController](#airport_data_in_json_format_controller)
* [AirlineDataInJsonFormatController](#airline_data_in_json_format_controller)
* [AllianceDataInJsonFormatController](#alliance_data_in_json_format_controller)
* [AirplaneDataInJsonFormatController](#airplane_data_in_json_format_controller)
* [TheCalendarOfPricesForAMonthController](#the_calendar_of_prices_for_a_month_controller)

## <a name="travelpayouts_data_api_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.TravelpayoutsDataAPIController") TravelpayoutsDataAPIController

#### Get singleton instance
The singleton instance of the ``` TravelpayoutsDataAPIController ``` class can be accessed from the API Client.
```java
TravelpayoutsDataAPIController travelpayoutsDataAPI = client.getTravelpayoutsDataAPI();
```

### <a name="get_special_offers_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.TravelpayoutsDataAPIController.getSpecialOffersAsync") getSpecialOffersAsync

> Brings the recent special offers from the airline companies back in the .XML format.

```java
void getSpecialOffersAsync(final APICallBack<String> callBack)
```

#### Example Usage:
```java
// Invoking the API call with sample inputs
travelpayoutsDataAPI.getSpecialOffersAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```





[Back to List of Controllers](#list_of_controllers)
## <a name="the_prices_for_the_airline_tickets_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.ThePricesForTheAirlineTicketsController") ThePricesForTheAirlineTicketsController

#### Get singleton instance
The singleton instance of the ``` ThePricesForTheAirlineTicketsController ``` class can be accessed from the API Client.
```java
ThePricesForTheAirlineTicketsController thePricesForTheAirlineTickets = client.getThePricesForTheAirlineTickets();
```

### <a name="get_the_prices_for_the_airline_tickets_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.ThePricesForTheAirlineTicketsController.getThePricesForTheAirlineTicketsAsync") getThePricesForTheAirlineTicketsAsync

> *Tags:*  ``` Streaming ``` 

> Brings back to the list of prices, found by our users during the recent 48 hours according to the filters used.

```java
void getThePricesForTheAirlineTicketsAsync(
        final GetThePricesForTheAirlineTicketsInput input,
        Map<String, Object> queryParameters,
        final APIStreamingCallBack<List<ThePricesForTheAirlineTicketsModel>> callBack)
```

#### Parameters: 

| Parameter | Tags | Description |
|-----------|------|-------------|
| currency |  ``` Required ```  ``` DefaultValue ```  | the airline tickets currency |
| origin |  ``` Required ```  | the point of departure. The IATA city code or the country code |
| destination |  ``` Required ```  | the point of destination. The IATA city code or the country code |
| beginningOfPeriod |  ``` Required ```  | the beginning of the period, within which the dates of departure fall (in the YYYY-MM-DD format, for example, 2016-05-01). Must be specified if period_type is equal to month |
| periodType |  ``` Required ```  ``` DefaultValue ```  | the period, for which the tickets have been found (the required parameter) |
| page |  ``` Required ```  ``` DefaultValue ```  | a page number |
| limit |  ``` Required ```  ``` DefaultValue ```  | the total number of records on a page. The maximum value — 1000 |
| tripDuration |  ``` Required ```  | the length of stay in weeks or days (for period_type=day) |
| oneWay |  ``` Optional ```  ``` DefaultValue ```  | true — one way, false — back-to-back. |
| showToAffiliates |  ``` Optional ```  ``` DefaultValue ```  | false — all the prices, true — just the prices, found using the partner marker (recommended) |
| sorting |  ``` Optional ```  ``` DefaultValue ```  | the assorting of prices. price — by the price (the default value). For the directions city — city assorting by the price is possible only; route — by the popularity of a route; distance_unit_price — by the price for 1 km. |
| tripClass |  ``` Optional ```  ``` DefaultValue ```  | trip_class. 0 — The economy class (the default value); 1 — The business class; 2 — The first class. |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage:
```java
GetThePricesForTheAirlineTicketsInput collect = new GetThePricesForTheAirlineTicketsInput();

String currency = "RUB";
collect.setCurrency(currency);

String origin = "origin";
collect.setOrigin(origin);

String destination = "destination";
collect.setDestination(destination);

Date beginningOfPeriod = new Date();
collect.setBeginningOfPeriod(beginningOfPeriod);

String periodType = "'year'";
collect.setPeriodType(periodType);

double page = 1;
collect.setPage(page);

double limit = 30;
collect.setLimit(limit);

String tripDuration = "trip_duration";
collect.setTripDuration(tripDuration);

Boolean oneWay = false;
collect.setOneWay(oneWay);

Boolean showToAffiliates = true;
collect.setShowToAffiliates(showToAffiliates);

String sorting = "price";
collect.setSorting(sorting);

String tripClass = "0";
collect.setTripClass(tripClass);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
thePricesForTheAirlineTickets.getThePricesForTheAirlineTicketsAsync(collect, , queryParams, new APICallBack<List<ThePricesForTheAirlineTicketsModel>>() {
    public void onSuccess(HttpContext context, List<ThePricesForTheAirlineTicketsModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void ThePricesForTheAirlineTickets_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<ThePricesForTheAirlineTicketsModel>> source, List<ThePricesForTheAirlineTicketsModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void ThePricesForTheAirlineTickets_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<ThePricesForTheAirlineTicketsModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="non_stop_tickets_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.NonStopTicketsController") NonStopTicketsController

#### Get singleton instance
The singleton instance of the ``` NonStopTicketsController ``` class can be accessed from the API Client.
```java
NonStopTicketsController nonStopTickets = client.getNonStopTickets();
```

### <a name="get_non_stop_tickets_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.NonStopTicketsController.getNonStopTicketsAsync") getNonStopTicketsAsync

> *Tags:*  ``` Streaming ``` 

> Returns the cheapest non-stop tickets for the selected route with departure/return date filters.

```java
void getNonStopTicketsAsync(
        final GetNonStopTicketsInput input,
        Map<String, Object> queryParameters,
        final APIStreamingCallBack<List<NonStopTicketsModel>> callBack)
```

#### Parameters: 

| Parameter | Tags | Description |
|-----------|------|-------------|
| currency |  ``` Required ```  ``` DefaultValue ```  | The airline tickets currency. |
| origin |  ``` Required ```  ``` DefaultValue ```  | IATA code of departure city. IATA code is shown by uppercase letters, for example MOW. |
| departDate |  ``` Required ```  | Day or month of departure (yyyy-mm-dd or yyyy-mm). |
| returnDate |  ``` Required ```  | Day or month of return (yyyy-mm-dd or yyyy-mm). |
| destination |  ``` Optional ```  | IATA code of destination city (for all routes, enter “-”). IATA code is shown by uppercase letters, for example MOW. |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage:
```java
GetNonStopTicketsInput collect = new GetNonStopTicketsInput();

String currency = "RUB";
collect.setCurrency(currency);

String origin = "HKT";
collect.setOrigin(origin);

Date departDate = new Date();
collect.setDepartDate(departDate);

Date returnDate = new Date();
collect.setReturnDate(returnDate);

String destination = "destination";
collect.setDestination(destination);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
nonStopTickets.getNonStopTicketsAsync(collect, , queryParams, new APICallBack<List<NonStopTicketsModel>>() {
    public void onSuccess(HttpContext context, List<NonStopTicketsModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void NonStopTickets_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<NonStopTicketsModel>> source, List<NonStopTicketsModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void NonStopTickets_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<NonStopTicketsModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="popular_airline_routes_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.PopularAirlineRoutesController") PopularAirlineRoutesController

#### Get singleton instance
The singleton instance of the ``` PopularAirlineRoutesController ``` class can be accessed from the API Client.
```java
PopularAirlineRoutesController popularAirlineRoutes = client.getPopularAirlineRoutes();
```

### <a name="get_popular_airline_routes_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.PopularAirlineRoutesController.getPopularAirlineRoutesAsync") getPopularAirlineRoutesAsync

> *Tags:*  ``` Streaming ``` 

> Returns routes for which an airline operates flights, sorted by popularity.

```java
void getPopularAirlineRoutesAsync(
        final GetPopularAirlineRoutesInput input,
        Map<String, Object> queryParameters,
        final APIStreamingCallBack<List<PopularAirlineRoutesModel>> callBack)
```

#### Parameters: 

| Parameter | Tags | Description |
|-----------|------|-------------|
| airlineCode |  ``` Required ```  | IATA code of airline |
| limit |  ``` Optional ```  ``` DefaultValue ```  | records limit per page. Default value is 100. Not less than 1000 |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage:
```java
GetPopularAirlineRoutesInput collect = new GetPopularAirlineRoutesInput();

String airlineCode = "airline_code";
collect.setAirlineCode(airlineCode);

String limit = "100";
collect.setLimit(limit);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
popularAirlineRoutes.getPopularAirlineRoutesAsync(collect, , queryParams, new APICallBack<List<PopularAirlineRoutesModel>>() {
    public void onSuccess(HttpContext context, List<PopularAirlineRoutesModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void PopularAirlineRoutes_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<PopularAirlineRoutesModel>> source, List<PopularAirlineRoutesModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void PopularAirlineRoutes_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<PopularAirlineRoutesModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="the_popular_directions_from_a_city_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.ThePopularDirectionsFromACityController") ThePopularDirectionsFromACityController

#### Get singleton instance
The singleton instance of the ``` ThePopularDirectionsFromACityController ``` class can be accessed from the API Client.
```java
ThePopularDirectionsFromACityController thePopularDirectionsFromACity = client.getThePopularDirectionsFromACity();
```

### <a name="get_the_popular_directions_from_a_city_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.ThePopularDirectionsFromACityController.getThePopularDirectionsFromACityAsync") getThePopularDirectionsFromACityAsync

> *Tags:*  ``` Streaming ``` 

> Brings the most popular directions from a specified city back.

```java
void getThePopularDirectionsFromACityAsync(
        final GetThePopularDirectionsFromACityInput input,
        Map<String, Object> queryParameters,
        final APIStreamingCallBack<List<ThePopularDirectionsFromACityModel>> callBack)
```

#### Parameters: 

| Parameter | Tags | Description |
|-----------|------|-------------|
| origin |  ``` Required ```  | the point of departure. The IATA city code or the country code. The length - from 2 to 3 symbols. |
| currency |  ``` Required ```  ``` DefaultValue ```  | the airline tickets currency |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage:
```java
GetThePopularDirectionsFromACityInput collect = new GetThePopularDirectionsFromACityInput();

String origin = "MOW";
collect.setOrigin(origin);

String currency = "usd";
collect.setCurrency(currency);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
thePopularDirectionsFromACity.getThePopularDirectionsFromACityAsync(collect, , queryParams, new APICallBack<List<ThePopularDirectionsFromACityModel>>() {
    public void onSuccess(HttpContext context, List<ThePopularDirectionsFromACityModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void ThePopularDirectionsFromACity_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<ThePopularDirectionsFromACityModel>> source, List<ThePopularDirectionsFromACityModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void ThePopularDirectionsFromACity_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<ThePopularDirectionsFromACityModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="data_on_the_routes_in_json_format_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.DataOnTheRoutesInJsonFormatController") DataOnTheRoutesInJsonFormatController

#### Get singleton instance
The singleton instance of the ``` DataOnTheRoutesInJsonFormatController ``` class can be accessed from the API Client.
```java
DataOnTheRoutesInJsonFormatController dataOnTheRoutesInJsonFormat = client.getDataOnTheRoutesInJsonFormat();
```

### <a name="get_data_on_the_routes_in_json_format_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.DataOnTheRoutesInJsonFormatController.getDataOnTheRoutesInJsonFormatAsync") getDataOnTheRoutesInJsonFormatAsync

> *Tags:*  ``` Streaming ``` 

> API returns a file with a list of routes from the database

```java
void getDataOnTheRoutesInJsonFormatAsync(final APIStreamingCallBack<List<DataOnTheRoutesInJsonFormatModel>> callBack)
```

#### Example Usage:
```java
// Invoking the API call with sample inputs
dataOnTheRoutesInJsonFormat.getDataOnTheRoutesInJsonFormatAsync(new APICallBack<List<DataOnTheRoutesInJsonFormatModel>>() {
    public void onSuccess(HttpContext context, List<DataOnTheRoutesInJsonFormatModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void DataOnTheRoutesInJsonFormat_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<DataOnTheRoutesInJsonFormatModel>> source, List<DataOnTheRoutesInJsonFormatModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void DataOnTheRoutesInJsonFormat_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<DataOnTheRoutesInJsonFormatModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="the_prices_for_the_alternative_directions_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.ThePricesForTheAlternativeDirectionsController") ThePricesForTheAlternativeDirectionsController

#### Get singleton instance
The singleton instance of the ``` ThePricesForTheAlternativeDirectionsController ``` class can be accessed from the API Client.
```java
ThePricesForTheAlternativeDirectionsController thePricesForTheAlternativeDirections = client.getThePricesForTheAlternativeDirections();
```

### <a name="get_the_prices_for_the_alternative_directions_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.ThePricesForTheAlternativeDirectionsController.getThePricesForTheAlternativeDirectionsAsync") getThePricesForTheAlternativeDirectionsAsync

> *Tags:*  ``` Streaming ``` 

> Brings the prices for the directions between the nearest to the target cities back.

```java
void getThePricesForTheAlternativeDirectionsAsync(
        final GetThePricesForTheAlternativeDirectionsInput input,
        Map<String, Object> queryParameters,
        final APIStreamingCallBack<List<ThePricesForTheAlternativeDirectionsModel>> callBack)
```

#### Parameters: 

| Parameter | Tags | Description |
|-----------|------|-------------|
| currency |  ``` Required ```  ``` DefaultValue ```  | the airline tickets currency |
| origin |  ``` Required ```  | the point of departure. The IATA city code or the country code. The length - from 2 to 3 symbols |
| destination |  ``` Required ```  | the point of destination. The IATA city code or the country code. The length - from 2 to 3 symbols |
| departDate |  ``` Required ```  | day or month of departure (yyyy-mm-dd or yyyy-mm). |
| returnDate |  ``` Required ```  | day or month of return (yyyy-mm-dd or yyyy-mm). |
| showToAffiliates |  ``` Optional ```  ``` DefaultValue ```  | false - all the prices, true - just the prices, found using the partner marker (recommended) |
| limit |  ``` Optional ```  | the number of variants entered, from 1 to 20. Where 1 – is just the variant with the specified points of departure and the points of destination |
| flexibility |  ``` Optional ```  | expansion of the range of dates upward or downward. The value may vary from 0 to 7, where 0 shall show the variants for the dates specified, 7 – all the variants found for a week prior to the specified dates and a week after |
| distance |  ``` Optional ```  | the number of variants entered, from 1 to 20. Where 1 – is just the variant with the specified points of departure and the points of destination |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage:
```java
GetThePricesForTheAlternativeDirectionsInput collect = new GetThePricesForTheAlternativeDirectionsInput();

String currency = "RUB";
collect.setCurrency(currency);

String origin = "origin";
collect.setOrigin(origin);

String destination = "destination";
collect.setDestination(destination);

String departDate = "depart_date";
collect.setDepartDate(departDate);

String returnDate = "return_date";
collect.setReturnDate(returnDate);

Boolean showToAffiliates = true;
collect.setShowToAffiliates(showToAffiliates);

String limit = "limit";
collect.setLimit(limit);

String flexibility = "flexibility";
collect.setFlexibility(flexibility);

String distance = "distance";
collect.setDistance(distance);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
thePricesForTheAlternativeDirections.getThePricesForTheAlternativeDirectionsAsync(collect, , queryParams, new APICallBack<List<ThePricesForTheAlternativeDirectionsModel>>() {
    public void onSuccess(HttpContext context, List<ThePricesForTheAlternativeDirectionsModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void ThePricesForTheAlternativeDirections_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<ThePricesForTheAlternativeDirectionsModel>> source, List<ThePricesForTheAlternativeDirectionsModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void ThePricesForTheAlternativeDirections_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<ThePricesForTheAlternativeDirectionsModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="the_calendar_of_prices_for_a_week_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.TheCalendarOfPricesForAWeekController") TheCalendarOfPricesForAWeekController

#### Get singleton instance
The singleton instance of the ``` TheCalendarOfPricesForAWeekController ``` class can be accessed from the API Client.
```java
TheCalendarOfPricesForAWeekController theCalendarOfPricesForAWeek = client.getTheCalendarOfPricesForAWeek();
```

### <a name="get_the_calendar_of_prices_for_a_week_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.TheCalendarOfPricesForAWeekController.getTheCalendarOfPricesForAWeekAsync") getTheCalendarOfPricesForAWeekAsync

> *Tags:*  ``` Streaming ``` 

> Brings the prices for the nearest dates to the target ones back

```java
void getTheCalendarOfPricesForAWeekAsync(
        final GetTheCalendarOfPricesForAWeekInput input,
        Map<String, Object> queryParameters,
        final APIStreamingCallBack<List<TheCalendarOfPricesForAWeekModel>> callBack)
```

#### Parameters: 

| Parameter | Tags | Description |
|-----------|------|-------------|
| currency |  ``` Required ```  ``` DefaultValue ```  | the airline tickets currency |
| origin |  ``` Required ```  | the point of departure. The IATA city code or the country code. The length - from 2 to 3 symbols |
| destination |  ``` Required ```  | the point of destination. The IATA city code or the country code. The length - from 2 to 3 symbols |
| departDate |  ``` Required ```  | day or month of departure (yyyy-mm-dd or yyyy-mm) |
| returnDate |  ``` Required ```  | day or month of return (yyyy-mm-dd or yyyy-mm) |
| showToAffiliates |  ``` Optional ```  ``` DefaultValue ```  | false - all the prices, true - just the prices, found using the partner marker (recommended). |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage:
```java
GetTheCalendarOfPricesForAWeekInput collect = new GetTheCalendarOfPricesForAWeekInput();

String currency = "RUB";
collect.setCurrency(currency);

String origin = "origin";
collect.setOrigin(origin);

String destination = "destination";
collect.setDestination(destination);

Date departDate = new Date();
collect.setDepartDate(departDate);

Date returnDate = new Date();
collect.setReturnDate(returnDate);

Boolean showToAffiliates = true;
collect.setShowToAffiliates(showToAffiliates);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
theCalendarOfPricesForAWeek.getTheCalendarOfPricesForAWeekAsync(collect, , queryParams, new APICallBack<List<TheCalendarOfPricesForAWeekModel>>() {
    public void onSuccess(HttpContext context, List<TheCalendarOfPricesForAWeekModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void TheCalendarOfPricesForAWeek_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<TheCalendarOfPricesForAWeekModel>> source, List<TheCalendarOfPricesForAWeekModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void TheCalendarOfPricesForAWeek_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<TheCalendarOfPricesForAWeekModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="cheapest_tickets_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.CheapestTicketsController") CheapestTicketsController

#### Get singleton instance
The singleton instance of the ``` CheapestTicketsController ``` class can be accessed from the API Client.
```java
CheapestTicketsController cheapestTickets = client.getCheapestTickets();
```

### <a name="get_cheapest_tickets_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.CheapestTicketsController.getCheapestTicketsAsync") getCheapestTicketsAsync

> *Tags:*  ``` Streaming ``` 

> Returns the cheapest non-stop tickets, as well as tickets with 1 or 2 stops, for the selected route with departure/return date filters. Important: Old dates may be specified in a query. No error will be generated, but no data will be returned.

```java
void getCheapestTicketsAsync(
        final GetCheapestTicketsInput input,
        Map<String, Object> queryParameters,
        final APIStreamingCallBack<List<CheapestTicketsModel>> callBack)
```

#### Parameters: 

| Parameter | Tags | Description |
|-----------|------|-------------|
| currency |  ``` Required ```  ``` DefaultValue ```  | Currency of prices |
| origin |  ``` Required ```  ``` DefaultValue ```  | IATA code of the departure city. IATA code is shown by uppercase letters, |
| destination |  ``` Required ```  | IATA code of the destination city (for all routes, enter "-"). IATA code is shown by uppercase letters |
| departDate |  ``` Required ```  | Day or month of departure (yyyy-mm-dd or yyyy-mm). |
| returnDate |  ``` Required ```  | Day or month of return (yyyy-mm-dd or yyyy-mm). |
| page |  ``` Required ```  | Is used to display the found data (by default the page displays 100 found prices. If the destination isn't selected, there can be more data. In this case, use the page, to display the next set of data, for example, page=2). |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage:
```java
GetCheapestTicketsInput collect = new GetCheapestTicketsInput();

String currency = "RUB";
collect.setCurrency(currency);

String origin = "HKT";
collect.setOrigin(origin);

String destination = "destination";
collect.setDestination(destination);

Date departDate = new Date();
collect.setDepartDate(departDate);

Date returnDate = new Date();
collect.setReturnDate(returnDate);

String page = "page";
collect.setPage(page);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
cheapestTickets.getCheapestTicketsAsync(collect, , queryParams, new APICallBack<List<CheapestTicketsModel>>() {
    public void onSuccess(HttpContext context, List<CheapestTicketsModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void CheapestTickets_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<CheapestTicketsModel>> source, List<CheapestTicketsModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void CheapestTickets_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<CheapestTicketsModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="tickets_for_each_day_of_month_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.TicketsForEachDayOfMonthController") TicketsForEachDayOfMonthController

#### Get singleton instance
The singleton instance of the ``` TicketsForEachDayOfMonthController ``` class can be accessed from the API Client.
```java
TicketsForEachDayOfMonthController ticketsForEachDayOfMonth = client.getTicketsForEachDayOfMonth();
```

### <a name="get_tickets_for_each_day_of_month_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.TicketsForEachDayOfMonthController.getTicketsForEachDayOfMonthAsync") getTicketsForEachDayOfMonthAsync

> *Tags:*  ``` Streaming ``` 

> Returns the cheapest non-stop, one-stop, and two-stop flights for the selected route for each day of the selected month

```java
void getTicketsForEachDayOfMonthAsync(
        final GetTicketsForEachDayOfMonthInput input,
        Map<String, Object> queryParameters,
        final APIStreamingCallBack<List<TicketsForEachDayOfMonthModel>> callBack)
```

#### Parameters: 

| Parameter | Tags | Description |
|-----------|------|-------------|
| currency |  ``` Required ```  ``` DefaultValue ```  | currency of prices |
| origin |  ``` Required ```  ``` DefaultValue ```  | IATA code of departure city. IATA code is shown by uppercase letters, for example MOW |
| destination |  ``` Required ```  ``` DefaultValue ```  | IATA code of destination city. IATA code is shown by uppercase letters, for example LED |
| departDate |  ``` Required ```  | day or month of departure (yyyy-mm-dd or yyyy-mm) |
| calendarType |  ``` Required ```  ``` DefaultValue ```  | field used to build the calendar. Equal to either: departure_date or return_date |
| returnDate |  ``` Optional ```  | day or month of return (yyyy-mm-dd or yyyy-mm). Pay attention! If the return_date is not specified, you will get the "One way" flights |
| length |  ``` Optional ```  | length of stay in the destination city |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage:
```java
GetTicketsForEachDayOfMonthInput collect = new GetTicketsForEachDayOfMonthInput();

String currency = "RUB";
collect.setCurrency(currency);

String origin = "MOW";
collect.setOrigin(origin);

String destination = "LED";
collect.setDestination(destination);

Date departDate = new Date();
collect.setDepartDate(departDate);

String calendarType = "departure_date";
collect.setCalendarType(calendarType);

String returnDate = "return_date";
collect.setReturnDate(returnDate);

String length = "length";
collect.setLength(length);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
ticketsForEachDayOfMonth.getTicketsForEachDayOfMonthAsync(collect, , queryParams, new APICallBack<List<TicketsForEachDayOfMonthModel>>() {
    public void onSuccess(HttpContext context, List<TicketsForEachDayOfMonthModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void TicketsForEachDayOfMonth_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<TicketsForEachDayOfMonthModel>> source, List<TicketsForEachDayOfMonthModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void TicketsForEachDayOfMonth_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<TicketsForEachDayOfMonthModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="data_of_countries_in_json_format_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.DataOfCountriesInJsonFormatController") DataOfCountriesInJsonFormatController

#### Get singleton instance
The singleton instance of the ``` DataOfCountriesInJsonFormatController ``` class can be accessed from the API Client.
```java
DataOfCountriesInJsonFormatController dataOfCountriesInJsonFormat = client.getDataOfCountriesInJsonFormat();
```

### <a name="get_data_of_countries_in_json_format_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.DataOfCountriesInJsonFormatController.getDataOfCountriesInJsonFormatAsync") getDataOfCountriesInJsonFormatAsync

> *Tags:*  ``` Streaming ``` 

> API returns a file with a list of countrys from the database

```java
void getDataOfCountriesInJsonFormatAsync(final APIStreamingCallBack<List<DataOfCountriesInJsonFormatModel>> callBack)
```

#### Example Usage:
```java
// Invoking the API call with sample inputs
dataOfCountriesInJsonFormat.getDataOfCountriesInJsonFormatAsync(new APICallBack<List<DataOfCountriesInJsonFormatModel>>() {
    public void onSuccess(HttpContext context, List<DataOfCountriesInJsonFormatModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void DataOfCountriesInJsonFormat_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<DataOfCountriesInJsonFormatModel>> source, List<DataOfCountriesInJsonFormatModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void DataOfCountriesInJsonFormat_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<DataOfCountriesInJsonFormatModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="city_data_in_json_format_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.CityDataInJsonFormatController") CityDataInJsonFormatController

#### Get singleton instance
The singleton instance of the ``` CityDataInJsonFormatController ``` class can be accessed from the API Client.
```java
CityDataInJsonFormatController cityDataInJsonFormat = client.getCityDataInJsonFormat();
```

### <a name="get_city_data_in_json_format_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.CityDataInJsonFormatController.getCityDataInJsonFormatAsync") getCityDataInJsonFormatAsync

> *Tags:*  ``` Streaming ``` 

> API returns a file with a list of cities from the database

```java
void getCityDataInJsonFormatAsync(final APIStreamingCallBack<List<CityDataInJsonFormatModel>> callBack)
```

#### Example Usage:
```java
// Invoking the API call with sample inputs
cityDataInJsonFormat.getCityDataInJsonFormatAsync(new APICallBack<List<CityDataInJsonFormatModel>>() {
    public void onSuccess(HttpContext context, List<CityDataInJsonFormatModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void CityDataInJsonFormat_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<CityDataInJsonFormatModel>> source, List<CityDataInJsonFormatModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void CityDataInJsonFormat_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<CityDataInJsonFormatModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="airport_data_in_json_format_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.AirportDataInJsonFormatController") AirportDataInJsonFormatController

#### Get singleton instance
The singleton instance of the ``` AirportDataInJsonFormatController ``` class can be accessed from the API Client.
```java
AirportDataInJsonFormatController airportDataInJsonFormat = client.getAirportDataInJsonFormat();
```

### <a name="get_airport_data_in_json_format_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.AirportDataInJsonFormatController.getAirportDataInJsonFormatAsync") getAirportDataInJsonFormatAsync

> *Tags:*  ``` Streaming ``` 

> API returns a file with a list of airports from the database

```java
void getAirportDataInJsonFormatAsync(final APIStreamingCallBack<List<AirportDataInJsonFormatModel>> callBack)
```

#### Example Usage:
```java
// Invoking the API call with sample inputs
airportDataInJsonFormat.getAirportDataInJsonFormatAsync(new APICallBack<List<AirportDataInJsonFormatModel>>() {
    public void onSuccess(HttpContext context, List<AirportDataInJsonFormatModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void AirportDataInJsonFormat_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<AirportDataInJsonFormatModel>> source, List<AirportDataInJsonFormatModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void AirportDataInJsonFormat_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<AirportDataInJsonFormatModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="airline_data_in_json_format_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.AirlineDataInJsonFormatController") AirlineDataInJsonFormatController

#### Get singleton instance
The singleton instance of the ``` AirlineDataInJsonFormatController ``` class can be accessed from the API Client.
```java
AirlineDataInJsonFormatController airlineDataInJsonFormat = client.getAirlineDataInJsonFormat();
```

### <a name="get_airline_data_in_json_format_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.AirlineDataInJsonFormatController.getAirlineDataInJsonFormatAsync") getAirlineDataInJsonFormatAsync

> *Tags:*  ``` Streaming ``` 

> API returns a file with a list of airlines from the database

```java
void getAirlineDataInJsonFormatAsync(final APIStreamingCallBack<List<AirlineDataInJsonFormatModel>> callBack)
```

#### Example Usage:
```java
// Invoking the API call with sample inputs
airlineDataInJsonFormat.getAirlineDataInJsonFormatAsync(new APICallBack<List<AirlineDataInJsonFormatModel>>() {
    public void onSuccess(HttpContext context, List<AirlineDataInJsonFormatModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void AirlineDataInJsonFormat_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<AirlineDataInJsonFormatModel>> source, List<AirlineDataInJsonFormatModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void AirlineDataInJsonFormat_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<AirlineDataInJsonFormatModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="alliance_data_in_json_format_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.AllianceDataInJsonFormatController") AllianceDataInJsonFormatController

#### Get singleton instance
The singleton instance of the ``` AllianceDataInJsonFormatController ``` class can be accessed from the API Client.
```java
AllianceDataInJsonFormatController allianceDataInJsonFormat = client.getAllianceDataInJsonFormat();
```

### <a name="get_alliance_data_in_json_format_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.AllianceDataInJsonFormatController.getAllianceDataInJsonFormatAsync") getAllianceDataInJsonFormatAsync

> *Tags:*  ``` Streaming ``` 

> API returns a file with a list of alliances from the database

```java
void getAllianceDataInJsonFormatAsync(final APIStreamingCallBack<List<AllianceDataInJsonFormatModel>> callBack)
```

#### Example Usage:
```java
// Invoking the API call with sample inputs
allianceDataInJsonFormat.getAllianceDataInJsonFormatAsync(new APICallBack<List<AllianceDataInJsonFormatModel>>() {
    public void onSuccess(HttpContext context, List<AllianceDataInJsonFormatModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void AllianceDataInJsonFormat_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<AllianceDataInJsonFormatModel>> source, List<AllianceDataInJsonFormatModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void AllianceDataInJsonFormat_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<AllianceDataInJsonFormatModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="airplane_data_in_json_format_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.AirplaneDataInJsonFormatController") AirplaneDataInJsonFormatController

#### Get singleton instance
The singleton instance of the ``` AirplaneDataInJsonFormatController ``` class can be accessed from the API Client.
```java
AirplaneDataInJsonFormatController airplaneDataInJsonFormat = client.getAirplaneDataInJsonFormat();
```

### <a name="get_airplane_data_in_json_format_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.AirplaneDataInJsonFormatController.getAirplaneDataInJsonFormatAsync") getAirplaneDataInJsonFormatAsync

> *Tags:*  ``` Streaming ``` 

> API returns a file with a list of airplanes from the database

```java
void getAirplaneDataInJsonFormatAsync(final APIStreamingCallBack<List<AirplaneDataInJsonFormatModel>> callBack)
```

#### Example Usage:
```java
// Invoking the API call with sample inputs
airplaneDataInJsonFormat.getAirplaneDataInJsonFormatAsync(new APICallBack<List<AirplaneDataInJsonFormatModel>>() {
    public void onSuccess(HttpContext context, List<AirplaneDataInJsonFormatModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void AirplaneDataInJsonFormat_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<AirplaneDataInJsonFormatModel>> source, List<AirplaneDataInJsonFormatModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void AirplaneDataInJsonFormat_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<AirplaneDataInJsonFormatModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)
## <a name="the_calendar_of_prices_for_a_month_controller"></a>![Class: ](http://apidocs.io/img/class.png "com.travelpayouts.api.controllers.TheCalendarOfPricesForAMonthController") TheCalendarOfPricesForAMonthController

#### Get singleton instance
The singleton instance of the ``` TheCalendarOfPricesForAMonthController ``` class can be accessed from the API Client.
```java
TheCalendarOfPricesForAMonthController theCalendarOfPricesForAMonth = client.getTheCalendarOfPricesForAMonth();
```

### <a name="get_the_calendar_of_prices_for_a_month_async"></a>![Method: ](http://apidocs.io/img/method.png "com.travelpayouts.api.controllers.TheCalendarOfPricesForAMonthController.getTheCalendarOfPricesForAMonthAsync") getTheCalendarOfPricesForAMonthAsync

> *Tags:*  ``` Streaming ``` 

> Brings the prices for each day of a month, grouped together by the number of transfers, back

```java
void getTheCalendarOfPricesForAMonthAsync(
        final GetTheCalendarOfPricesForAMonthInput input,
        Map<String, Object> queryParameters,
        final APIStreamingCallBack<List<TheCalendarOfPricesForAMonthModel>> callBack)
```

#### Parameters: 

| Parameter | Tags | Description |
|-----------|------|-------------|
| currency |  ``` Required ```  ``` DefaultValue ```  | the airline tickets currency |
| origin |  ``` Required ```  | the point of departure. The IATA city code or the country code. The length - from 2 to 3 symbols |
| destination |  ``` Required ```  | the point of destination. The IATA city code or the country code. The length - from 2 to 3 symbols. Note! If the point of departure and the point of destination are not specified, then the API shall bring 30 the most cheapest tickets, which have been found during the recent 48 hours, back. |
| month |  ``` Required ```  | the beginning of the month in the YYYY-MM-DD format |
| showToAffiliates |  ``` Optional ```  ``` DefaultValue ```  | false - все цены, true - только цены, найденные с партнёрским маркером (рекомендовано). Значение по умолчанию - true. |
| queryParameters | ``` Optional ``` | Additional optional query parameters are supported by this method |



#### Example Usage:
```java
GetTheCalendarOfPricesForAMonthInput collect = new GetTheCalendarOfPricesForAMonthInput();

String currency = "RUB";
collect.setCurrency(currency);

String origin = "origin";
collect.setOrigin(origin);

String destination = "destination";
collect.setDestination(destination);

String month = "month";
collect.setMonth(month);

Boolean showToAffiliates = true;
collect.setShowToAffiliates(showToAffiliates);

// key-value map for optional query parameters
Map<String, Object> queryParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
theCalendarOfPricesForAMonth.getTheCalendarOfPricesForAMonthAsync(collect, , queryParams, new APICallBack<List<TheCalendarOfPricesForAMonthModel>>() {
    public void onSuccess(HttpContext context, List<TheCalendarOfPricesForAMonthModel> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```

Stream event handlers can be implemented as follows.
```java
/// <summary>
/// Data arrival event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
/// <param name="data">Deserialised data returned from the stream</param>
private void TheCalendarOfPricesForAMonth_DataArrivalEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<TheCalendarOfPricesForAMonthModel>> source, List<TheCalendarOfPricesForAMonthModel> data)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}

/// <summary>
/// Stream closed event handler
/// </summary>
/// <param name="source">Instance of the streaming controller</param>
private void TheCalendarOfPricesForAMonth_StreamClosedEvent(com.travelpayouts.api.controllers.BaseStreamHandler<List<TheCalendarOfPricesForAMonthModel>> source)
{
    // TODO: Add implememtation here
    throw new NotImplementedException();
}
```





[Back to List of Controllers](#list_of_controllers)


