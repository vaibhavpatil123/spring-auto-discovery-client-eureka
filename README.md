# Sample example about spring micro service cloud services design pattern - auto discovery 

It has 2 sub main components

1 to create Service component 
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

  public static void main(String[] args) {
    new SpringApplicationBuilder(EurekaServer.class).web(true).run(args);
  }

}

and app config 
server:
  port: 8761
eureka:
  client:
    registerWithEureka: false
    fetchRegistry: false
    

2 to create Client 
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class EurekaClientApplication {

use FeignClient or without FeignClient 2 options possible 


Service registery can run on below url
http://localhost:8761/ 

