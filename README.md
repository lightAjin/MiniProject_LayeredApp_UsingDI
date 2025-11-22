# MiniProject_LayeredApp_UsingDI
A Spring Boot layered application demonstrating Dependency Injection using Controller–Service–DAO structure. Integrates Oracle DB to fetch employee details and uses Lombok to reduce boilerplate. Showcases Spring’s IoC container and automatic bean wiring across layers.

-->This mini-project is a 3-Layered Spring Boot application demonstrating the use of Dependency Injection and Spring Bean Lifecycle. The project integrates Spring Boot Core, Spring Starter dependencies, Lombok, and Oracle Database to fetch employee details such as empno, name, job, and salary.

-->The most fascinating part of this project is the automatic wiring of beans using Spring’s IoC container.
The flow of dependency injection is:

@Repository  (DAO Layer)
        → @Service (Service Layer)
               → @Controller (Controller Layer)


-->Spring automatically injects the DAO object into the Service class and the Service into the Controller class, showcasing a clean and maintainable Layered Architecture.
The application connects to Oracle SQL to retrieve employee records using DAO, processes them in Service, and displays them via the Controller. Lombok is used to reduce boilerplate code by automatically generating getters, setters, constructors, and toString methods.

-->This project demonstrates:
->Layered architecture (Controller → Service → DAO)
->Spring Boot Dependency Injection (@Autowired / Constructor Injection)
->Spring Bean lifecycle & IoC container usage
->Integration with Oracle Database
->Use of Lombok to simplify model classes
