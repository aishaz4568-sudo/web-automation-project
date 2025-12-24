# 🧪 Login & Registration Automation Project

📌 Project Overview
This project automates Login and Registration functionalities of a web application using Selenium WebDriver with Java.  
It demonstrates core automation skills such as element handling, waits, and validation using TestNG.

## 🛠️ Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Eclipse
- ChromeDriver

## 📂 Project Structure
Practice1/
│── src/main/java
│   └── com.unique
│       └── Unique.java
│
│── src/test/java
│   └── com.management
│       ├── Login.java
│       ├── Registration2.java
│       ├── Locators.java
│       ├── UploadFile.java
│── src/main/resources
│   └── log4j2.xml
│
│── testng.xml
│── pom.xml
│── README.md
│── logs/


## ✅ Automated Test Scenarios

### 🔐 Login Test
- Launch browser
- Navigate to login page
- Enter username and password
- Click login button
- Verify successful login

### 📝 Registration Test
- Open registration page
- Fill registration form
- Select radio buttons and checkboxes
- Upload file (if applicable)
- Submit form
- Verify success message

###📝 Logging

This project uses Log4j2 for logging. Log4j2 is a Java-based logging framework that helps track events during test execution. It provides different logging levels such as:
INFO – Successful steps execution
WARN – Element present but not interactable
ERROR – Element not found or test failure

## ⏳ Synchronization Used
- Explicit Wait (WebDriverWait)
- ExpectedConditions

## ⚠️ Known Issues
- Tests may fail due to dynamic elements or demo website changes.
- Locators may need updates if UI changes.

## ▶️ How to Run the Project
1. Clone the repository
2. Open in Eclipse
3. Update ChromeDriver path if required
4. Run tests using TestNG

## 👩‍💻 Author
Ayesha Zahid  
Junior Web Automation Tester  
Selenium | Java | TestNG
