# Simple Arithmetic Parser

This is a Spring Boot application that uses **JavaCC** (Java Compiler Compiler) to parse and evaluate simple arithmetic expressions. The grammar is defined in `SimpleArithmetic.jj`, and the generated parser is integrated with the Spring Boot framework to expose parsing functionality through a REST API.

## Features
- Parse and evaluate arithmetic expressions involving addition, subtraction, multiplication, and division.
- Handle basic syntax errors in expressions.
- Easily extendable grammar using JavaCC.

## Prerequisites

Before you start, ensure you have the following installed:

- **Java JDK 8+**
- **Maven** (for building the Spring Boot project)
- **JavaCC** (for generating the parser)
- **PostgreSQL** (if the app interacts with a database, customize accordingly)

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/TayssirGh/javacc-demo.git
   cd simple-arithmetic-parser
2. Install JavaCC if you don't have it yet. Download it from the official [JavaCC website](https://javacc.github.io/javacc/)
3. Compile the JavaCC grammar file (SimpleArithmetic.jj) to generate the parser classes:

   ```bash
   javacc src/main/javacc/SimpleArithmetic.jj3+5*2
4. Run the application and test the endpoint at http://localhost:8080/api/arithmetic/parse?expression=yourexpression(3+5*2-for-example)

## Resources
Here are some useful resources to help you get started with JavaCC :
**JavaCC Documentation**: Official JavaCC documentation on how to write grammar files and generate parsers:
- [JavaCC Official Site](https://javacc.org/)
- [JavaCC GitHub Repository](https://github.com/javacc/javacc)

