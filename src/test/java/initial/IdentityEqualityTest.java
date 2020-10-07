package initial;

import org.junit.Assert;
import org.junit.Test;

public class IdentityEqualityTest {

    /** CONCEPTO --------------------
     * Identity (Identidad): Hace referencia al espacio en memoria que ocupa el objeto; se compara con "=="
     * Equality (Igualdad): Hace referencia a la igualdad de las propiedades del objeto; se compara con ".equals()"
     */


    /**
     *  En los datos primitivos le identidad y la igualdad es la misma por ello se puede utilizar "=="
     */
    @Test
    public void primitiveIdentity() {

        int x = 8;
        int y = x;
        x = 5;

        System.out.println("Valor diferentes x: " + x + " | y: " + y);
        Assert.assertEquals(8 , y);
        Assert.assertFalse(y == x);

    }


    /**
     *  En los wrappers en la práctica funciona igual que los datos primitivos, pero esto se debe que que son datos
     *  inmutables, esto quiere decir que al asignarse el nuevo valor ocupa un nuevo lugar en memoria
     */
    @Test
    public void wrappersNotHaveIdentity() {

        Integer a = new Integer(8);
        Integer b = a;
        a = 5;

        System.out.println("Valor diferentes de a: " + a + " | b: " + b);

        Assert.assertEquals( 8, b.intValue());
        Assert.assertFalse(a == b);
        Assert.assertFalse(a.equals(b));

    }


    @Test
    public void wrapperStringNotHaveIdentity(){

        String valor1 = "texto";
        String valor2 = valor1;
        valor1 = "Nuevo Texto";

        System.out.println("Valor de a: "+valor1 + "| valor2: "+valor2);
        Assert.assertEquals("texto", valor2);
        Assert.assertFalse(valor1.equals(valor2));

    }




}

