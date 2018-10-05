package daoTests;

import daoImpl.PersonaDAOImpl;
import idao.IPersona;
import model.GenderEnum;

public class PersonaDAOTest {

	public PersonaDAOTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		IPersona gestorPersonas = new PersonaDAOImpl();
		
		System.out.println("Imprimimos TODAS las personas");
		gestorPersonas.getPersonasAll().forEach(System.out::println);

		System.out.println("Imprimimos SOLO los Hombres las personas");
		gestorPersonas.getPersonasByGender(GenderEnum.MALE).forEach((p)-> System.out.println(p.toString()));

	}

}
