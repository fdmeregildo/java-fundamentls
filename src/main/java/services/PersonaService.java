package services;

import bean.Persona;
import org.springframework.stereotype.Service;

public interface PersonaService {

    void changeName(Persona person, String newName);
}
