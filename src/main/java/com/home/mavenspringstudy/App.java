package com.home.mavenspringstudy;

import com.home.mavenspringstudy.performer.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-config.xml");
        
        Performer performer = (Performer) ctx.getBean("duke");
        
        performer.performer();
    }
}
