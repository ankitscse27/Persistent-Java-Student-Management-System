# Persistent-Java-Student-Management-System
A Persistent Command-Line Student Management System built in Java. It utilizes Object Serialization to store and retrieve Student objects from a file, enabling data to persist between program executions. It supports full CRUD operations (Create, Read, Update, Delete).
# 📚 Persistent Student Management System (Java CLI)

This project is a simple, command-line interface (CLI) application developed in Java to manage student records. The core feature of this system is its **data persistence**, achieved using **Java Object Serialization**. This means the student list is automatically saved to a file (`students.ser`) when the application exits and loaded back when it starts, so data is never lost.

## ✨ Features

* **Persistent Data Storage:** Uses Java Serialization to save `Student` objects to a binary file (`students.ser`).
* **CRUD Operations:** Supports the four fundamental functions for persistent storage:
    * **C**reate (Add New Student)
    * **R**ead (View All Students, Search Student by ID)
    * **U**pdate (Update Student Course)
    * **D**elete (Delete Student by ID)
* **User-Friendly Menu:** A simple, interactive menu for easy navigation.
* **Basic Input Validation:** Includes checks for numeric input and duplicate student IDs.

## 🛠️ Technology Stack

* **Language:** Java
* **Core Concepts:** Object-Oriented Programming (OOP), Data Structures (ArrayList), File I/O, Java Serialization.

## 🚀 Getting Started

### Prerequisites

* Java Development Kit (JDK) 8 or newer installed on your machine.

### Installation and Run

1.  **Clone the Repository:**
    ```bash
    git clone <ankitscse27/Persistent-Java-Student-Management-System>
    cd Persistent-Java-Student-Management-System
    ```

2.  **Compile the Code:**
    Compile both the `Student.java` and `StudentManagementSystem.java` files.
    ```bash
    javac Student.java StudentManagementSystem.java
    ```

3.  **Run the Application:**
    Execute the main class.
    ```bash
    java StudentManagementSystem
    ```

## 🖥️ How to Use

Upon running the application, you will be presented with the main menu:
