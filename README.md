# Selenium Automation Project: BooksWagon Automation

## Introduction
This project automates the testing of BooksWagon website functionalities using Selenium with Java. The focus is on automating the "Booksswagon.com" features. The project utilizes Page Object Model (POM), TestNG, Cucumber, and Maven to build a robust testing framework.

## Project Type
Backend (Automation Testing Framework)

## Deployed App
- Website: [https://www.bookswagon.com/](https://www.bookswagon.com/)

## Directory Structure
bookswagon-automation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/automation/pages/   # Page Object Model classes
│   ├── test/
│   │   └── java/
│   │       └── com/automation/tests/   # Test classes with TestNG annotations
├── config/
│   └── config.properties   # Property file containing URL and other configurations
├── reports/
│   └── ExtentReports/   # Generated test reports
└── pom.xml  
## Maven dependencies and project configuration
https://youtu.be/_nTXIpyNPv8

## Video Walkthrough of the Codebase
https://youtu.be/3F70-ohfTl0

## Features
- Automated Search Functionality
- Automated Request a Book Feature
- Language Toggle Automation (Hindi to English)
- Assertions to Validate UI Elements
- Screenshots on Failure
- Extent Reports for Test Execution

## Design Decisions and Assumptions
- **Page Object Model (POM)** for better maintainability.
- **TestNG** for test case structuring and execution.
- **Explicit Waits** for handling dynamic content.
- **Extent Reports** for detailed logging and reporting.
- **Cucumber Framework** for BDD with feature files in Gherkin language.

## Installation & Getting Started
1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/bookswagon-automation.git
   cd bookswagon-automation
   mvn test
   ## Technology Stack

- **Java**: Used for writing the automation scripts.
- **Selenium WebDriver**: A web automation tool used to control browser actions and automate UI testing.
- **TestNG**: A testing framework for managing and executing test cases, providing features like annotations, test configuration, and parallel execution.
- **Cucumber**: A BDD (Behavior-Driven Development) framework that allows writing test scenarios in plain English (Gherkin language) to facilitate collaboration between developers, testers, and non-technical stakeholders.
- **Maven**: A build and dependency management tool used to compile the project, manage libraries, and execute tests.
- **Extent Reports**: A reporting library used to generate detailed and visually appealing test execution reports, highlighting successes, failures, and logs.
- **Git**: A version control system used to track code changes and collaborate with others via repositories like GitHub.
