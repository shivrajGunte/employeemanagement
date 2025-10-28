# 🚀 Employee Management System

A full-stack Employee Management System built with **Spring Boot (Backend)** and **HTML/CSS/JavaScript (Frontend)**.  
This project allows you to **add, edit, delete, and view employees** with a clean, modern UI dashboard.

---

##  Features

✅ Add new employees  
✅ Edit existing employee details  
✅ Delete employees  
✅ View all employees  
✅ Interactive dashboard with reports & settings  
✅ RESTful API using Spring Boot  
✅ Connected to MySQL Database  

---

## 🖥️ Tech Stack

**Frontend:** HTML, CSS, JavaScript  
**Backend:** Spring Boot, Spring Data JPA  
**Database:** MySQL  
**Tools:** Maven, GitHub, VS Code / IntelliJ  

---

## ⚙️ Installation & Setup

1️⃣ **Clone the Repository**
```bash
git clone https://github.com/ShivrajGunte/employeemanagement.git
cd employeemanagement

2️⃣ Configure MySQL Database

Open application.properties

Update with your credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
3️⃣ Run the Application

mvn spring-boot:run
The backend will start at → http://localhost:9090

4️⃣ Open Frontend

Open the index.html file in your browser.

It connects automatically to the backend API.


