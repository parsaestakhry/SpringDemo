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
//        alien.setAge(31);
//        alien1.setAge(232);
        System.out.println(alien.getAge());



    }
}
