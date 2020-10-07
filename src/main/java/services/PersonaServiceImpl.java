package services;

import bean.Persona;


public class PersonaServiceImpl implements PersonaService{


    @Override
    public void changeName(Persona persona, String newName) {
        persona.setName(newName);
    }
}
