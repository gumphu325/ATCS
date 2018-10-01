# ATCS

How to run?
A- 
 - Open the project on any IDE and import it as a maven project.
 - Being developed using spring boot application, it has an application starter class i.e AtcsApplication.java
 - Right click on the above class and click "Run As" -> "Spring Boot App".

 
 
REST urls 
- Healthcheck - http://localhost:8080/healthcheck (GET)
- Enqueue / land - http://localhost:8080/flight/land (POST)
- Dequeue / fly - http://localhost:8080/flight/fly (PUT)

Sample Test Data-
[
  {
    "aircraftName": "AIRINDIA",
    "aircraftType": "PASSENGER",
    "aircraftSize": "LARGE"
  },
  {
    "aircraftName": "AIRINDIA_1",
    "aircraftType": "PASSENGER",
    "aircraftSize": "SMALL"
  },
  {
    "aircraftName": "AIRINDIA_2",
    "aircraftType": "PASSENGER",
    "aircraftSize": "SMALL"
  },
   {
    "aircraftName": "CARGO",
    "aircraftType": "CARGO",
    "aircraftSize": "SMALL"
  },
   {
    "aircraftName": "CARGO",
    "aircraftType": "CARGO",
    "aircraftSize": "LARGE"
  },
   {
    "aircraftName": "VIP",
    "aircraftType": "VIP",
    "aircraftSize": "SMALL"
  },
   {
    "aircraftName": "VIP",
    "aircraftType": "VIP",
    "aircraftSize": "LARGE"
  },
  {
    "aircraftName": "EMG",
    "aircraftType": "EMERGENCY",
    "aircraftSize": "LARGE"
  },
  {
    "aircraftName": "EMG",
    "aircraftType": "EMERGENCY",
    "aircraftSize": "SMALL"
  }
]





