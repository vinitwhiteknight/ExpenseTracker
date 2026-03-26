# Personal Expense Tracker (CLI)

## Project Overview
This project is a Command-Line Interface (CLI) Personal Expense Tracker built entirely in Java. It allows users to log daily expenses, view a chronological history of their spending, and instantly calculate their total spending broken down by category. 

It was designed with a focus on core Object-Oriented Programming (OOP) principles, utilizing Java Collections (`ArrayList` and `HashMap`) for efficient in-memory data aggregation, and `java.time` for robust date handling.

## Prerequisites
* Java Development Kit (JDK) 8 or higher installed on your system.

## How to Run the Project
Because this application runs entirely in memory and uses standard Java libraries, there are no databases to configure or external dependencies to install. 

**If using Visual Studio Code (Recommended):**
1. Open the folder containing the `.java` files in VS Code.
2. Open the `Main.java` file.
3. Click the **Run** button located right above the `public static void main` method.
4. Interact with the application directly in the VS Code terminal at the bottom of your screen.

**If using a standard Terminal/Command Prompt:**
1. Navigate to the project folder.
2. Compile the code by running: `javac *.java`
3. Run the application with: `java Main`

## Features
* **Add Expense:** Safely parses user input to create an expense record with a Date, Amount, Category, and Description.
* **View All Expenses:** Displays a formatted table of all recorded transactions.
* **Category Aggregation:** Iterates through the stored data using a HashMap to dynamically calculate and display total money spent per category.