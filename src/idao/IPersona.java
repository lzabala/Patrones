package idao;

import java.util.ArrayList;

import model.GenderEnum;
import model.Persona;

public interface IPersona {

	Persona getPersonaByDni(String dni);
	ArrayList<Persona> getPersonasAll();
	ArrayList<Persona> getPersonasByGender(GenderEnum gender);
	void addPersona(Persona persona);
}
