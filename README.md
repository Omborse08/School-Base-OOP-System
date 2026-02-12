# 🎓 School Management System (Java Console Project)

A console-based School Management System built using core Java and Object-Oriented Programming principles.

This project demonstrates structured system design using abstraction, inheritance, composition, and encapsulation.

---

## 📌 Project Overview

The system allows management of:

- 👨‍🎓 Students  
- 👨‍🏫 Professors  
- 📚 Courses  
- 📝 Course Enrollment  
- 💰 Credit-Based Fee Calculation  
- 💳 Fee Payments  

This project focuses on building a structured multi-class system rather than a simple script.

---

## 🚀 Features

- Add Student  
- Add Professor  
- Add Course  
- Enroll Student in Course  
- View Student Details  
- View All Courses  
- Dynamic Credit-Based Fee Calculation  
- Partial Fee Payment  
- Remaining Fee Tracking  

---

## 💰 Credit-Based Fee System

- Each course has assigned credits.
- Fee per credit = `₹2000`
- When a student enrolls:
  - Total credits increase
  - Total fees increase automatically
- Students can pay fees partially.
- Remaining fees are calculated dynamically.

### Example:

If a student enrolls in:
- Java (4 credits)
- DSA (3 credits)



Total Credits = 7
Total Fees = 7 × 2000 + BaseFees = ₹14,000 + ₹20,000 = $34,000


---

## 🧠 OOP Concepts Used

This project demonstrates:

- ✅ Encapsulation  
- ✅ Inheritance  
- ✅ Abstraction  
- ✅ Polymorphism  
- ✅ Composition (Student "has" Courses)  
- ✅ Separation of Concerns (Model / Controller / UI)

---

## 🏗 Project Structure



School/
│
├── Person.java (Abstract Base Class)
├── Student.java (Extends Person)
├── Professor.java (Extends Person)
├── Courses.java (Course Model)
├── College.java (System Controller)
└── FrontEnd.java (Console Interface)


---

## 🖥 Sample Console Menu



Add Student

Add Professor

Add Course

Enroll Student in Course

View Student Details

View Course Details

Pay Student Fees

Exit


---

## 🛠 Technologies Used

- Java (Core)
- OOP Principles
- Console-Based Interface
- Arrays / Collections
- Structured Class Design

---

## 🎯 Learning Focus

This project was built to practice:

- Designing multi-class systems
- Managing object relationships
- Handling loops and search logic correctly
- Avoiding improper return usage inside loops
- Implementing dynamic fee logic
- Maintaining clean separation between logic and UI

---

## 👤 Author

**Om Borse**  
BSc Computer Science (AI Specialization)  
Aspiring Java Backend Engineer  

---

## 📎 Notes

This is a learning-focused project created to strengthen understanding of Java OOP and system modeling.
