package com.project.SpringProject;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 

{

   public static void main( String[] args )

   {

   	ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
//
//   	Car car1=(Car)con.getBean("c1");
//
//   	System.out.println(car1.toString());
//
//
//   	Type ty1=car1.getT1();
//
//   	System.out.println(ty1.toString());
   	
   	
   	Student s1 = (Student)con.getBean("s1");
   	System.out.println(s1.toString());

   }

}

