# Builder Pattern Assignment - Email System

## Project Overview
This project implements the **Builder Design Pattern** in Java for creating complex `Email` objects. It demonstrates separation of concerns, method chaining (fluent API), input validation, and distinct product representations (object vs. text string).

## Architecture & Components
* **`Email`**: The immutable product class.
* **`EmailBuilder`**: The common interface defining mandatory building steps.
* **`EmailObjectBuilder`**: Concrete builder that constructs a full `Email` object instance.
* **`EmailTextBuilder`**: Concrete builder that formats the email as a plain text string representation.
* **`EmailDirector`**: Manages the construction process and implements pre-defined configurations.
* **`Client`**: The execution class demonstrating the usage.