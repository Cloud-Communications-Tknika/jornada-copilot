# mi-api-spring

This is a simple Spring Boot application with a RESTful API.

## Prerequisites

- Java 8 or higher
- Maven

## Building the project

To build the project, navigate to the project directory and run the following command:

```
./mvnw clean install
```

This will clean the project, compile the source code, run the tests and install the package in your local repository.

## Running the application

To run the application, use the following command:

```
./mvnw spring-boot:run
```

This will start the application. You can access the API at `http://localhost:8080`.

## Running the tests

To run the tests, use the following command:

```
./mvnw test
```

This will run all the tests in the project.

## Application structure

The application is structured as follows:

- `src/main/java/com/myapp/controller/MyController.java`: This is the controller class that handles HTTP requests.
- `src/main/java/com/myapp/model/MyModel.java`: This is the model class that represents the data model of the application.
- `src/main/java/com/myapp/Application.java`: This is the main class that starts the Spring Boot application.
- `src/main/resources/application.properties`: This file contains configuration properties for the application.
- `src/test/java/com/myapp/ApplicationTests.java`: This is the test class for the `Application` class.

## Configuration

You can configure the application by modifying the `application.properties` file. For example, you can change the server port, database configuration, etc.

## Contributing

If you want to contribute to this project, please feel free to fork the repository, make your changes and create a pull request.