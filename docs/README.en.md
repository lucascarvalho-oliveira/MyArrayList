<p align="center">
  <a href="../README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# MyArrayList - Static Sequential List Implementation

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

This repository contains a robust implementation of a **Sequential List (ArrayList)** in Java. The project was structured using the **ADT (Abstract Data Type)** concept, separating the operation definitions (Interface) from the business logic (Implementation).

## 📂 Project Structure

The project follows a package organization to separate logic from the test interface:

* **`src/service`**: Contains the `MyArrayListTAD` interface and the `MyArrayList` class.
* **`src/app`**: Contains the `Main` class with an interactive menu for the user.

## Implemented Features

The list supports all classic array manipulation operations:

### Insertion
* `addFirst(int element)`: Inserts at the beginning (index 0) shifting others.
* `addLast(int element)`: Insere at the last available position.
* `insertAt(int index, int element)`: Inserts at an arbitrary position.
* **`addSorted(int element)`**: Inserts the item maintaining the list in ascending order.

### Removal
* `removeFirst()`: Removes and returns the first element.
* `removeLast()`: Removes and returns the last element.
* `removeAt(int index)`: Removes the element from a specific position.
* `remove(int element)`: Searches for a specific value and removes it from the list.

### Query and Information
* `get(int index)` / `set(int index, int element)`: Direct access and modification.
* `find(int element)`: Linear search that returns the element index.
* `count()`: Returns the total number of present elements.
* `isEmpty()` / `isFull()`: List state checkers.
* `display()`: Displays the formatted list in the console (Ex: `[ 10 20 30 ]`).

## How to Run

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/lucascarvalho-oliveira/MyArrayList.git](https://github.com/lucascarvalho-oliveira/MyArrayList.git)
    ```
2.  **Import into IntelliJ IDEA:**
    * Open the IDE and select `Open`.
    * Choose the project folder.
3.  **Run the System:**
    * Navigate to `src/app/Main.java`.
    * Right-click and select **Run 'Main.main()'**.

## Exception Handling

The system was protected with `try-catch` blocks and `RuntimeException` throws. This prevents the program from crashing if the user tries to:
1. Add elements to a list that has already reached its maximum capacity.
2. Remove elements from an empty list.
3. Access negative indices or indices greater than the item count.

## Author

Developed by **Lucas Carvalho Oliveira**.

---
*This project was created for educational purposes regarding Linear Data Structures.*
