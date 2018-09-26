package com.lep4.app;

import java.util.Properties;

public class MensajesFactory {
	
	private static MensajesFactory instancia;
	
	private Properties propiedades;
	private RenderizadorDeMensaje renderizador;
	private ProveedorDeMensaje proveedor;
	
	private MensajesFactory() {
		propiedades = new Properties();
		try {
			//Cargando en memoria el archivo de propiedades
			propiedades.load(
					this.getClass().getResourceAsStream("mensajes.properties"));
			
			//Obtenemos del archivo, los nombres de las clases necesarisas
			String renderizadorClass = propiedades.getProperty("render.class");
			String proveedorClass = propiedades.getProperty("proveedor.class");
			
			//Instanciamos las clases
			renderizador = (RenderizadorDeMensaje) Class.forName(renderizadorClass).newInstance();
			proveedor = (ProveedorDeMensaje) Class.forName(proveedorClass).newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//Se instancia el factory al momento de ejecutar el programa.
	static {
		instancia = new MensajesFactory();
	}

	public static MensajesFactory getInstancia() {
		return instancia;
	}

	public RenderizadorDeMensaje getRenderizador() {
		return renderizador;
	}


	public ProveedorDeMensaje getProveedor() {
		return proveedor;
	}

	

}
