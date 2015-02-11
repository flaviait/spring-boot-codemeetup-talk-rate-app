# spring-boot-codemeetup-talk-rate-app

With this simple application it's possible to rate the talk and the speaker. 

You can run this application with `mvn spring-boot:run`. After the application is initialized, 
you can see the rate statistics at [this location](http://localhost:8080/rates). If you want to rate the talk, 
just type `http://localhost:8080/rate/{value}` (value stands for your rate and possible values are between 1-10).


This application is brought to you with love and passion by Spring Boot.