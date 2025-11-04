# 📦 Student Management System Repository Bundle

## 🌐 GitHub Repository Summary

A **Persistent Command-Line Student Management System** built in Java. It leverages **Object Serialization** for automatic data saving and loading, ensuring all student records persist across sessions. It offers a complete **CRUD** interface for managing student data efficiently.

**Key Topics/Tags:** `java`, `serialization`, `file-io`, `crud`, `cli-application`, `student-management`

---

## 📄 Enhanced and Structured README.md

# 📚 Persistent Student Management System (Java CLI)

This project delivers a robust, command-line interface (CLI) application for managing student records. Unlike basic in-memory applications, this system features automatic **data persistence** through **Java Object Serialization**, making it a practical example of real-world data handling in Java.

The entire list of students is saved to a binary file (`students.ser`) upon exit and seamlessly reloaded upon startup, ensuring zero data loss between uses.

## ✨ Core Features & Functionality

* **Robust Data Persistence:** Utilizes Java's built-in **Object Serialization** to store the complete `List<Student>` object directly to a local file (`students.ser`).
* **Full CRUD Support:** Provides all essential operations for data management:
    * **C**reate: Add new student records with unique ID validation.
    * **R**ead: View all students in a formatted table or search for a specific student by ID.
    * **U**pdate: Modify a student's enrolled course.
    * **D**elete: Remove a student record using their ID.
* **Interactive CLI Menu:** A clean, numbered menu guides the user through all available actions.
* **Input Handling & Validation:** Includes checks to prevent crashes from non-numeric input and ensures student IDs are positive and unique.

## 🛠️ Technology & Concepts

| Component | Description |
| :--- | :--- |
| **Language** | Java |
| **Persistence** | **Object Serialization** (using `ObjectOutputStream` and `ObjectInputStream`) |
| **Data Structure** | `ArrayList<Student>` |
| **I/O** | `Scanner` for user input; `FileInputStream`/`FileOutputStream` for file access. |

## 🚀 Getting Started

Follow these steps to download, compile, and run the Student Management System on your local machine.

### Prerequisites

* **Java Development Kit (JDK) 8 or newer**

### Installation and Execution

1.  **Clone the Repository:**
    ```bash
    git clone ankitscse27/Persistent-Java-Student-Management-System
    cd Persistent-Java-Student-Management-System
    ```

2.  **Compile the Source Code:**
    Compile both the `Student.java` and `StudentManagementSystem.java` files.
    ```bash
    javac Student.java StudentManagementSystem.java
    ```

3.  **Run the Application:**
    Execute the main class to launch the interactive menu.
    ```bash
    java StudentManagementSystem
    ```

## 🖥️ Application Usage

Once the application is running, you will interact with the following menu:

This consolidated response contains the GitHub Summary, Tags, and the complete, enhanced README.md in a single Markdown box format.

Markdown

# 📦 Student Management System Repository Bundle

## 🌐 GitHub Repository Summary

A **Persistent Command-Line Student Management System** built in Java. It leverages **Object Serialization** for automatic data saving and loading, ensuring all student records persist across sessions. It offers a complete **CRUD** interface for managing student data efficiently.

**Key Topics/Tags:** `java`, `serialization`, `file-io`, `crud`, `cli-application`, `student-management`

---

## 📄 Enhanced and Structured README.md

# 📚 Persistent Student Management System (Java CLI)

This project delivers a robust, command-line interface (CLI) application for managing student records. Unlike basic in-memory applications, this system features automatic **data persistence** through **Java Object Serialization**, making it a practical example of real-world data handling in Java.

The entire list of students is saved to a binary file (`students.ser`) upon exit and seamlessly reloaded upon startup, ensuring zero data loss between uses.

## ✨ Core Features & Functionality

* **Robust Data Persistence:** Utilizes Java's built-in **Object Serialization** to store the complete `List<Student>` object directly to a local file (`students.ser`).
* **Full CRUD Support:** Provides all essential operations for data management:
    * **C**reate: Add new student records with unique ID validation.
    * **R**ead: View all students in a formatted table or search for a specific student by ID.
    * **U**pdate: Modify a student's enrolled course.
    * **D**elete: Remove a student record using their ID.
* **Interactive CLI Menu:** A clean, numbered menu guides the user through all available actions.
* **Input Handling & Validation:** Includes checks to prevent crashes from non-numeric input and ensures student IDs are positive and unique.

## 🛠️ Technology & Concepts

| Component | Description |
| :--- | :--- |
| **Language** | Java |
| **Persistence** | **Object Serialization** (using `ObjectOutputStream` and `ObjectInputStream`) |
| **Data Structure** | `ArrayList<Student>` |
| **I/O** | `Scanner` for user input; `FileInputStream`/`FileOutputStream` for file access. |

## 🚀 Getting Started

Follow these steps to download, compile, and run the Student Management System on your local machine.

### Prerequisites

* **Java Development Kit (JDK) 8 or newer**

### Installation and Execution

1.  **Clone the Repository:**
    ```bash
    git clone ankitscse27/Persistent-Java-Student-Management-System
    cd Persistent-Java-Student-Management-System
    ```

2.  **Compile the Source Code:**
    Compile both the `Student.java` and `StudentManagementSystem.java` files.
    ```bash
    javac Student.java StudentManagementSystem.java
    ```

3.  **Run the Application:**
    Execute the main class to launch the interactive menu.
    ```bash
    java StudentManagementSystem
    ```

## 🖥️ Application Usage

Once the application is running, you will interact with the following menu:

--- 📚 Persistent Student Management System ---

Add New Student

View All Students

Search Student by ID

Update Student Course

Delete Student by ID

Save & Exit Enter your choice:

### ❗ Critical Note on Persistence

**Always select option 6 ("Save & Exit")** to ensure the current state of your student data is properly serialized and saved to the `students.ser` file. Exiting the program without using this option will result in the loss of any data added since the last save.

---

## ⚙️ Code Highlights

* The `Student` class **implements `Serializable`** and defines a `serialVersionUID`.
* The `loadStudents()` method attempts to **deserialize** the `List<Student>` from the `students.ser` file.
* The `saveStudents()` method **serializes** the current in-memory list using `ObjectOutputStream` just before the program terminates.

---

## 🤝 Contribution

Feel free to fork the repository, submit pull requests, or report any issues you encounter.
