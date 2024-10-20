-------------- Steps to Run the Spring Boot Backend ----------

1. After Downloading the Code:

* Unzip or extract the downloaded project folder.
* Open IntelliJ IDEA and select File > Open. Then, navigate to the folder where you downloaded the project and open it.


2. Install Prerequisites:

* Ensure you have Java Development Kit (JDK) installed (version 11 or later).
* Install Maven if it's not already included in your JDK installation.
* Ensure you have PostgreSQL installed and running.


3.Set Up PostgreSQL Database:

Create a new database in PostgreSQL for your application. You can do this using a PostgreSQL client (like pgAdmin) or command line:

CREATE DATABASE registration;

4. Configure Database Connection:

Open the src/main/resources/application.properties file in your Spring Boot project.

Update the following properties to match your PostgreSQL setup:

spring.datasource.url=jdbc:postgresql://localhost:5432/registration_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

5. Open the Project in IntelliJ IDEA:

Launch IntelliJ IDEA and open your downloaded Spring Boot project.


6. Run the Application:

You can run the application directly from IntelliJ:
Right-click on the main application class (usually annotated with @SpringBootApplication) in the src/main/java directory and select Run 'YourApplicationName'.


7. Access the Application:

Once the application starts successfully, you should see output indicating that the server is running. By default, it runs on port 8080.
You can access the API endpoints by navigating to http://localhost:8080/api/registrations in your web browser or using a tool like Postman.


8. Test CRUD Operations:

Use tools like Postman or your frontend application to test the CRUD operations. You can send GET, POST, PUT, and DELETE requests to the appropriate endpoints.




