This App uses Microprofile Rest Client aka typesafe Rest Client retrieves
json data from a web exposed rest service www.api.tvmaze.com.
A Java Data Model class is used as a datamodel to auto map incoming JSON response
to the supplied matching Data Model class properties.
Then sent back as a rest service in the Json format.

The microprofile typesafe Rest Client API hides the origin of the Rest API
by acting as a proxy.

To run
mvn clean package
mvn liberty:dev

This type of application is an exercise in prototyping, therefore it is not unusual
for me to find unreported Software Bugs.Not many people do Protoyping I guess.
https://github.com/OpenLiberty/open-liberty/issues/21547
