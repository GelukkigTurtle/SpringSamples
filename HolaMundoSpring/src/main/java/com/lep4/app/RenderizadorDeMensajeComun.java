package com.lep4.app;

public class RenderizadorDeMensajeComun implements RenderizadorDeMensaje{
	
	
	private ProveedorDeMensaje  proveedor;

	public void renderizar() {
		if(proveedor == null) {
			System.out.println("El Proveedor de mensaje no existe!");
		}else {
			System.out.println(proveedor.obtenerMensaje());
		}
		
	}

	public void setProveedorDeMensaje(ProveedorDeMensaje proveedor) {
		this.proveedor = proveedor;
	}

	public ProveedorDeMensaje getProveedorDeMensaje() {
		return this.proveedor;
	}

}
