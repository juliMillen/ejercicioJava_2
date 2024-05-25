package lab3_ejercicioColecciones;

import java.util.Random;

public class Auto extends Vehiculo{

	private String modelo;
	private String marca;
	private String cmDeMotor;
	private String kmRecorridos;
	
	 private String modelos[] = {"Camioneta","Deportivo","SUV","De ciudad"};
	  private String marcas[] = {"Citroen","Renault","Chevrolet","Honda","Toyota"};
	  private String cmDeMotores[] = {"1000","1400","2000","2500","3500","1500"};
	  private String kmRecorridoss[] = {"100","10000","150000","300000","400","4500"};
	  Random rnd= new Random();
	public Auto() {
		super();
		// TODO Auto-generated constructor stub
		this.modelo= modelos[rnd.nextInt(modelos.length)];
		this.marca= marcas[rnd.nextInt(marcas.length)];
		this.cmDeMotor= cmDeMotores[rnd.nextInt(cmDeMotores.length)];
		this.kmRecorridos= kmRecorridoss[rnd.nextInt(kmRecorridoss.length)];
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCmDeMotor() {
		return cmDeMotor;
	}
	public void setCmDeMotor(String cmDeMotor) {
		this.cmDeMotor = cmDeMotor;
	}
	public String getKmRecorridos() {
		return kmRecorridos;
	}
	public void setKmRecorridos(String kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
	@Override
	public String toString() {
		return "\nmodelo=" + modelo + "\nmarca=" + marca + "\ncmDeMotor=" + cmDeMotor + ", \nkmRecorridos= "
				+ kmRecorridos;
	}
	
	
	 
}
