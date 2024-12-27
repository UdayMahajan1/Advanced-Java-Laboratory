1. The main code exists in src/main/java/com.springcore folder as follows : 
   1. The aspect folder contains the aspects that are to be used 
   2. The config folder is used to declare the beans
   3. the services folder contains the services which may use any of the aspects defined in the access folder.
   
2. Make note that to implement AOP in spring following dependencies are required (check out the pom.xml for greater detail)
   1. spring-aop
   2. aspectjweaver
   3. already existing dependencies like spring-core and spring-context which we used in lab6

3. To understand AOP in Spring in greater detail check out this link : https://docs.spring.io/spring-framework/docs/4.1.x/spring-framework-reference/html/aop.html
