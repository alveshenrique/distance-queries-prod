# User Queries API
 Backend for the bain mock distance app

To run (Maven required): mvn spring-boot:run
To build (Maven required): mvn clean install
To run the build (file attached to recruiting email): java -jar distance-calculation-app-0.0.1-SNAPSHOT.jar

Use cases (if you are running locally, use http://localhost:8081 instead. MySQL needed) :

To get all user queries
GET https://distance-queries-prod.herokuapp.com/api/userQueries

To get a single user query
GET https://distance-queries-prod.herokuapp.com/api/userQueries{queryId}

To create a query (used by the frontend):
POST https://distance-queries-prod.herokuapp.com/api/userQueries

JSON BODY EXAMPLE:

{
    "lat1": 1321,
    "lng1": 1223,
    "lat2": 2032,
    "lng2": 2511,
    "distance": 1121230
}

For the frontend references, check https://github.com/alveshenrique/bain_mock_distance_app
