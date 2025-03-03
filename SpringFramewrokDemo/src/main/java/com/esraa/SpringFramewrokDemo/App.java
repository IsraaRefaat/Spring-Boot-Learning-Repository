package com.esraa.SpringFramewrokDemo;

import com.esraa.SpringFramewrokDemo.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Laptop laptop = context.getBean("laptop", Laptop.class);
//        laptop.compile();

        Alien alien = context.getBean(Alien.class);
        alien.code();



    	
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//        Alien alien = (Alien) context.getBean("alien");
//        System.out.println(alien.getAge());
//        alien.code();


        
       
    }
}
