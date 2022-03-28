
# Getting Started

### Reference Documentation

Requirements: 

 - Java 11
 - Maven 3.8.3


## Starting the application
In root folder /jumbo-exercise where the file mvnw will be found, run with the command:

    mvn spring-boot:run
    
## Endpoints
The endpoint to get top five closest store is:

GET: http://localhost:8080/api/v1/stores?lat=51.613692&lon=5.538258


The query params **lat(latitude)** and **lon(longitude)** are required.

You can see swagger doc for the project in the address:
[Swagger UI](http://localhost:8080/swagger-ui/)
