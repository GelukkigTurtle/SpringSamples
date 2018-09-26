package com.lep4.app;

public class HolaMundoDesacopladoFactory {
	
	public static void main(String[] args) {
		RenderizadorDeMensaje mr = MensajesFactory.getInstancia().getRenderizador();
		ProveedorDeMensaje mp = MensajesFactory.getInstancia().getProveedor();
		mr.setProveedorDeMensaje(mp);
		mr.renderizar();

	}

}
