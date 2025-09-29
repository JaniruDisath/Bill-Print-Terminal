# 🧾 Terminal Billing System (Java)

A simple **Java console application** that generates a formatted bill for grocery items.  
This is my very first project, designed to practice **Java basics**, **user input handling**, and **console formatting**.  

---

## 🚀 Features
- Collects **customer details** (Name, Phone Number).
- Allows input of quantities for common grocery items.
- Calculates:
  - Item total
  - Overall total
  - 10% discount
  - Final payable amount
- Prints a **professional-looking bill** in the terminal.

---

## 🛠️ Tech Stack
- **Language**: Java 17+  
- **Tools**: Any IDE (IntelliJ IDEA, Eclipse, NetBeans) or CLI (`javac`, `java`)

---

## 📦 Installation & Usage
1. Clone the repository:
   ```bash
   git clone https://github.com/JaniruDisath/Bill-Print-Terminal

2.Navigate into the project folder:

    cd terminal-billing-system

3. Compile the program:
   
   javac src/edu/janiru/Main.java

4.Run the program:

  java edu.janiru.Main


##🖥️ Example Run


=========================================================================================
   __          __  _                _           _   __  __            _
   \ \        / / | |              | |         (_) |  \/  |          | |
    \ \  /\  / /__| | ___ ___ _ __ | |_ ___     _  | \  / | __ _ _ __| |_
     \ \/  \/ / _ \ |/ __/ _ \ '_ \| __/ _ \   | | | |\/| |/ _` | '__| __|
      \  /\  /  __/ | (_| (_) | | | | || (_) |  | | | |  | | (_| | |  | |_
       \/  \/ \___|_|\___\___/|_| |_|\__\___/   |_| |_|  |_|\__,_|_|   \__|

=========================================================================================

Enter Customer Phone Number  -  0712345678
Enter Customer Name  -  Alex

Basmathi Qty(Kg) - 2
Dhal Qty(Kg)     - 1
Sugar Qty(Kg)    - 3
...

+--------------+-------+-----------------+----------+
| Item         | Qty   | Unit Price      | Price    |
+--------------+-------+-----------------+----------+
| # Basmathi   | 2     | 250.0           | 500.0    |
| # Dhal       | 1     | 180.0           | 180.0    |
| # Sugar      | 3     | 150.0           | 450.0    |
...
+--------------+-------+-----------------+----------+
|                          Total         | 1130.0   |
|                          Discount(10%) | 113.0    |
|                          Final Price   | 1017.0   |
+----------------------------------------+----------+


  


