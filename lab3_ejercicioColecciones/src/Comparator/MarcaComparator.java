package Comparator;

import java.util.Comparator;

import lab3_ejercicioColecciones.Vehiculo;

public class MarcaComparator implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		return o1.getMarca().compareTo(o2.getMarca());
	}

}
