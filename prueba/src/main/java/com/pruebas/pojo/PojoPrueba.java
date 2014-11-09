package com.pruebas.pojo;

import org.springframework.stereotype.Component;

@Component
public class PojoPrueba {

	private String hola;

	public String getHola() {
		return hola;
	}

	public void setHola(String hola) {
		this.hola = hola;
	}
}
