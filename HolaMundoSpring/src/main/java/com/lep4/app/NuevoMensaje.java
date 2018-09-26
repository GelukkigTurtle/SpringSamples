package com.lep4.app;

public class NuevoMensaje implements ProveedorDeMensaje{

	public String obtenerMensaje() {
		return "Esto es otro mensaje desacoplado";
	}

}
