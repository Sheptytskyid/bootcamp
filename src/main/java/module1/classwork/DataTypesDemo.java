package module1.classwork;

public class DataTypesDemo {

    //Basic data types
    //Numeric data types
    //Integers
    byte byteNumber; //-127 .. +127

    short shortNumber; //-32 768 .. 32 767

    int intNumber; //−2 147 483 648 .. 2 147 483 647

    long longNumber; //-9 223 372 036 854 775 808 .. +9 223 372 036 854 755 807

    //real numbers
    float floatNumber; //-3.40282346638528860e+38 .. +3.40282346638528860e+38

    double doubleNumber; //-1.79769313486231570e+308d .. +1.79769313486231570e+308d

    //char
    char charValue; //0 .. 65 535
    //Text
    String text;

    void funWithDatatypes() {
        byteNumber = 127;
        shortNumber = 150;
        intNumber = byteNumber + shortNumber;
        byteNumber = (byte) (intNumber - shortNumber);
        longNumber = intNumber * 2;
        floatNumber = intNumber / 3;
        doubleNumber = 2.43;
        charValue = 'A';
        char charValue2 = (char) (charValue + 2);
        charValue = (char) (charValue2 * 2);
        int intValueOfChar = charValue;
        text = "this is a ";
        text = text + " text";
        String otherText = text + " and a number " + byteNumber + shortNumber; //"this is a text and a number 277"
    }
}
