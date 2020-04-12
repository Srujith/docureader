# DocuReader 

## Built With

* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[JDK](JAVA 11)
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[MySQL](https://www.mysql.com/) - Open-Source Relational Database Management System
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system 
* 	[Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.
* 	[Swagger](https://swagger.io/) - Open-Source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services.

## External Tools Used

* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)

## Running the application locally
```shell
mvn spring-boot:run
```
### Actuator

To monitor and manage your application

|  URL |  Method |
|----------|--------------|
|`http://localhost:8080`  						| GET |
|`http://localhost:8080/docureader/actuator/`             | GET |


### URLs

|  URL |  Method | Remarks |
|----------|--------------|--------------|
|`http://localhost:8080/docureader/ping`                           | GET | Custom Response Headers|
|`http://localhost:8080/docureader/uploadFile`                           | POST | Upload PDF|
