package model;

public class Persona {

	private String name;
	private int age;
	private GenderEnum gender;
	private String dni;
	
	/**
	 * Constructors
	 */
	public Persona() {
		super();
	}
	
	public Persona(String name, int age, GenderEnum gender, String dni) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dni = dni;
	}
	
	/**
	 * Getters and setters
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public GenderEnum getGender() {
		return gender;
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * Public Methods
	 * 
	 */
	public void hablar(String texto) {
		System.out.println(texto);
	}
	
	@Override
	public String toString() {
		return "Nombre: " + getName() + " Edad: " + Integer.toString(getAge()) + " Sexo: " + getGender().toString() + " DNI: " + getDni();
	}

}
