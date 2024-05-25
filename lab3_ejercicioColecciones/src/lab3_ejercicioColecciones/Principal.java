package lab3_ejercicioColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import Comparator.CmComparator;
import Comparator.MarcaComparator;
import Comparator.ModeloComparator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Vehiculo> listaVehiculos= new ArrayList<Vehiculo>();
		for(int i=0; i<=5;i++) {
			listaVehiculos.add(new Auto());
		}
		mostrar(listaVehiculos);
		agregarVehiculos(listaVehiculos);
		System.out.println("Ordenados por Modelo: ");
		ordenarPorModelo(listaVehiculos);
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("Ordenados por Marca: ");
		ordenarPorMarca(listaVehiculos);
		
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("Ordenados por cm de motor: ");
		ordenarPorCm(listaVehiculos);
		
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		System.out.println("Eliminacion de autos con kilometros menores a 100000: ");
		vehiculosConMenosKm(listaVehiculos);
	}
	
	public static void mostrar(List<Vehiculo>listaVehiculos) {
		String mostrar="";
		for(Iterator iterador= listaVehiculos.iterator();iterador.hasNext();) {
			Vehiculo vehiculo= (Auto)iterador.next();
			mostrar += vehiculo.toString();
			
		}
		JOptionPane.showMessageDialog(null, mostrar);
	}
	
	public static void agregarVehiculos(List<Vehiculo>listaVehiculos) {
		String mostrar="";
		for(int i=0; i <50;i++) {
			listaVehiculos.add(new Auto());
		}
		
		for(Iterator iterador= listaVehiculos.iterator();iterador.hasNext();) {
			Vehiculo vehiculosNVehiculo= (Auto)iterador.next();
			
			String otroKilometraje[]= {"10500","17000","760","98","130000","200000"};
			Random rnd= new Random();
			vehiculosNVehiculo.setKmRecorridos(otroKilometraje[rnd.nextInt(otroKilometraje.length)]);
			mostrar += vehiculosNVehiculo.toString();
		}
		JOptionPane.showMessageDialog(null, mostrar);
	}
	
	public static void ordenarPorModelo(List<Vehiculo> listaVehiculos) {
		Collections.sort(listaVehiculos, new ModeloComparator());
		for(Vehiculo vehiculos:listaVehiculos) {
			System.out.println(vehiculos.toString());
		}
	}
	
	public static void ordenarPorMarca(List<Vehiculo>listaVehiculos) {
		Collections.sort(listaVehiculos, new MarcaComparator());
		for(Vehiculo vehiculos:listaVehiculos) {
			System.out.println(vehiculos.toString());
		}
	}
	
	public static void ordenarPorCm(List<Vehiculo>listaVehiculos) {
		Collections.sort(listaVehiculos, new CmComparator());
		for(Vehiculo vehiculos:listaVehiculos) {
			System.out.println(vehiculos.toString());
		}
	}

	public static void vehiculosConMenosKm(List<Vehiculo>listaVehiculos) {
		Iterator<Vehiculo> iterador= listaVehiculos.iterator();
		List<Vehiculo>listaVehiculosMenorKm= new LinkedList<Vehiculo>();
		while(iterador.hasNext()) {
			Vehiculo nuevoVehiculo= iterador.next();
			int km= Integer.parseInt(nuevoVehiculo.getKmRecorridos());
			if(km <100000) {
				listaVehiculosMenorKm.add(nuevoVehiculo);
				iterador.remove();
			}
		}
		for(Vehiculo vehiculos:listaVehiculos) {

				System.out.println("Vehiculos mayores a 100000");
			   System.out.println(vehiculos.toString());
		}
		
		for(Vehiculo vehiculo: listaVehiculosMenorKm) {
			System.out.println("Vehiculos menores a 100000");
			System.out.println(vehiculo.toString());
		}
	}
}
