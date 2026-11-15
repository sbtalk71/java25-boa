# **Java 25 – Five-Day Hands-on Capstone Project**
5 working days

Java 25



## **1. Project title: Smart Employee & Department Management System**

### **Project overview**

Develop a Java-based Employee and Department Management System that maintains employee information, manages departments, performs employee searches, generates reports and processes selected operations using modern Java features.

The project will be developed incrementally over five days. Each day's implementation will use concepts covered in that day's training.

**Target audience:** Freshers with basic Java programming knowledge.

**Development approach:** Standalone Java application, initially using in-memory collections. The project does not require Spring Boot, databases, REST APIs or external frameworks.

## **2. Project goals**

By completing this capstone, trainees should be able to:

1. Apply OOP principles to model a real-world business application.
2. Use functional interfaces, lambda expressions and method references.
3. Process business data using the Stream API and Collectors.
4. Apply modern Java language features from Java 9 through Java 25.
5. Use records, sealed classes, pattern matching and modern switch expressions.
6. Understand and apply modern Java concurrency concepts.
7. Organise Java code into meaningful classes and packages.
8. Integrate the concepts learned across all five training days.

## **3. Business requirements**

The organisation wants a simple application to maintain employee and department information.

The application should support:

- Adding employees.
- Maintaining department information.
- Searching employees by ID, name and department.
- Updating employee details.
- Displaying employees based on salary and department.
- Generating department-wise employee reports.
- Identifying employees based on salary criteria.
- Calculating average salary and total employee count.
- Processing selected independent employee-related tasks asynchronously.

## **4. Five-day implementation plan**

The project will be built in small increments. Each day should take approximately 1–2 hours of project work, in addition to the training sessions.

### **Day 1 – Object-oriented design and functional programming**

**Training topics applied:**

- OOP principles: abstraction, encapsulation, inheritance and polymorphism.
- Abstract classes and interfaces.
- equals(), hashCode() and toString().
- Functional interfaces.
- Lambda expressions and method references.
- Predicate, Function, Consumer and Supplier.
- Optional API.

**Implementation tasks:**

1. Create the Java project and package structure.
2. Create the Employee class with:
   - Employee ID
   - Name
   - Email
   - Department
   - Designation
   - Salary
3. Create a Department class.
4. Implement constructors, getters and setters.
5. Implement equals(), hashCode() and toString().
6. Create an EmployeeService interface.
7. Implement basic employee addition and retrieval.
8. Use lambda expressions and functional interfaces for simple employee validation and processing.
9. Use Optional for employee lookup.

**Day 1 deliverables**

- Java project with appropriate packages.
- Employee and Department classes.
- EmployeeService interface and implementation.
- Add and retrieve employee functionality.
- Demonstration of functional interfaces and lambda expressions.

### **Day 2 – Employee data processing using Stream API**

**Training topics applied:**

- Stream pipeline.
- Intermediate and terminal operations.
- filter(), map(), flatMap(), distinct(), sorted().
- collect(), reduce(), count().
- findFirst(), anyMatch(), allMatch().
- groupingBy(), partitioningBy(), mapping(), joining().
- Summarizing collectors.

**Implementation tasks:**

Using the employee records created on Day 1:

1. Display all employees.
2. Search employees belonging to a particular department.
3. Find employees earning more than a specified salary.
4. Sort employees by name and salary.
5. Find the highest-paid and lowest-paid employees.
6. Calculate average salary by department.
7. Group employees by department.
8. Count employees in each department.
9. Generate a report containing employee names grouped by department.

**Example report:**

```
EMPLOYEE REPORT
-----------------------------

Department: IT
Total Employees: 5
Average Salary: 65000

Department: HR
Total Employees: 3
Average Salary: 45000

Department: Finance
Total Employees: 4
Average Salary: 55000
```

**Day 2 deliverables**

- Employee search and filtering functionality.
- Salary-based employee reports.
- Department-wise grouping and aggregation.
- Implementation using Stream API and Collectors.

### **Day 3 – Modern Java features (Java 9 to Java 17)**

**Training topics applied:**

- JShell.
- Factory methods for collections.
- Private methods in interfaces.
- var keyword.
- String enhancements.
- Files API improvements.
- Switch expressions.
- Text blocks.
- Records.
- Pattern matching for instanceof.
- Sealed classes.

**Implementation tasks:**

Enhance the existing application using modern Java features.

1. Use factory methods such as List.of() and Map.of() for predefined department information.
2. Use var where appropriate.
3. Introduce a Java record for employee summary/report information.
4. Use switch expressions for menu processing.
5. Use pattern matching for instanceof where appropriate.
6. Introduce a sealed hierarchy for employee categories, if appropriate.
7. Use text blocks for formatted employee reports.
8. Save employee information to a text file using the Files API.
9. Load employee information from the file when the application starts.

**Example record:**

```
public record EmployeeSummary(
    String department,
    long employeeCount,
    double averageSalary
) {}
```

**Day 3 deliverables**

- Application enhanced using Java 9–17 features.
- Employee summary implemented using records.
- Modern switch expressions.
- File-based employee data storage and retrieval.
- Formatted employee reports using text blocks.

### **Day 4 – Modern Java features (Java 18 to Java 25)**

**Training topics applied:**

- Pattern matching for switch.
- Record patterns.
- Guarded patterns.
- Record constructors and immutability.
- Sealed classes.
- Unnamed variables and patterns.
- Stream Gatherers.
- Flexible constructor bodies.
- Compact source files and instance main methods.
- Primitive types in patterns.
- Stable Values.

