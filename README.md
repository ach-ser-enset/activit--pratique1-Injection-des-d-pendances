This repository contains the solution to the Dependency Injection exercise, which covers both manual and framework-based dependency injection techniques in Java. The exercise is divided into two parts:

Part 1: Dependency Injection Interfaces and Implementations
In this section, the following tasks were completed:

Created the IDao interface with a method getData.
Implemented IDao with a class DaoImpl that provides data.
Created the IMetier interface with a method calcul.
Implemented IMetier with an example of loose coupling between components.
Dependency Injection was demonstrated using three approaches:
Static instantiation
Dynamic instantiation
Spring Framework (XML and Annotations-based configuration)
Part 2: Mini Framework for Dependency Injection
The second part of the exercise involved creating a mini-framework for dependency injection, similar to Spring IOC. The mini-framework was designed to:

Allow dependency injection via XML configuration using JAX Binding (OXM) for object-to-XML mapping.
Enable dependency injection using Annotations.
Support different injection methods:
Constructor injection
Setter injection
Field injection (direct access to attributes)
Technologies Used
Java for the core logic and implementation
Spring Framework (for XML and annotation-based dependency injection)
JAX Binding (for XML mapping)
How to Use
Clone the repository:


git clone https://github.com/yourusername/dependency-injection-exercise.git
Import the project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse).

To see the solution, refer to the Main class (or similar entry point) for examples of dependency injection methods.

Spring Configuration:

XML configuration is located in the spring-config.xml file.
Annotation-based configuration is demonstrated within Java classes using @Autowired and @Configuration.
