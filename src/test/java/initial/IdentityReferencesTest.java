package initial;

import bean.Persona;
import org.junit.Assert;
import org.junit.Test;
import services.PersonaService;
import services.PersonaServiceImpl;


public class IdentityReferencesTest {

    @Test
    public void objectIdentityReferenceChange() {

        Persona p1 = new Persona(1, "Pablo", "Valladares");
        Persona p2 = new Persona(1, "Pablo", "Valladares");

        p2 = p1; //apuntan a la misma dirección en memoria

        p2.setLasname("Nuevo Apellido en p2");
        System.out.println("Valor de p1.name: " + p1.getName() + " y p2.name: " + p2.getName());
        Assert.assertTrue("El cambio en 'p2' también se aplicó a p1, ya que referencian al mismo punto en memoria", p1.getName().equals(p2.getName()));

        p1.setLasname("Nuevo Apellido en p1");
        System.out.println("Valor de p1.name : " + p1.getName() + " y " + p2.getName());
        Assert.assertTrue("El cambio en 'p1' también se aplicó a p2, ya que referencian al mismo punto en memoria", p1.getName().equals(p2.getName()));

    }


    @Test
    public void objectReferenceThisMethod(){

        Persona p1 = new Persona(1, "Ricardo", "Roca");
        changeValueObject(p1);

        System.out.println("El valor deberia cambiar ya que esta apuntando al la misma dirección en memoria: "+p1.getName());
        Assert.assertEquals("Pablo", p1.getName());
    }

    private void changeValueObject(Persona persona){
        persona.setName("Pablo");
    }

    @Test
    public void objectReferenceServiceMethod(){

        Persona p1 = new Persona(1, "Ricardo", "Roca");
        System.out.println("Nombre inicial :"+p1.getName());

        PersonaService personaService = new PersonaServiceImpl();
        personaService.changeName(p1, "Pablo");

        System.out.println("El valor deberia cambiar ya que esta apuntando al la misma dirección en memoria");
        System.out.println("Nombre 1er cambio: " + p1.getName());

        Persona p2 = p1;
        p2.setName("Felipe");

        System.out.println("El cambio aplicado en p2 afecta a p1");
        System.out.println("Nombre 2er cambio: " + p1.getName());

        Assert.assertEquals("Felipe", p1.getName());
    }


    @Test
    public void wrapperIntegerReferenceMethod(){

        Integer x = new Integer(5);
        changeValuePrimitive(x);

        System.out.println("el valor deberia continuar siendo el mismo:"+x);
        Assert.assertEquals(5, x.intValue());
    }


    private void changeValuePrimitive(Integer value){
        value = 900000;
    }

}

