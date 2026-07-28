# School Management API

A RESTful API for school management (students, teachers, courses, and grades) built with Java 21 and Spring Boot 3 / 4.

## 🛠️ Tech Stack
* **Language:** Java 21
* **Framework:** Spring Boot 4.x
* **Database:** MySQL 8.0
* **Database Migration:** Flyway
* **Containerization:** Docker & Docker Compose
* **Documentation:** Swagger UI (Springdoc OpenAPI)
* **Build Tool:** Maven

---

## 🚀 Getting Started

### Prerequisites
* **Docker** & **Docker Compose** installed
* **JDK 21** & **Maven** installed

### 1. Set environment variables
Create a `.env` file in the root directory based on the example template `.env.example` 

### 2. Start database container
`docker compose up -d`

### 3. Start application
`./mvnw spring-boot:run`

### 4. API documentation
👉 http://localhost:8080/swagger-ui/index.html
