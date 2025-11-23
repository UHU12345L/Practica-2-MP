package libPruebas;

import libClases.*; 

public class PruebaFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1 = new Fecha(15, 6, 2020);
        System.out.println("Fecha creada: " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());
        
        // Prueba con fecha inválida (debería corregirla)
        Fecha f2 = new Fecha(31, 2, 2021);  // 31 de febrero no existe
        System.out.println("Fecha corregida: " + f2.getDia() + "/" + f2.getMes() + "/" + f2.getAnio());
	}

}
