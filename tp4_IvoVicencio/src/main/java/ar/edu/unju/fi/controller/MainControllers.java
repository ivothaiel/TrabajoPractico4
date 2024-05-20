package ar.edu.unju.fi.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainControllers {
	@GetMapping ("/contenedores")
	public String getContainersPage() {
		return "containers";
	} 
	
	

	@GetMapping("/filascolumnas")
	public String getFilasColumnasPage() {
	return "filas-columnas";
	}
	
	
	@GetMapping("/alineacion")
	public String getAlineacionPage() {
	return "alineacion";
	}
}
