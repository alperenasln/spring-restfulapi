# RESTFUL API by using Spring boot and Heroku
## 1) Starting with Spring boot
From https://start.spring.io, as a Maven project, Spring boot 2.4.4,Java version 8.
I added 3 dependencies(Web,JPA and H2) to Spring boot and downloaded JAR file.
## 2) Opening JAR in Eclipse
I imported JAR file as Existing Maven Project and created new project.
## 3) Designing RESTFUL API
I started create my object USER firstly.Initialized private ID and public name .Then overrided equals,hash,toString methods.
Then wrote UserController where we use CRUD operations.

![image](https://user-images.githubusercontent.com/70862043/111705531-eb84a780-8851-11eb-8106-a1e4d150cd81.png)

Then wrote LoadDatabase to configurate logs and databaseç
And interface of UserRepository.
Lastly created an exception handling of "user not found" and wrote HTTPStatus to give a exception message in a different class(UserNotFoundAdvice.java).
We've done with coding.
Run this code on to start server and check from http://localhost:8080/users/
## 4) Testing on Postman
Created a collection then;
used GET request on http://localhost:8080/users/ URL.
used PUT request to add new user:

![put](https://user-images.githubusercontent.com/70862043/111706456-63070680-8853-11eb-8f61-4b41cb3473ce.png)

used POST request to update user:

![post](https://user-images.githubusercontent.com/70862043/111706496-73b77c80-8853-11eb-9e39-095e7378c157.png)

used DELETE request to delete user 

![delete](https://user-images.githubusercontent.com/70862043/111706537-82059880-8853-11eb-9541-bbf4240b8c78.png)

used GET request to check users.

![getafterdelete](https://user-images.githubusercontent.com/70862043/111706579-95b0ff00-8853-11eb-9aee-d5ed19855ae3.png)

## 5) Uploading code on Github
Uploaded my whole Java code to Github.
By https://www.youtube.com/watch?v=nHk53YnrE5k

## 6) Deploying Heroku
I connected my Heroku account to Github.
Then deploy manually and choose main branch.
But I got error with Java version.
So I went back to my code and changed java version from 15 to 1.8 on "pom.xml".
Finally I deployed my code and get this link : https://spring-restfulapi-demo.herokuapp.com/users

## Resources
I usually used REST tutorial of Spring
from: https://spring.io/guides/tutorials/rest/
