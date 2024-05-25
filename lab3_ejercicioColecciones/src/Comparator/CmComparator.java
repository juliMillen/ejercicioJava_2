package Comparator;

import java.util.Comparator;

import lab3_ejercicioColecciones.Vehiculo;

public class CmComparator implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		return o2.getCmDeMotor().compareTo(o1.getCmDeMotor());
	}

}
