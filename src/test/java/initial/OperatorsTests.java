package initial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OperatorsTests {

    /**
     * Esta es una division básica 2 numeros enteros que da de resultado otro número entero.
      */
    @Test
    public void testDivisionShouldReturnNumberEntire(){

        Integer valor = 6/3;
        assertEquals(2, valor.intValue());

    }


    /**
     * La división de 5/2 obtendrá el número base como resultado
     */
    @Test
    public void testDivisionDecimalShouldReturnNumberEntire(){

        Integer valor = 5/2;
        assertEquals(2 , valor.intValue());

    }

    /**
     * Si queremos obtener el valor de la division exacta el objeto a instanciar
     * deberia ser uno del tipo Double
     */
    @Test
    public void testDevisionDecimalShouldReturnDecimal(){
        Double valor = 5./2;
        assertEquals("2.5", valor.toString());

    }

}
