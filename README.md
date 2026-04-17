🚌 Bus Reservation System

A Bus Reservation System developed using Java Spring Boot + JSP (MVC Architecture) that allows users to search buses, book tickets, and manage reservations efficiently, while providing admin controls for managing the system.

---

📌 Project Overview

This project is a web-based application designed to simplify the process of booking bus tickets. It supports both user and admin functionalities with a clean MVC structure.

---

#Architecture

The project follows **Spring Boot MVC Architecture**:

* Controller Layer→ Handles HTTP requests
* Service Layer → Business logic
* Repository Layer → Database interaction
* Model Layer → Entity classes
* View Layer (JSP) → User interface

---

# 📂 Project Structure


src/
├── main/
│   ├── java/com/bus/
│   │   ├── config/
│   │   ├── controller/
│   │   ├── dto/
│   │   ├── exception/
│   │   ├── model/
│   │   ├── repository/
│   │   └── service/
│   │
│   ├── resources/
│   │   ├── static/
│   │   ├── application.properties
│   │   └── data.sql
│   │
│   ├── webapp/
│       └── WEB-INF/jsp/
│           ├── admin/
│           ├── buses/
│           ├── common/
│           ├── feedback/
│           ├── reservations/
│           ├── routes/
│           ├── user/
│           ├── users/
│           ├── index.jsp
│           └── layout.jsp
│
├── test/
├── pom.xml


---

# ✨ Features

### 👤 User

* Register & Login
* Search available buses
* View routes and timings
* Book tickets
* Cancel reservations
* Submit feedback

### 🛠️ Admin

* Manage buses (Add / Update / Delete)
* Manage routes
* View all bookings
* Manage users
* Handle feedback

---

## ⚙️ Technologies Used

* Java 17
* Spring Boot
* Spring MVC
* Spring Data JPA
* JSP (Java Server Pages)
* MySQL / H2 Database
* Maven
* HTML, CSS, JavaScript

---

## 🚀 How to Run

### 🔧 Prerequisites

* Java 17
* Maven
* MySQL (optional)

---

Open browser:

```
http://localhost:7381
```

## 🔐 Modules

* Authentication Module
* User Module
* Bus Module
* Route Module
* Reservation Module
* Feedback Module

---

## 📊 Database

* Tables include:

  * User
  * Admin
  * Bus
  * Route
  * Reservation
  * Feedback

* Initial data loaded using:

```
data.sql
```

---

## 📸 UI Pages

* Home Page (`index.jsp`)
* Login & Registration
* Bus Listing
* Booking Page
* Admin Dashboard
* Feedback Page

---

## 🔮 Future Improvements

* Online Payment Integration
* Seat Selection Feature
* Email Notifications
* Responsive UI improvements

---

## 👩‍💻 Author

Lavanya

---

## 📄 License

This project is created for learning and demonstration purposes.
