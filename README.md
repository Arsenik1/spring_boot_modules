# Spring Boot Modules
This repository contains a collection of modules demonstrating various aspects of Spring Boot, including core functionality, data handling, security, and web capabilities. Each module is designed as a standalone Spring Boot application, showcasing specific features and best practices.

## Modules Overview

### Spring Core
Demonstrates Spring Boot's core functionalities, including dependency injection, bean lifecycle, and application configuration.
- `pom.xml`
- `SpringCoreApplication.java`
- `DependencyInjectionTest.java`

### Spring Data
Focuses on integrating Spring Data JPA for database operations, demonstrating CRUD operations, and custom query methods.
- `pom.xml`
- `SpringDataApplication.java`
- `Book.java`

### Spring Security
Showcases Spring Security for authentication and authorization, custom user details service, and password encoding.
- `pom.xml`
- `SpringSecurityApplication.java`
- `SecurityConfiguration.java`

### Spring Web
Demonstrates building RESTful web services with Spring Web, handling exceptions globally, and validating request parameters.
- `pom.xml`
- `SpringWebApplication.java`
- `GlobalExceptionHandler.java`

## Getting Started
To get started with any of these modules, clone the repository and navigate to the desired module directory. Each module is a Maven project, so you can easily build and run them using Maven commands:

```bash
mvn clean install
mvn spring-boot:run
```

Ensure you have Maven and JDK 17 installed on your machine to build and run the projects.

## Contributing
Contributions are welcome! If you have improvements or bug fixes, please feel free to fork the repository, make your changes, and submit a pull request.
