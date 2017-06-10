package com.decipherzone.dynamodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 10/6/17 2:34 PM by Raja Dushyant Vashishtha
 * Sr. Software Engineer
 * rajad@decipherzone.com
 * Decipher Zone Softwares
 * www.decipherzone.com
 */

//@RestController
@SpringBootApplication
@ComponentScan(basePackages = {"com.decipherzone.dynamodb"})
public class Application {

    /*@RequestMapping("/")
    public String index() {
        return "Hello";
    }*/

    public static void main(String ... arg) {
        SpringApplication.run(Application.class, arg);
    }

}
