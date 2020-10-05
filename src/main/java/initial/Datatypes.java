package initial;

public class Datatypes {

    public static void main(String[] args) {

        byte byteMaxLong3 = 127;                      //-128 hasta 127.
        short shortMaxLong5 = 12345;                         // -32,768 hasta 32,727
        int intMaxLong10 = 1234567890;                // -2,147,483,648 hasta 2,147,483,647
        long longMaxLong19 = 1234567890123456789L;    // -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807

        double doubleMaxLong = 123.1234567890;
        float floatMaxLong = 123.123456F;

        System.out.println("bits tipo byte:" + Byte.SIZE);
        System.out.println("bytes tipo byte:" + Byte.BYTES);
        System.out.println("valor minimo tipo byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte:" + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo short:" + Short.SIZE);
        System.out.println("bytes tipo short:" + Short.BYTES);
        System.out.println("valor minimo tipo short:" + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short:" + Short.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo int:" + Integer.SIZE);
        System.out.println("bytes tipo int:" + Integer.BYTES);
        System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo long:" + Long.SIZE);
        System.out.println("bytes tipo long:" + Long.BYTES);
        System.out.println("valor minimo tipo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);


        // From Java JDK 10
        //var montoInt = 123;
        //var montoDouble = montoInt*0.18;


    }
}
