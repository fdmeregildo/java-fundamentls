package initial;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperatorIncrementDecrement {

    @Test
    public void incrementOperator(){

        int lives = 5;
        lives = 5 + 1;  //Subtraction Operator
        System.out.println(lives);
        assertEquals(6, lives);

        lives++;        //Simple Increment Operator
        System.out.println(lives);
        assertEquals(7, lives);

    }

    @Test
    public void incrementPostFix(){

        int lives = 5;
        int eternity = 100 + lives++; //Se realiza la suma luego incrementa 'lives' + 1
        System.out.println(eternity);

        assertEquals(105, eternity);
        assertEquals(6, lives);
    }

    @Test
    public void incrementPreFix(){

        int lives = 5;
        int eternity = 100 + ++lives; //Se incrementa 'lives' + 1 y luego se realiza la suma
        System.out.println(eternity);

        assertEquals(106, eternity);
        assertEquals(6, lives);
    }

    @Test
    public void decrementOperator(){

        int lives = 5;
        lives = 5 - 1;  //Subtraction Operator
        System.out.println(lives);
        assertEquals(4, lives);

        lives--;        //Simple Decrement Operator
        System.out.println(lives);
        assertEquals(3, lives);

    }

    @Test
    public void decrementPostFix(){

        int lives = 5;
        int almostEternity = 100 + lives--; //Se realiza la suma y luego se decrementa 'lives' -1
        System.out.println(almostEternity);

        assertEquals(105 , almostEternity);
        assertEquals(4 , lives);
    }

    @Test
    public void decrementPreFix(){

        int lives = 5;
        int almostEternity = 100 + --lives; //Se decrementa 'lives' -1 y luego se realiza la suma
        System.out.println(almostEternity);

        assertEquals(104 , almostEternity);
        assertEquals(4 , lives);

    }

}
