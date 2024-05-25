package Comparator;

import java.util.Comparator;

import lab3_ejercicioColecciones.Vehiculo;

public class ModeloComparator implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		return o1.getModelo().compareTo(o2.getModelo());
	}

}
