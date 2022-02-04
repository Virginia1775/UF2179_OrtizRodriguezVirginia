package Gestion;

import java.util.Objects;

public class Autocar {

	String matricula;
	String marca;
	String modelo;
	int Kilometros;
	int num_plazas;
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKilometros() {
		return Kilometros;
	}
	public void setKilometros(int kilometros) {
		Kilometros = kilometros;
	}
	public int getNum_plazas() {
		return num_plazas;
	}
	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autocar other = (Autocar) obj;
		return Objects.equals(matricula, other.matricula);
	}
	@Override
	public String toString() {
		return "Autocar [matricula=" + matricula + ", tipo=" + marca + ", modelo=" + modelo + ", Kilometros="
				+ Kilometros + ", num_plazas=" + num_plazas + ", getMatricula()=" + getMatricula() + ", getTipo()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", getKilometros()=" + getKilometros()
				+ ", getNum_plazas()=" + getNum_plazas() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