**Implementation tasks:**

1. Enhance employee classification using pattern matching for switch.
2. Use record patterns to extract employee summary information.
3. Use guarded patterns to classify employees based on salary or designation.
4. Introduce compact constructors for validation in records.
5. Use sealed classes to represent a controlled employee classification hierarchy.
6. Demonstrate an appropriate Stream Gatherer operation for a small employee data-processing requirement.
7. Explore selected Java 22–25 features through small examples, where supported by the training environment.

**Example business rule:**

Classify employees based on salary:

```
Salary Classification

Below 30,000      : Junior
30,000 - 60,000   : Mid-Level
Above 60,000      : Senior
```

Use modern switch pattern matching to implement the classification.

**Day 4 deliverables**

- Employee classification using modern pattern matching.
- Record patterns and compact constructors.
- Sealed class implementation.
- Demonstration of selected Java 22–25 features.
- Enhanced employee reporting.

### **Day 5 – Final integration, testing and demonstration**

**Focus:** Consolidate the application and demonstrate the Java concepts learned during the training.

**Implementation tasks:**

1. Integrate all application features developed during Days 1–4.
2. Verify employee creation and retrieval.
3. Verify search, filtering and sorting.
4. Verify department-wise reports.
5. Verify file-based data persistence.
6. Validate input and handle invalid data.
7. Execute functional test cases.
8. Fix application defects.
9. Prepare a project walkthrough.
10. Demonstrate the completed application.

**Day 5 deliverables**

- Complete and executable Java application.
- Integrated source code.
- Test cases and test execution results.
- Project documentation.
- Final project demonstration.

## **5. Suggested application architecture**

Keep the application simple and avoid unnecessary layers.

```
EmployeeManagementSystem
│
├── model
│   ├── Employee.java
│   ├── Department.java
│   └── EmployeeSummary.java
│
├── service
│   ├── EmployeeService.java
│   └── EmployeeServiceImpl.java
│
├── repository
│   └── EmployeeRepository.java
│
├── report
│   └── EmployeeReport.java
│
├── util
│   └── FileUtil.java
│
└── main
    └── EmployeeManagementApp.java
```

The repository can use an ArrayList initially and file handling for persistence. No database is required.

## **6. Final application menu**

```
========================================
     EMPLOYEE MANAGEMENT SYSTEM
========================================

1. Add Employee
2. View All Employees
3. Search Employee by ID
4. Search Employee by Department
5. Update Employee
6. Delete Employee
7. Display Employees by Salary
8. Generate Department-wise Report
9. Generate Salary Summary
10. Save Employee Data
11. Exit

Enter your choice:
```

## **7. Final project deliverables**

| No. | Deliverable            | Description                           |
| --- | ---------------------- | ------------------------------------- |
| 1   | Java source code       | Complete application                  |
| 2   | OOP implementation     | Classes, interfaces and encapsulation |
| 3   | Functional programming | Lambdas and functional interfaces     |
| 4   | Stream processing      | Filtering, sorting and grouping       |
| 5   | Modern Java features   | Records, switch and pattern matching  |
| 6   | Data persistence       | File-based storage                    |
| 7   | Reports                | Department and salary reports         |
| 8   | Test cases             | Functional test scenarios             |
| 9   | Documentation          | Project overview and execution steps  |
| 10  | Demonstration          | Working application walkthrough       |

## **8. Project evaluation**

| Evaluation criteria                   | Weight   |
| ------------------------------------- | -------- |
| OOP and application design            | 20%      |
| Functional programming                | 10%      |
| Stream API implementation             | 20%      |
| Modern Java features                  | 20%      |
| File handling and integration         | 10%      |
| Testing and correctness               | 10%      |
| Project explanation and demonstration | 10%      |
| **Total**                             | **100%** |

## **9. Explicit scope exclusions**

Although the training agenda includes concurrency and performance-related topics, they will not be part of this capstone, as requested.

The following are excluded:

- Multithreading and concurrency.
- Virtual threads and Structured Concurrency.
- ExecutorService and CompletableFuture.
- Concurrent collections.
- Parallel Streams and ForkJoinPool.
- Performance benchmarking and tuning.
- JVM and GC tuning.
- Thread dump analysis and profiling.

These topics can be taught independently through classroom demonstrations without increasing the capstone workload.

For Java 22–25 features, preview or experimental features should be treated as small classroom demonstrations rather than mandatory project dependencies.

## **10. Daily trainee submission checklist**

**Daily submission tracker**

0/20 completed

**Day 1 – Submission**

Project setup and package structure

Employee and Department classes

EmployeeService implementation

Lambda and functional interface examples

**Day 2 – Submission**

Employee filtering and searching

Sorting and salary calculations

Department-wise grouping

Stream-based reports

**Day 3 – Submission**

Records and switch expressions

Pattern matching for instanceof

Text blocks

File-based persistence

**Day 4 – Submission**

Pattern matching for switch

Record patterns and constructors

Sealed classes

Selected Java 22–25 feature demonstrations

**Day 5 – Submission**

Complete integrated application

Functional test cases

Source code and documentation

Final demonstration

Reset checklist

**Final recommendation for the trainer:** The capstone should reinforce the concepts taught during the first four days, with Day 5 reserved for integration, testing and demonstration. Trainees should not be burdened with learning additional technologies while completing the project.

The expected outcome is a working Java application that demonstrates practical use of Java 8–25 language and API features, rather than a large enterprise application.