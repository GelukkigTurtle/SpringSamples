package com.lep4.app;

public class App {

	public static void main(String[] args) {
		
		if(args.length > 0) {
			for (int i=0; i< args.length; i++) {
				System.out.println("parametro ("+i+") "+args[i]);
			}
		}else {
			System.out.println("Hola Mundo");
		}
		
	}

}
