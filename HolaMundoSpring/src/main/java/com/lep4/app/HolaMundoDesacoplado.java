package com.lep4.app;

public class HolaMundoDesacoplado {

	public static void main(String[] args) {
		RenderizadorDeMensaje mr = new RenderizadorDeMensajeComun();
		ProveedorDeMensaje pm = new NuevoMensaje();
		mr.setProveedorDeMensaje(pm);
		mr.renderizar();
	}

}
