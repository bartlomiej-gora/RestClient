package pl.bgora.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;

@SpringBootApplication
@ImportResource("hello-integration.xml")
public class Main {


    private HelloGateway helloGateway;

    public static void main(String[] args) {
        ApplicationContext app =  SpringApplication.run(Main.class, args);
        final Main main = new Main();
        main.setHelloGateway((HelloGateway) app.getBean("helloGateway"));
        main.sayHello();
    }


    public void sayHello(){
        final SayHelloRequest sayHelloRequest = new SayHelloRequest();
        sayHelloRequest.setName("Bartek");
        sayHelloRequest.setSurname("Góra");
        final SayHelloResponse response = helloGateway.sayHello(sayHelloRequest);
        System.out.println("Response: " + response.getMessage());
    }

    public void setHelloGateway(final HelloGateway helloGateway) {
        this.helloGateway = helloGateway;
    }
}
