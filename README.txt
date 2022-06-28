This App uses Microprofile Rest Client aka typesafe  Rest Client to retrieve
json data from a web exposed rest service www.api.tvmaze.com.
A Java Data Model class is used as a datamodel to map incoming JSON response
to the supplied matching Data Model class properties.

Then sent back as a rest service in the Json format,
hiding the origins of both remote API and internal rest API

To run
mvn clean package
mvn liberty:dev
