package com.parsa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        object will be created in this line
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = (Alien)  context.getBean("alien");
        Alien alien1 = context.getBean(Alien.class);
        alien.age = 2;
        alien1.age = 223;
        System.out.println(alien.age);
        System.out.println(alien1.age);


    }
}
