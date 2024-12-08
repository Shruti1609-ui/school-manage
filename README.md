SchoolManagementSystem/
│
├── src/
│   ├── ui/
│   │   ├── LoginPage.java
│   │   ├── Dashboard.java
│   │   ├── StudentManagement.java
│   ├── model/
│   │   ├── Student.java
│   ├── controller/
│   │   ├── DatabaseConnector.java
│   │   ├── StudentController.java
│   ├── Main.java
│
├── db/
│   ├── schema.sql
├── lib/
│   ├── sqlite-jdbc.jar
└── README.md


# School Management System

## Overview
The **School Management System** is a desktop application built in Java for managing students, teachers, and courses in a school environment. It features a user-friendly graphical interface and stores data in a local SQLite database.

---

## Features
- **Login System:** Admin access for managing records.
- **Student Management:** Add, view, and manage student details.
- **Database Integration:** Uses SQLite for data storage.

---

## Requirements
1. **Java Development Kit (JDK)** - Version 8 or later.
2. **Integrated Development Environment (IDE):** IntelliJ IDEA, Eclipse, or NetBeans.
3. **SQLite JDBC Library** - Download the `sqlite-jdbc.jar` file from [Maven Repository](https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc).
4. **Database File:** Included in the `db/` folder.

---

## Folder Structure
