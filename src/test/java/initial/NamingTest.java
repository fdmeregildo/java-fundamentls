package initial;

import org.junit.Test;

public class NamingTest {

    /*
     *  We can start naming java class with {'$', '_', [vocal]}
     */
    @Test
    public void waysToNamingVariable(){

        String $variableMoney = "S/.";
        String _variableGuion = "_ variable";
        String variableCommon = "Nombre Persona";

        String print = "variable value: ";

        System.out.println(print + $variableMoney);
        System.out.println(print + _variableGuion);
        System.out.println(print + variableCommon);

    }

}
