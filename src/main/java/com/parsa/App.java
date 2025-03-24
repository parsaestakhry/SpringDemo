package com.parsa;

import com.parsa.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop desktop = context.getBean("b",Desktop.class);
        desktop.compling();




    }
}
