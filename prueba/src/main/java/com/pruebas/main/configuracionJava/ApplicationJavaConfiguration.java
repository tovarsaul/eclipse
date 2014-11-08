package com.pruebas.main.configuracionJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pruebas.pojo.Beanb;


@Configuration
@ComponentScan(basePackages = "com.pruebas.pojo,com.pruebas.main")
public class ApplicationJavaConfiguration {
	
    private static ApplicationContext context;

	public static void main( String[] args ) {
    	 context = new AnnotationConfigApplicationContext(ApplicationJavaConfiguration.class);
//    	 Beanb beanb  = context.getBean(Beanb.class);
//    	 beanb.setHola("HolaMundo");
//     	System.out.println(beanb.getHola());
    	 //ddddd
     new ApplicationJavaConfiguration().init();
    }
    
	public void init(){
		Beanb beanb  =  context.getBean(Beanb.class);
		beanb.setHola("HolaMundo");
		System.out.println(beanb.getHola());
//		estoy aqui!!!!
	}
}
