# 📊 Personal Expense Tracker (CLI)

## 📝 Project Overview
The Personal Expense Tracker is a lightweight, fully offline Command-Line Interface (CLI) application built entirely in Java. 

While many modern budgeting tools are bloated with complex graphical interfaces, online syncing requirements, and paywalls, this project takes a minimalist approach. It provides a fast, frictionless, and strictly private way for users to log their daily financial transactions and instantly gain insights into their spending habits through category-based aggregation.

This project was developed with a strong emphasis on clean code, **Object-Oriented Programming (OOP)** principles, and efficient memory management using the Java Collections Framework.

---

## ✨ Key Features

* **⚡ Frictionless Data Entry:** Users can quickly log expenses by providing a Date, Amount, Category, and Description directly through the terminal.
* **🛡️ Robust Input Validation:** The application is fortified with defensive programming. It utilizes `try-catch` blocks to handle `InputMismatchException` and `DateTimeParseException`, ensuring that accidental typos (like entering a letter instead of a monetary amount) do not crash the application.
* **📅 Smart Date Handling:** Leverages the `java.time.LocalDate` API to ensure all transactions are stored chronologically and adhere to a strict `YYYY-MM-DD` format.
* **🧮 Dynamic Category Aggregation:** Instantly calculates total money spent across all custom categories without needing a database query.
* **📂 Fully In-Memory:** Runs completely in the terminal's active memory, requiring zero external database configuration or internet connection.

---

## 🏗️ Technical Architecture & Concepts

This project demonstrates several core Computer Science and Software Engineering concepts:

* **Separation of Concerns (Model-View-Controller pattern concept):**
  * `Expense.java` acts as the **Data Model**, encapsulating the properties of a single transaction.
  * `ExpenseTracker.java` acts as the **Engine/Logic**, handling the storage and mathematical operations.
  * `Main.java` acts as the **Interface/Controller**, managing the user menu loop and input scanner.
* **Dynamic Data Structures:** Utilizes `ArrayList<Expense>` to handle an unknown, dynamically growing number of user inputs without the rigid constraints of standard arrays.
* **Algorithmic Efficiency:** Implements a `HashMap<String, Double>` to aggregate spending totals. Instead of using nested loops with $O(N^2)$ time complexity to search and sum categories, the Map instantly updates running totals by using the category name as a key, achieving highly efficient data processing.

---

## 💻 Installation & Execution

Because this application relies exclusively on standard Java libraries, there are no external dependencies, Maven files, or databases to configure. 

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed on your local machine.

### Option A: Running via Visual Studio Code (Recommended)
1. Clone or download this repository.
2. Open the project folder in VS Code.
3. Open the `Main.java` file in the editor.
4. Click the **Run** button located directly above the `public static void main` method.
5. Interact with the application menu directly within the VS Code integrated terminal.

### Option B: Running via Standard Terminal / Command Prompt
1. Clone or download this repository.
2. Open your terminal and navigate to the root directory of the project.
3. Compile all Java files by running:
   ```bash
   javac *.java
