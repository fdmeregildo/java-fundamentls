package initial;

import org.junit.Test;
import static org.junit.Assert.*;

public class OperatorAssignation {

    @Test
    public  void assignationAddtion(){

        int base = 100;
        base+=5; //Assignation Operator
        System.out.println(base);

        assertEquals(105, base);
    }

    @Test
    public void assignationSubtraction(){

        int base = 100;
        base-=5; //Assignation Operator
        System.out.println(base);

        assertEquals(95, base);
    }

    @Test
    public void assignationMultiply(){

        int base = 100;
        base*=5; //Assignation Operator
        System.out.println(base);

        assertEquals(500, base);
    }

    @Test
    public void assignationDivision(){

        int base = 100;
        base/=5; //Assignation Operator
        System.out.println(base);

        assertEquals(20, base);
    }

}
