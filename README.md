# spring-rest
Spring booth app with REST and H2


Create a REST API that can create, read, update, and delete "People" using any of the Spring projects and an in-memory database for persistence.  Track your changes/progress using GitHub, and share the GitHub repository with us when you’re done.  Add other REST API endpoints to group “People” into “Families.” 


Sample Usage:

Start application: 
navigate to myartifact directory
./gradlew bootRun 

Create Person
$ curl -i -X POST -H "Content-Type:application/json" -d '{  "firstName" : "John",  "lastName" : "Doe" }' http://localhost:8080/people

Update Person
$ curl -X PATCH -H "Content-Type:application/json" -d '{ "firstName": "Abraham" }' http://localhost:8080/people/1

Delete Person
$ curl -X DELETE http://localhost:8080/people/1

Create Person in Family
$ curl -i -X POST -H "Content-Type:application/json" -d '{  "firstName" : "John",  "lastName" : "Doe" }' http://localhost:8080/family/1/members

Get all members of family
$ curl http://localhost:8080/family/search/findByLastName?last_name=Doe