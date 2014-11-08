package com.pruebas.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Beanb {

	@Autowired
	private PojoPrueba pojo;
	


	public String getHola() {
		return pojo.getHola();
	}

	public void setHola(String hola) {
		pojo.setHola(hola);
	}
}
