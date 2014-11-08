package com.pruebas.configuracionJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pruebas.pojo.Beanb;

public class ApplicationXMLConfiguration {
	
		
	    private static ApplicationContext context;

		public static void main( String[] args ) {
		   	context = new ClassPathXmlApplicationContext(new String[] {"spring/spring.xml"});
		   	new ApplicationXMLConfiguration().init();
	    }
	    
		public void init(){
			Beanb beanb  = context.getBean(Beanb.class);
			beanb.setHola("HolaMundo");
			System.out.println(beanb.getHola());
		}
	

}
