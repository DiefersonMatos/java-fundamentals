# Java Fundamentals

This repository contains Java 17 code examples focused on core **Object-Oriented Programming (OOP)** principles, **Jakarta EE**, **JUnit 5 tests**, and **common technical exercises** 

---

## 📚 Contents

### ✅ Fundamentals
- OOP (Abstraction, Encapsulation, Inheritance, Polymorphism)
- Java Collections
- Exception Handling
- Functional Programming (Streams, Lambdas)
- Concurrency (Executors, Threads)
- Jakarta EE (CDI, REST)
- Lombok

## 💡 Exercises

### 🔹 Arrays and Strings
- Two Sum
- Longest Substring Without Repeating Characters
- Merge Intervals
- Rotate Matrix (in-place)
- Maximum Subarray (Kadane's Algorithm)
- Product of Array Except Self
- Group Anagrams
- Valid Parentheses
- Minimum Window Substring
- Search in Rotated Sorted Array

### 🔹 Linked Lists
- Reverse Linked List
- Detect Cycle in Linked List
- Merge Two Sorted Lists
- Remove Nth Node from End
- Intersection of Two Linked Lists

### 🔹 Trees and Graphs
- Invert Binary Tree
- Validate Binary Search Tree
- Lowest Common Ancestor
- BFS and DFS implementations
- Word Ladder (BFS)

### 🔹 Recursion & Backtracking
- Permutations
- N-Queens Problem
- Sudoku Solver
- Generate Parentheses

### 🔹 Dynamic Programming
- Longest Increasing Subsequence
- Coin Change
- Edit Distance
- 0/1 Knapsack
- House Robber

---

## 🧰 System Design (Markdown Only)

- How would you design:
    - A URL shortener (e.g., bit.ly)
    - An e-commerce product search
    - Rate Limiter (Token Bucket / Leaky Bucket)

> 📄 System design problems are documented in Markdown files in `/docs/system-design`.

## 🧰 Tech Stack

| Tool            | Description                          |
|-----------------|--------------------------------------|
| Java 17         | Main language                        |
| Maven           | Build automation                     |
| Jakarta EE      | API for CDI / REST abstraction       |
| Lombok          | For DTOs, POJOs, and Builders        |
| JUnit 5         | Unit testing                         |
| Maven Exec      | Running `main()` classes             |

---

## 🚀 Getting Started

### 🔧 Prerequisites

- Java 17+
- Maven 3.8+
- Git
- IDE (IntelliJ, VS Code, Eclipse)

---

## 🛠️ Build & Run

### 1. Clone the project

```bash
git clone https://github.com/DiefersonMatos/java-fundamentals.git
cd java-fundamentals
mvn clean compile
mvn exec:java -Dexec.mainClass="com.matos.fundamentals.oop.OOPMain"
```

## 📘 License
This project is open-source and available under the MIT License.

## 📬 Contact
Created by Dieferson Matos — reach out via LinkedIn or GitHub.