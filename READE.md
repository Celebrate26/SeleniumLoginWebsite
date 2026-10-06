# Selenium Login Automation - Ndosi Website

Automated test suite designed to validate the login functionality of the **Ndosi Test Automation website** using **Selenium WebDriver**, **Java 21**, and **TestNG**.

## 🚀 Features

*   **Automated Authentication:** Simulates user workflow navigating to the web platform, inputting user credentials, and executing submission triggers.
*   **Sequential Visual Logging:** Captures automatic runtime snapshots (`.jpeg`) corresponding to localized milestones (e.g., Landing page initialization, Credentials inputted).
*   **Robust Framework Integration:** Leverages structured TestNG annotations (`@BeforeClass`, `@Test`, `@AfterClass`) ensuring structured cross-tier execution and cleanup.

---

## 🛠️ Prerequisites & Tech Stack

Before running the test suite, ensure your development environment satisfies the following minimum conditions:

*   **Java Development Kit (JDK):** Version 21
*   **Build Tool:** Apache Maven
*   **Browser Required:** Google Chrome

### Project Dependencies
Managed through Apache Maven within the localized configurations:
*   **Selenium Java:** v4.48.0
*   **TestNG:** v7.12.0
*   **Apache POI (OOXML):** v5.5.1
*   **ExtentReports:** v5.1.2

---

## 💻 Getting Started

### 1. Clone the Project Files
```bash
git clone <your-repository-url>
cd SeleniumLoginWebsite
```

### 2. Run the Automation Test
Execute the TestNG test suite utilizing standard Maven lifecycle execution parameters:
```bash
mvn clean test
```

---

## 📂 Project Structure Overview

*   **`loginToNdosiWebsite` Package:**
    *   `loginToNdosiWebsite.java`: Houses core test parameters targeting `https://ndosisimplifiedautomation.vercel.app/`. Handles browser context initialization, UI selectors (`By.id`, `By.xpath`), and sequential assertions.
*   **`screenshots` Package:**
    *   `Screenshot.java`: Extends runtime capabilities to capture execution snapshots on failure/success checkpoints utilizing `TakesScreenshot`.

---

## 📸 Artifact Tracking & Output Location

All contextual automation visuals captured throughout the pipeline execution run pass through standard stream buffers into hard disk targets.

Your generated step snapshots can be retrieved at:
```text
📦 project-root
 ┗ 📂 target
   ┗ 📂 screenshots
     ┣ 📜 01_Login_Page.jpeg
     ┣ 📜 02_Login_Credentials_Entered.jpeg
     ┗ 📜 03_Login_Credentials_Entered.jpeg
```
v