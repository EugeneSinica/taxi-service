# Taxi Service

This project is a simple example of a taxi service. The goal of the application is to
make it easy to register a driver, assign him/her to a car.

<img src="https://i.ibb.co/BZc2v9r/taxi.webp" alt="">

A user can:
* Enter his account using login and password;
* Create driver, car and its manufacturer;
* Read all about all the drivers, cars and manufacturers;
* See all information about his cars

The project follows the principles of SOLID, OOP and THREE-level architecture.

__TECHNOLOGIES USED:__
* Java 11
* Apache Tomcat (v9.0.46)
* MySQL (v8.0.25)
* Maven
* Log4j
* JDBC
* Servlets
* JSP
* JSTL
* HTML, CSS

__STEPS TO LAUNCH THE APP:__

1. Run Intellij IDEA and open the project "taxi-service" forked from GitHub;
1. Open MySQL - make a connection - create a schema (remember its name)
1. Go to src/main/java/taxi/util/ConnectionUtil.java in your IDE. Then configure the connection:
    * URL - the url to the database connection (write your schema's name instead of "DATABASE NAME");
    * USERNAME - MySQL username;
    * PASSWORD - MySQL password;
    * JDBC_DRIVER - driver for MySQL (com.mysql.cj.jdbc.Driver);
1. In src/main/resources/log4j2.xml write the absolute path to where you want your log file to be stored in;
1. Configure TomCat (better TomCat 9);
1. Run the application and here we go.

Enjoy the app ♥

