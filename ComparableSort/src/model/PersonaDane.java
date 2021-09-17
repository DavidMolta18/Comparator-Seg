package model;

public class PersonaDane implements Comparable<PersonaDane> {

	private String nombre;
	private String apellido;
	private double ingresos;
	private int edad;
	private int estrato;

	public PersonaDane(String nombre, String apellido, double ingresos, int edad, int estrato) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.ingresos = ingresos;
		this.edad = edad;
		this.estrato = estrato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEstrato() {
		return estrato;
	}

	public void setEstrato(int estrato) {
		this.estrato = estrato;
	}

	@Override
	public String toString() {
		String output = nombre + " " + apellido + " " + ingresos + " " + edad + " " + estrato;
		return output;
	}

	@Override
	public int compareTo(PersonaDane obj) {
		int criterioA = this.estrato - obj.estrato;
		if (criterioA == 0) {
			int criterioB = this.apellido.compareTo(obj.apellido);
			return criterioB;
		} else {
			return criterioA;
		}

	}

}
