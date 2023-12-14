# My Spring WebAPI

This is a simple Spring Boot WebAPI project set up with Maven.

## Project Structure

The project has the following structure:

- `MyWebapiApplication.java`: The main Spring Boot application class.
- `controller/MyController.java`: A Spring MVC controller class that handles HTTP requests and responses.
- `model/MyModel.java`: A model class that represents the data in the application.
- `service/MyService.java`: A service class that contains business logic and calls methods from the repository layer.
- `application.properties`: Configuration properties for the Spring Boot application.
- `MyWebapiApplicationTests.java`: Test cases for the Spring Boot application.

## Building the Project

To build the project, run the following command in the project root directory:

```
./mvnw clean install
```

## Running the Project

To run the project, use the following command:

```
./mvnw spring-boot:run
```

Visit `http://localhost:8080` in your browser to interact with the application.

## Testing the Project

To run the tests, use the following command:

```
./mvnw test
```
```

This `README.md` provides a brief overview of the project, its structure, and instructions on how to build, run, and test the project.