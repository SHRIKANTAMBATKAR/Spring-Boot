# What I Learned from Spring Boot 
This repository documents my **learning journey with Spring Boot**, focusing on how a Spring Boot application works internally and how backend concepts are applied in real-world REST APIs.
The purpose of this repository is **learning and concept clarity**, not building a complex application.

---

## 🧠 Core Spring Boot Concepts I Learned

### 1. How a Spring Boot Application Starts
- Spring Boot applications start from a `main()` method using `SpringApplication.run()`
- Spring creates an **Application Context**, which acts as a container for all objects (beans)
- Auto-configuration configures components based on dependencies without manual setup

---

### 2. Component Scanning & Annotations
I learned how Spring scans packages and manages classes using annotations:

- `@SpringBootApplication` – Entry point of the application
- `@RestController` – Handles HTTP requests and responses
- `@Service` – Contains business logic
- `@Repository` – Handles database operations
- `@Entity` – Maps Java class to database table

Spring automatically creates and manages objects using **Dependency Injection**.

---

### 3. Understanding Layered Architecture
I learned how Spring Boot applications are structured in layers:

- Controller handles HTTP requests
- Service handles business logic
- Repository communicates with the database
- This separation improves readability, testing, and maintainability

---

## 🔁 CRUD Operations Understanding

### Create (POST)
- Accept JSON data from client
- Convert JSON to Java object using Jackson
- Save object to database using JPA Repository

### Read (GET)
- Fetch all records or a single record by ID
- Convert database data into Java objects
- Return response as JSON

### Update (PUT)
- Update existing records using entity ID
- Hibernate automatically generates update SQL

### Delete (DELETE)
- Delete records using primary key
- Hibernate handles SQL generation internally

---

## 🗄️ Hibernate & JPA Concepts Learned

- Hibernate acts as an **ORM (Object Relational Mapping)** tool
- Java classes are mapped to database tables
- Fields are mapped to columns
- SQL queries are auto-generated
- Database interaction happens without writing SQL for basic operations

---

## ✅ Validation & Exception Handling

### Validation
- Learned to validate incoming API data using **Bean Validation**
- Applied validation annotations on DTOs instead of entities
- Used `@Valid` in controllers to trigger validation
- Prevented invalid data from reaching the service and database layers

### Global Exception Handling
- Implemented centralized exception handling using `@ControllerAdvice`
- Handled validation errors, custom business exceptions, and generic errors
- Returned clean and meaningful HTTP responses instead of stack traces
- Improved API reliability and client experience

---

## 🔄 DTO & Model Mapping

### DTO (Data Transfer Object)
- Used DTOs to separate API contracts from database entities
- Prevented direct exposure of entity classes
- Applied validation at the API layer using DTOs
- Improved flexibility and maintainability of APIs

### ModelMapper
- Used ModelMapper to convert DTOs to entities and vice versa
- Reduced boilerplate getter-setter mapping code
- Kept service layer clean and readable
- Improved scalability for larger applications

---

## 🌐 How HTTP Requests Are Processed
I understood the internal request flow in Spring Boot:

- Client sends HTTP request
- Request reaches embedded Tomcat server
- `DispatcherServlet` acts as the front controller
- Request is routed to the correct controller method
- Service and repository layers process the request
- Response is returned as JSON

---

## ⚙️ Configuration & Dependency Management
- Maven manages dependencies and project structure
- `application.properties` is used for database and server configuration
- Spring Boot auto-configures DataSource, JPA, and embedded server

---

## 🧪 API Testing & Debugging Skills
- Used Postman and Swagger UI to test REST APIs
- Understood HTTP methods and status codes
- Debugged common issues such as:
  - 404 errors due to incorrect URL mapping
  - Port conflicts
  - Missing dependencies
  - Incorrect annotations and package scanning issues

---

## 📌 Key Takeaways

- Spring Boot reduces boilerplate code
- Annotations drive application behavior
- Exact URL mapping is critical
- Layered architecture improves code quality
- Hibernate simplifies database interaction
- DTOs protect API structure
- Validation and exception handling make APIs robust
- Understanding flow is more important than memorizing code

---

## 🚀 Next Learning Goals

- Pagination and sorting
- Logging and monitoring
- Spring Security with JWT
- Unit and integration testing
- Full-stack integration with React

---

## 🧾 Final Reflection

This learning journey helped me move from **writing code** to **understanding how backend systems work**.  
I now have a clear understanding of request flow, data validation, error handling, object mapping, and how Spring Boot simplifies enterprise backend development.

---

**Author:** Shrikant Ambatkar  
**Focus:** Learning Spring Boot & Backend Development
