This project is a layered Spring Boot RESTful application that provides CRUD operations for managing Customer data. It integrates with a real relational database (Oracle XE) running on Docker and generates OpenAPI-compliant documentation using Swagger UI.

This project was developed as a part of the i2i Academy backend engineering assignments.

🚀 Technologies Used

Java 17+

Spring Boot 3.x (Web, Data JPA)

Oracle Database XE (via Docker container)

Swagger / OpenAPI 3 (springdoc-openapi)

Maven

🏗️ Architecture

The application is built using a strict 3-Layered Architecture to ensure clean code, scalability, and security:

Controller Layer: Handles incoming HTTP requests and acts as the entry point.

Service Layer: Contains the core business logic and handles Entity <-> DTO conversions.

Repository Layer: Interacts with the Oracle database using Spring Data JPA.

Data Transfer Objects (DTOs): Used to isolate and protect internal database entities (schemas/passwords) from being exposed directly to the client.

🛠️ Prerequisites & How to Run

1. Database Setup (Docker)

Ensure Docker Desktop is running. Pull and run the Oracle XE image using the following command:

docker run -d -p 1521:1521 --name oracle-db -e ORACLE_PASSWORD=customer_pass -e APP_USER=customer_db -e APP_USER_PASSWORD=customer_pass gvenzl/oracle-xe


Wait 1-2 minutes for the database to fully initialize (DATABASE IS READY TO USE log).

2. Run the Application

Open the project in your IDE (IntelliJ IDEA, Eclipse, etc.) and run RestfulApiDesignSwaggerApplication.java, or use Maven:

mvn spring-boot:run


3. API Documentation (Swagger UI)

Once the application is running, navigate to the following URL in your browser to test the API endpoints interactively:

👉 http://localhost:8080/swagger-ui.html
