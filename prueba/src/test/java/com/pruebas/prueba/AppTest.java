package com.pruebas.prueba;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pruebas.pojo.PojoPrueba;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/spring/spring.xml" })

public class AppTest {
	@Autowired
	private PojoPrueba pojo;

	@Test
	public void principal(){
		pojo.setHola("Eyyy");
		System.out.println(pojo.getHola());
	}
  
}
