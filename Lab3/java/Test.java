
package javalab3;

public class Test {
   
    public static void main(String[] args) {
        Phone ph1 = new Phone("Samsung Galaxy S9", 799.0f);
        Phone ph2 = new Phone("iPhone SE",499.0f);
        DataTypesTester.testByte((byte)39,(byte)16);
        DataTypesTester.testShort((short)134,(short)751);
        DataTypesTester.testChar('A','B');
        DataTypesTester.testInt(20, 50);
        DataTypesTester.testLong(32656679,4381389);
        DataTypesTester.testFloat(9.67e+4f,6.65e-3f);
        DataTypesTester.testDouble(3.62e+61,4.70e+83);
        DataTypesTester.testBoolean(true, false);
        DataTypesTester.testString("London is the capital ","of Great Britain");
        DataTypesTester.testPhone(ph1,ph2);
    }    
}
