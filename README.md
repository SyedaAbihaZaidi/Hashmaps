# Sales Data Processing in Java

This project contains Java programs that read sales data from a text file and calculate:

- Product Wise Total Sales
- ID Wise Total Sales

The programs are implemented using:

1. HashMap
2. Without HashMap (Using Arrays)

---

# Project Files

| File Name | Description |
|------------|-------------|
| `productwisewithhashmap_1.java` | Calculates product-wise sales using HashMap |
| `productwisewithouthashmap_1.java` | Calculates product-wise sales without HashMap |
| `idwisewithhashmap_2.java` | Calculates ID-wise sales using HashMap |
| `idwisewithouthashmap_2.java` | Calculates ID-wise sales without HashMap |

---

# Input File

All programs read data from:

```text
E:\Abiha\SalesEVESession.txt
```

The file should contain tab-separated sales records.

## Example Data

```text
ID	Product	UnitPrice	Quantity	Category	CustomerID
1	Laptop	50000	2	Electronics	C101
2	Mouse	1000	5	Accessories	C102
3	Laptop	50000	1	Electronics	C101
```

---

# Concepts Used

## Java Concepts

- File Handling
- Scanner Class
- Arrays
- HashMap
- Loops
- Exception Handling
- String Splitting
- Parsing Numbers

---

# Program Working

## 1. Product Wise Sum Using HashMap

- Reads product names from file
- Calculates total sales amount
- Stores totals in `HashMap<Product, Amount>`

### Formula

```text
Amount = UnitPrice × Quantity
```

---

## 2. Product Wise Sum Without HashMap

- Uses arrays instead of HashMap
- Searches product manually
- Adds totals using loops

---

## 3. ID Wise Sum Using HashMap

- Reads customer IDs
- Calculates total amount for each ID
- Stores values in HashMap

---

## 4. ID Wise Sum Without HashMap

- Uses arrays for IDs and totals
- Searches existing IDs manually
- Updates sums using loops

---

# How to Run

## Step 1: Compile

```bash
javac filename.java
```

### Example

```bash
javac productwisewithhashmap_1.java
```

---

## Step 2: Run

```bash
java classname
```

### Example

```bash
java productwisewithhashmap_1
```

---

# Sample Output

## Product Wise Sum

```text
Laptop = 150000.0
Mouse = 5000.0
```

## ID Wise Sum

```text
C101 = 150000.0
C102 = 5000.0
```

---

# Advantages of HashMap Version

- Faster searching
- Better performance
- Cleaner code
- Suitable for large datasets

---

# Advantages of Without HashMap Version

- Easy to understand for beginners
- Uses basic arrays and loops
- Helpful for learning logic building

---

# Author

Abiha Zaidi

Java Sales Data Processing Project  
Created for learning File Handling and Data Processing in Java.
