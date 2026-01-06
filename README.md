# What I Learned from Spring Boot 

This repository documents my **learning journey with Spring Boot**, focusing on how a Spring Boot application works internally and how CRUD operations are implemented using REST APIs, Hibernate (JPA), and MySQL.

The purpose of this repository is **learning and concept clarity**, not building a complex application.

---

## 🧠 Core Spring Boot Concepts I Learned

### 1. How a Spring Boot Application Starts
- Spring Boot applications start from a `main()` method using `SpringApplication.run()`
- Spring creates an **Application Context**, which acts as a container for all objects (beans)
- Auto-configuration configures components based on dependencies without manual setup
- 
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

## 🌐 How HTTP Requests Are Processed
I understood the internal request flow in Spring Boot:

`DispatcherServlet` acts as the **front controller**, routing requests to the correct controller method.

---

## ⚙️ Configuration & Dependency Management
- Maven manages dependencies and project structure
- `application.properties` is used for database and server configuration
- Spring Boot auto-configures DataSource, JPA, and server settings

---

## 🧪 API Testing & Debugging Skills
- Used Postman to test REST APIs
- Understood HTTP methods and status codes
- Debugged common issues like:
  - 404 errors due to wrong URL mapping
  - Missing dependencies
  - Incorrect annotations
  - Package scanning issues

---

## 📌 Key Takeaways

- Spring Boot reduces boilerplate code
- Annotations drive application behavior
- Exact URL mapping is critical
- Layered architecture improves code quality
- Hibernate simplifies database interaction
- Understanding flow is more important than memorizing code

---

## 🚀 Next Learning Goals

- Add validation and exception handling
- Learn DTO pattern
- Integrate Swagger for API documentation
- Understand Spring Security basics
- Build a frontend with React

---

## 🧾 Final Reflection

This learning exercise helped me move from **theory to practical understanding** of Spring Boot.  
Instead of just writing code, I now understand **how requests flow**, **how data is persisted**, and **how Spring Boot simplifies backend development**.

---

**Author:** Shrikant Ambatkar  
**Focus:** Learning Spring Boot & Backend Development



