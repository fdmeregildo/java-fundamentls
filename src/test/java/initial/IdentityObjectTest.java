package initial;

import bean.Persona;
import org.junit.Assert;
import org.junit.Test;

public class IdentityObjectTest {

    /** CONCEPTO --------------------
     * Identity (Identidad): Hace referencia al espacio en memoria que ocupa el objeto; se compara con "=="
     * Equality (Igualdad): Hace referencia a la igualdad de las propiedades del objeto; se compara con ".equals()"
     */

    @Test
    public void objectIdentityCase1() {

        //Objects
        Persona p1 = new Persona(1, "Pablo", "Valladares");
        Persona p2 = new Persona(1, "Pablo", "Valladares");

        System.out.println("p1:" + p1 + " y " + p2);

        Assert.assertFalse(p1==p2);
        System.out.println("No son identicos por que ocupan diferentes espacios en memoria");
    }

    @Test
    public void objectIdentityCase2() {

        Persona p1 = new Persona(1, "Pablo", "Valladares");
        Persona p2 = new Persona(1, "Pablo", "Valladares");

        System.out.println("p1:" + p1.getName() + " y " + p2.getName());

        Assert.assertFalse(p1.equals(p2));
        System.out.println("No son iguales por que nose ha sobreescrito el metodo equals del objeto");

        Assert.assertTrue(p1.getName().equals(p2.getName()));
        System.out.println("Sin embargo sus propiedades si son iguales ");
    }


}
