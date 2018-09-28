![springboot](https://sdtimes.com/wp-content/uploads/2018/03/spring-boot-490x257.png)

# Bookshelf
Bootstrap application for testing a bookshelf

## create a new spring project from the scratch
generate the scaffolding of this project using INITIALIZR tool: 
https://start.spring.io/

in the dependencies field, write JPA and H2. After that generate the project.

## starting point
https://www.baeldung.com/spring-boot-start

## run springboot app
./gradlew bootRun

## create a new book
curl -d '{"title":"helloworld", "author":"whoknows"}' -H "Content-Type: application/json" -X POST http://localhost:8081/api/books

## get a book
curl -H "Content-Type: application/json" -X GET http://localhost:8081/api/books/1

## References
https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#spring-webflux
http://cloud.spring.io/spring-cloud-static/Finchley.SR1/single/spring-cloud.html
https://docs.spring.io/spring-security/site/docs/4.0.x/reference/htmlsingle/#csrf-configure

## Spring Webflux
![spring webflux](https://spring.io/img/homepage/diagram-boot-reactor.svg)

## Spring Cloud

![spring cloud](https://spring.io/img/homepage/diagram-distributed-systems.svg)


