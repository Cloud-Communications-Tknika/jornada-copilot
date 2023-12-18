# My Spring WebAPI

This is a simple Spring Boot WebAPI project set up with Maven.

## Project Structure

The project is structured as follows:

- `MyApplication.java`: The entry point of the application.
- `controller/MyController.java`: Handles HTTP requests.
- `service/MyService.java`: Contains business logic.
- `repository/MyRepository.java`: Interacts with the database.
- `resources/application.properties`: Contains configuration properties.
- `MyApplicationTests.java`: Contains unit tests for the application.

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

## Testing the Project

To run the tests, use the following command:

```
./mvnw test
```

Please ensure you have Maven installed and correctly set up in your PATH before running these commands.