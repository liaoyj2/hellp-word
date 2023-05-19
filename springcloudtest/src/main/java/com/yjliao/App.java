package com.yjliao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RibbonClient(name = "aaa" ,configuration = Tets.class)
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication application = new SpringApplication(App.class);
        application.run(args);
    }
}
