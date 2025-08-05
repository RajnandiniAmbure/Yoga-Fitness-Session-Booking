# 🧘‍♀️ Yoga Fitness Session Booking

A professional full-stack web application to book, edit, and manage yoga fitness sessions. This project integrates a responsive frontend with a powerful backend to streamline session scheduling.

---

## 🚀 Features

- Book a yoga session with:
  - Full Name
  - Email Address
  - Phone Number
  - Session Type
  - Date & Time
- View all upcoming sessions
- Edit or update existing bookings
- Cancel bookings
- REST API integration
- Responsive and modern user interface

---

## 🛠 Technologies Used

| Layer    | Technology                |
|----------|---------------------------|
| Backend  | Java 17, Spring Boot 3.5.4 |
| Frontend | HTML, CSS, JavaScript     |
| Database | PostgreSQL 15+            |
| ORM      | Spring Data JPA           |
| Build Tool | Maven                   |

---

## 📁 Project Structure

```
Appointment-Booking-Application/
├── src/
│ └── main/
│ ├── java/com/example/appointmentcrud/
│ │ ├── AppointmentController.java
│ │ ├── AppointmentService.java
│ │ ├── AppointmentRepository.java
│ │ └── AppointmentCrudApplication.java
│ └── resources/
│ ├── application.properties
│ └── static/index.html
├── pom.xml
└── README.md
```

---

---

## 🧩 REST API Endpoints

| Method | Endpoint                   | Description           |
|--------|----------------------------|-----------------------|
| GET    | `/api/appointments`        | Get all appointments  |
| GET    | `/api/appointments/{id}`   | Get appointment by ID |
| POST   | `/api/appointments`        | Create new appointment|
| PUT    | `/api/appointments/{id}`   | Update appointment    |
| DELETE | `/api/appointments/{id}`   | Delete appointment    |

---

## 🛠️ Configure PostgreSQL

1. Create a PostgreSQL database named `appointmentdb`.

2. Update `src/main/resources/application.properties` with:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/appointmentdb
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

server.port=8082
```
---

## ⚙️ Build and Run

### 🧪 Backend (Spring Boot)

To build and run the backend, use:

```bash
# Build the project (optional if you just want to run)
mvn clean install

# Run the Spring Boot application
mvn spring-boot:run
---

### 🌐 Frontend

To run the frontend application, you can use Python’s simple HTTP server:

```bash
python -m http.server 5500
---

## 📸 Sample UI


<img width="981" height="935" alt="op" src="https://github.com/user-attachments/assets/9eb494bd-2dff-45fc-88c0-c18bb353318d" />

---
## 📅 Sample Database Output

---

## 👩‍💻 Contact

Name: Rajnandini Ambure

Email: rajnandiniambure@gmail.com

GitHub: https://github.com/RajnandiniAmbure
