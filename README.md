# 🏦 LedgerSync

**LedgerSync** is a Java-based application for managing account balances using JSON files.  
This project was developed as an **in-class assignment for Computer Science 330 (CS 330)** to practice file handling, JSON processing, and object-oriented programming concepts in Java.

![Java](https://img.shields.io/badge/Language-Java-red?logo=java) 
![Jackson](https://img.shields.io/badge/JSON-Jackson-blue) 


---

## 🚀 Features

- Store account information in a JSON file (`old.json`)  
- Store transaction records in a separate JSON file (`transaction.json`)  
- Match transactions with accounts and update balances  
- Generate a new JSON file (`new.json`) with updated account balances  
- Demonstrates **JSON handling with Jackson** and **OOP principles**  

---

## 🏷️ Classes Overview

### `Account`
Represents a bank account.  
**Fields:** account number, name, balance  
**Methods:**  
- `combine(TransactionRecord transaction)` – Updates balance if account numbers match  

### `TransactionRecord`
Represents a transaction.  
**Fields:** `accountNumber`, `amount`  
**Methods:** getters/setters  

### `CreateJSONFile`
Generates the initial account JSON file (`old.json`)  

### `CreateTransactionFile`
Generates transaction JSON file (`transaction.json`)  

### `FileMatch`
- Reads `old.json` and `transaction.json`  
- Updates accounts based on transactions  
- Writes updated accounts to `new.json` 
