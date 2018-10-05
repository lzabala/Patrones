package daoImpl;

import java.util.ArrayList;
import idao.IPersona;
import model.GenderEnum;
import model.Persona;

public class PersonaDAOImpl implements IPersona{

	private ArrayList<Persona> personas;
	public PersonaDAOImpl() {
		personas = new ArrayList<Persona>();
		personas.add(new Persona("Leandro",36,GenderEnum.MALE,"43545345D"));
		personas.add(new Persona("Nicolás",31,GenderEnum.MALE,"67545555Y"));
		personas.add(new Persona("Irene",36,GenderEnum.FEMALE,"23456776G"));
	}

	@Override
	public Persona getPersonaByDni(String dni) {
		Persona selected = null;
		for (Persona persona : personas) {
			if(persona.getDni() == dni) {
				selected = persona;
			}
		}
		
		return selected;
	}

	@Override
	public ArrayList<Persona> getPersonasAll() {
		return personas;
	}

	@Override
	public ArrayList<Persona> getPersonasByGender(GenderEnum gender) {
		ArrayList<Persona> personasByGender = new ArrayList<Persona>();
		
		for (Persona persona : personas) {
			if(persona.getGender().equals(gender)) {
				personasByGender.add(persona);
			}
		}
		return personasByGender;
	}

	@Override
	public void addPersona(Persona persona) {
		personas.add(persona);
		
	}

}
