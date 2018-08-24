
package javalab3;

public class DataTypesTester {
    
    public static void testByte(byte a_, byte b_) {
        byte a = a_, b = b_, c;
        System.out.println("===BYTE test===");
        System.out.println("\n*** Arithmetical Operators ***");

        //Addition
        c=(byte)(a+b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        
        //Subtraction
        c=(byte)(a-b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        
        //Multiplication
        c=(byte)(a*b);
        System.out.printf("%d * %d = %d\n", a, b, c); 
        
        //Division
        c=(byte)(a/b);
        System.out.printf("%d / %d = %d\n", a, b, c);  
        
        //Modulus
        c=(byte)(a%b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        
        a= a_;
        //Unary minus
        c=(byte)-a;
        System.out.printf("-%d = %d\n", a, c);
        
        //Unary plus
        c=(byte)+a;
        System.out.printf("+%d = %d\n", a, c);
        
        //Prefix increment
        a = a_;
        System.out.printf("++%d = %d\n", a, (byte)++a);
        
        //Postfix increment
        a = a_;
        System.out.printf("%d++ = %d\n", a, (byte)a++);
        
        //Prefix decrement
        a = a_;
        System.out.printf("--%d = %d\n", a, (byte)--a);
        
        //Postfix decrement
        a = a_;
        System.out.printf("%d-- = %d\n", a, (byte)a--);
        
        System.out.println("\n*** Bitwise Operators ***");
        a = a_;
        b = b_;
        //Bitwise AND
        c=(byte)(a&b);
        System.out.printf("\n%d & %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise OR
        c=(byte)(a|b);
        System.out.printf("\n%d | %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise XOR
        c=(byte)(a^b);
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise unary compliment
        c=(byte)~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        //Left shift
        c=(byte)(a<<1);
        System.out.printf("\n%d << 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        //Right shift
        c=(byte)(a>>1);
        System.out.printf("\n%d>> 1 = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        a = (byte)-a_;
        //Right shift
        c = (byte)(a >> 1); 
        System.out.printf("\n%d >> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >> 1));
        
        a = (byte)a_;
        //Zero fill right shift
        c = (byte)(a >>> 1); 
        System.out.printf("\n%d >>> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >>> 1));
        
        a = (byte)-a_;
        //Zero fill right shift
        c =(byte)(a >>> 1);
        System.out.printf("\n%d >>> 1 = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        System.out.println("\n*** Assignment Operators ***");
        a = (byte)a_;
        c = (byte)(a + b);
        System.out.printf("%d += %d --> c = %d\n", c, a, (byte)(c += a));
        System.out.printf("%d -= %d --> c = %d\n", c, a, (byte)(c -= a));
        System.out.printf("%d *= %d --> c = %d\n", c, a, (byte)(c *= a));
        System.out.printf("%d /= %d --> c = %d\n", c, a, (byte)(c /= a));
        System.out.printf("%d %%= %d --> c = %d\n", c, a,(byte) (c %= a));        
        System.out.printf("%d |= %d --> c = %d\n", c, a, (byte)(c |= a));
        System.out.printf("%d &= %d --> c = %d\n", c, a, (byte)(c &= a));


        System.out.println("\n*** Relational Operators ***");
        //Greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //Greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);        
        //Less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);       
        //Less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);       
        //Equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);       
        //Not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n*** Logical Operations ***");
       
        //Logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        //Bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        //Logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        //Bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        
        System.out.println("\n*** Misc Operators ***");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        short sh = -32000;
        char ch = '\u0002';
        int i = 26214;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (byte)sh;
        System.out.printf("char = short: c = %d --> c = %d\n", sh, c);
        c = (byte)ch;
        System.out.printf("char = char: c = '%c' --> c = %d\n", ch, c);
        c = (byte)i;
        System.out.printf("char = int: c = %d --> c = %d\n", i, c);
        c = (byte)l;
        System.out.printf("char = long: c = (int)%d --> c = %d\n", l, c);
        c = (byte)f;
        System.out.printf("char = float: c = (int)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("char = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("char = boolean: c = (int)%b --> Compile Error\n", bool);
        System.out.println("==================================================\n");
    }
    public static void testShort(short a_, short b_) {
        short a = a_, b = b_, c;
        System.out.println("===BYTE test===");
        System.out.println("\n*** Arithmetical Operators ***");

        //Addition
        c=(short)(a+b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        
        //Subtraction
        c=(short)(a-b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        
        //Multiplication
        c=(short)(a*b);
        System.out.printf("%d * %d = %d\n", a, b, c); 
        
        //Division
        c=(short)(a/b);
        System.out.printf("%d / %d = %d\n", a, b, c);  
        
        //Modulus
        c=(short)(a%b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        
        a= a_;
        //Unary minus
        c=(short)-a;
        System.out.printf("-%d = %d\n", a, c);
        
        //Unary plus
        c=(short)+a;
        System.out.printf("+%d = %d\n", a, c);
        
        //Prefix increment
        a = a_;
        System.out.printf("++%d = %d\n", a, (short)++a);
        
        //Postfix increment
        a = a_;
        System.out.printf("%d++ = %d\n", a, (short)a++);
        
        //Prefix decrement
        a = a_;
        System.out.printf("--%d = %d\n", a, (short)--a);
        
        //Postfix decrement
        a = a_;
        System.out.printf("%d-- = %d\n", a, (short)a--);
        
        System.out.println("\n*** Bitwise Operators ***");
        a = a_;
        b = b_;
        //Bitwise AND
        c=(short)(a&b);
        System.out.printf("\n%d & %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise OR
        c=(short)(a|b);
        System.out.printf("\n%d | %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise XOR
        c=(short)(a^b);
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise unary compliment
        c=(short)~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        //Left shift
        c=(short)(a<<1);
        System.out.printf("\n%d << 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        //Right shift
        c=(short)(a>>1);
        System.out.printf("\n%d>> 1 = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        a = (short)-a_;
        //Right shift
        c = (short)(a >> 1); 
        System.out.printf("\n%d >> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >> 1));
        
        a = (short)a_;
        //Zero fill right shift
        c = (short)(a >>> 1); 
        System.out.printf("\n%d >>> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >>> 1));
        
        a = (short)-a_;
        //Zero fill right shift
        c =(short)(a >>> 1);
        System.out.printf("\n%d >>> 1 = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        System.out.println("\n*** Assignment Operators ***");
        a = (short)a_;
        c = (short)(a + b);
        System.out.printf("%d += %d --> c = %d\n", c, a, (short)(c += a));
        System.out.printf("%d -= %d --> c = %d\n", c, a, (short)(c -= a));
        System.out.printf("%d *= %d --> c = %d\n", c, a, (short)(c *= a));
        System.out.printf("%d /= %d --> c = %d\n", c, a, (short)(c /= a));
        System.out.printf("%d %%= %d --> c = %d\n", c, a,(short) (c %= a));        
        System.out.printf("%d |= %d --> c = %d\n", c, a, (short)(c |= a));
        System.out.printf("%d &= %d --> c = %d\n", c, a, (short)(c &= a));


        System.out.println("\n*** Relational Operators ***");
        //Greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //Greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);        
        //Less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);       
        //Less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);       
        //Equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);       
        //Not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n*** Logical Operations ***");
       
        //Logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        //Bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        //Logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        //Bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        
        System.out.println("\n*** Misc Operators ***");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        char ch = '\u0002';
        int i = 26214;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (short)b;
        System.out.printf("char = short: c = %d --> c = %d\n", bt, c);
        c = (short)ch;
        System.out.printf("char = char: c = '%c' --> c = %d\n", ch, c);
        c = (short)i;
        System.out.printf("char = int: c = %d --> c = %d\n", i, c);
        c = (short)l;
        System.out.printf("char = long: c = (int)%d --> c = %d\n", l, c);
        c = (short)f;
        System.out.printf("char = float: c = (int)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("char = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("char = boolean: c = (int)%b --> Compile Error\n", bool);
        System.out.println("==================================================\n");        
        
    }
    public static void testChar(char a_, char b_) {
    char a = a_, b = b_, c;
        System.out.println("===CHAR test===");
        System.out.printf("\na=%c\n",a);
        System.out.printf("b=%c\n",b);
        System.out.println("\n*** Arithmetical Operators ***");

        //Addition
        c=(char)(a+b);
        System.out.printf("%c + %c = %c\n", a, b, c);
        
        //Subtraction
        c=(char)(a-b);
        System.out.printf("%c - %c = %c\n", a, b, c);
        
        //Multiplication
        c=(char)(a*b);
        System.out.printf("%c * %c = %c\n", a, b, c); 
        
        //Division
        c=(char)(a/b);
        System.out.printf("%c / %c = %c\n", a, b, c);  
        
        //Modulus
        c=(char)(a%b);
        System.out.printf("%c %% %c = %c\n", a, b, c);
        
        //c=a/0; --> Arithmetical Exception
        //c=a%0 --> Arithmetical Exception
        a= a_;
        //Unary minus
        c=(char)-a;
        System.out.printf("-%c = %c\n", a, c);
        
        //Unary plus
        c=(char)+a;
        System.out.printf("+%c = %c\n", a, c);
        
        //Prefix increment
        a = a_;
        System.out.printf("++%c = %c\n", a, (char)++a);
        
        //Postfix increment
        a = a_;
        System.out.printf("%c++ = %c\n", a, (char)a++);
        
        //Prefix decrement
        a = a_;
        System.out.printf("--%c = %c\n", a, (char)--a);
        
        //Postfix decrement
        a = a_;
        System.out.printf("%c-- = %c\n", a, (char)a--);
        
        System.out.println("\n*** Bitwise Operators ***");
        a = a_;
        b = b_;
        //Bitwise AND
        c=(char)(a&b);
        System.out.printf("\n%c & %c = %c\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise OR
        c=(char)(a|b);
        System.out.printf("\n%c | %c = %c\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise XOR
        c=(char)(a^b);
        System.out.printf("\n%c ^ %c = %c\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise unary compliment
        c=(char)~a;
        System.out.printf("\n~%c = %c\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        //Left shift
        c=(char)(a<<1);
        System.out.printf("\n%c << 1 = %c\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        //Right shift
        c=(char)(a>>1);
        System.out.printf("\n%c>> 1 = %c\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        a = (char)-a_;
        //Right shift
        c = (char)(a >> 1); 
        System.out.printf("\n%c >> 1 = %c\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >> 1));
        
        a = (char)a_;
        //Zero fill right shift
        c = (char)(a >>> 1); 
        System.out.printf("\n%c >>> 1 = %c\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >>> 1));
        
        a = (char)-a_;
        //Zero fill right shift
        c =(char)(a >>> 1);
        System.out.printf("\n%c >>> 1 = %c\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        System.out.println("\n*** Assignment Operators ***");
        a = (char)a_;
        c = (char)(a + b);
        System.out.printf("%c += %c --> c = %c\n", c, a, (char)(c += a));
        System.out.printf("%c -= %c --> c = %c\n", c, a, (char)(c -= a));
        System.out.printf("%c *= %c --> c = %c\n", c, a, (char)(c *= a));
        System.out.printf("%c /= %c --> c = %c\n", c, a, (char)(c /= a));
        System.out.printf("%c %%= %c --> c = %c\n", c, a,(char) (c %= a));        
        System.out.printf("%c |= %c --> c = %c\n", c, a, (char)(c |= a));
        System.out.printf("%c &= %c --> c = %c\n", c, a, (char)(c &= a));


        System.out.println("\n*** Relational Operators ***");
        //Greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        //Greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);        
        //Less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);       
        //Less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);       
        //Equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);       
        //Not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);
        
        System.out.println("\n*** Logical Operations ***");
       
        //Logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        //Bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        //Logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        //Bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical XOR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));
        
        
        System.out.println("\n*** Misc Operators ***");
        System.out.println("\nCondition Operator:");
        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int i = 26214;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (char)bt;
        System.out.printf("char = byte: c = %d --> c = %c\n", bt, c);
        c = (char)sh;
        System.out.printf("char = short: c = %d --> c = %c\n", sh, c);
        c = (char)ch;
        System.out.printf("char = char: c = '%c' --> c = %c\n", ch, c);
        c = (char)i;
        System.out.printf("char = int: c = %d --> c = %c\n", i, c);
        c = (char)l;
        System.out.printf("char = long: c = (int)%d --> c = %c\n", l, c);
        c = (char)f;
        System.out.printf("char = float: c = (int)%f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (int)%f --> c = %c\n", d, c);
        // c = (int)bool;
        System.out.printf("char = boolean: c = (int)%b --> Compile Error\n", bool);
        System.out.println("==================================================\n");
    }
    public static void testInt(int a_, int b_) {
        int a = a_, b = b_, c;
        System.out.println("===INT test===");
        System.out.printf("\na=%d\n",a);
        System.out.printf("b=%d\n",b);
        System.out.println("\n*** Arithmetical Operators ***");

        //Addition
        c=a+b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        
        //Subtraction
        c=a-b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        
        //Multiplication
        c=a*b;
        System.out.printf("%d * %d = %d\n", a, b, c); 
        
        //Division
        c=a/b;
        System.out.printf("%d / %d = %d\n", a, b, c);  
        
        //Modulus
        c=a%b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        
        //c=a/0; --> Arithmetical Exception
        //c=a%0 --> Arithmetical Exception
        a= a_;
        //Unary minus
        c=-a;
        System.out.printf("-%d = %d\n", a, c);
        
        //Unary plus
        c=+a;
        System.out.printf("+%d = %d\n", a, c);
        
        //Prefix increment
        a = a_;
        System.out.printf("++%d = %d\n", a, ++a);
        
        //Postfix increment
        a = a_;
        System.out.printf("%d++ = %d\n", a, a++);
        
        //Prefix decrement
        a = a_;
        System.out.printf("--%d = %d\n", a, --a);
        
        //Postfix decrement
        a = a_;
        System.out.printf("%d-- = %d\n", a, a--);
        
        System.out.println("\n*** Bitwise Operators ***");
        a = a_;
        b = b_;
        //Bitwise AND
        c=a&b;
        System.out.printf("\n%d & %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise OR
        c=a|b;
        System.out.printf("\n%d | %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise XOR
        c=a^b;
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(b), Integer.toBinaryString(c));
        
        //Bitwise unary compliment
        c=~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        //Left shift
        c=a<<1;
        System.out.printf("\n%d << 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        //Right shift
        c=a>>1;
        System.out.printf("\n%d >> 1 = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        a = -a_;
        //Right shift
        c = a >> 1; 
        System.out.printf("\n%d >> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >> 1));
        
        a = a_;
        //Zero fill right shift
        c = a >>> 1; 
        System.out.printf("\n%d >>> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(a >>> 1));
        
        a = -a_;
        //Zero fill right shift
        c = a >>> 1;
        System.out.printf("\n%d >>> 1 = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
        Integer.toBinaryString(c));
        
        System.out.println("\n*** Assignment Operators ***");
        a = a_;
        c = a + b;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception        
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n*** Relational Operators ***");
        //Greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //Greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);        
        //Less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);       
        //Less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);       
        //Equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);       
        //Not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n*** Logical Operations ***");
       
        //Logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        //Bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        //Logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        //Bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        
        
        System.out.println("\n*** Misc Operators ***");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (int)bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = (int)sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = (int)ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
        System.out.println("=============================================\n");
    }
    public static void testLong(long a_, long b_) {
        long a = a_, b = b_, c;
        System.out.println("===LONG test===");

        System.out.println("\n*** Arithmetical Operators ***");

        //Addition
        c=a+b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        
        //Subtraction
        c=a-b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        
        //Multiplication
        c=a*b;
        System.out.printf("%d * %d = %d\n", a, b, c); 
        
        //Division
        c=a/b;
        System.out.printf("%d / %d = %d\n", a, b, c);  
        
        //Modulus
        c=a%b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        
        a= a_;
        //Unary minus
        c=-a;
        System.out.printf("-%d = %d\n", a, c);
        
        //Unary plus
        c=+a;
        System.out.printf("+%d = %d\n", a, c);
        
        //Prefix increment
        a = a_;
        System.out.printf("++%d = %d\n", a, ++a);
        
        //Postfix increment
        a = a_;
        System.out.printf("%d++ = %d\n", a, a++);
        
        //Prefix decrement
        a = a_;
        System.out.printf("--%d = %d\n", a, --a);
        
        //Postfix decrement
        a = a_;
        System.out.printf("%d-- = %d\n", a, a--);
        
        System.out.println("\n*** Bitwise Operators ***");
        a = a_;
        b = b_;
        //Bitwise AND
        c=a&b;
        System.out.printf("\n%d & %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(b), Long.toBinaryString(c));
        
        //Bitwise OR
        c=a|b;
        System.out.printf("\n%d | %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(b), Long.toBinaryString(c));
        
        //Bitwise XOR
        c=a^b;
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.println("In binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(b), Long.toBinaryString(c));
        
        //Bitwise unary compliment
        c=~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(c));
        
        //Left shift
        c=a<<1;
        System.out.printf("\n%d << 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(c));
        
        //Right shift
        c=a>>1;
        System.out.printf("\n%d >> 1 = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(c));
        
        a = -a_;
        //Right shift
        c = a >> 1; 
        System.out.printf("\n%d >> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(a >> 1));
        
        a = a_;
        //Zero fill right shift
        c = a >>> 1; 
        System.out.printf("\n%d >>> 1 = %d\n", a, c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(a >>> 1));
        
        a = -a_;
        //Zero fill right shift
        c = a >>> 1;
        System.out.printf("\n%d >>> 1 = %d\n", a,c);
        System.out.println("In binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
        Long.toBinaryString(c));
        
        System.out.println("\n*** Assignment Operators ***");
        a = a_;
        c = a + b;
        System.out.printf("%d+= %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n*** Relational Operators ***");
        //Greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        //Greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);        
        //Less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);       
        //Less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);       
        //Equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);       
        //Not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n*** Logical Operations ***");
       
        //Logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        //Bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        //Logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        //Bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        
        
        System.out.println("\n*** Misc Operators ***");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int i = 26214;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = i;
        System.out.printf("long = int: c = (long)%d --> c = %d\n", i, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        // c = (long)bool;
        System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);
        System.out.println("=============================================\n");
    }
    public static void testFloat(float a_, float b_) {
        float a = a_, b = b_, c;
        System.out.println("===FLOAT test===");

        System.out.println("\n*** Arithmetical Operators ***");

        //Addition
        c=a+b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        
        //Subtraction
        c=a-b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        
        //Multiplication
        c=a*b;
        System.out.printf("%f * %f = %f\n", a, b, c); 
        
        //Division
        c=a/b;
        System.out.printf("%f / %f = %f\n", a, b, c);  
        
        //Modulus
        c=a%b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        
        a= a_;
        //Unary minus
        c=-a;
        System.out.printf("-%f = %f\n", a, c);
        
        //Unary plus
        c=+a;
        System.out.printf("+%f = %f\n", a, c);
        
        //Prefix increment
        a = a_;
        System.out.printf("++%f = %f\n", a, ++a);
        
        //Postfix increment
        a = a_;
        System.out.printf("%f++ = %f\n", a, a++);
        
        //Prefix decrement
        a = a_;
        System.out.printf("--%f = %f\n", a, --a);
        
        //Postfix decrement
        a = a_;
        System.out.printf("%f-- = %f\n", a, a--);
        
        System.out.println("\n*** Bitwise Operators ***");
        
        System.out.println("Bitwise operators cannot be performed!");
        
        System.out.println("\n*** Assignment Operators ***");
        a = a_;
        c = a + b;
        System.out.printf("%f+= %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f-= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f*= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f/= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        System.out.println("\n*** Relational Operators ***");
        //Greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        //Greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);        
        //Less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);       
        //Less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);       
        //Equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);       
        //Not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        
        System.out.println("\n*** Logical Operations ***");
       
        //Logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        //Bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        //Logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        //Bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
        
        
        System.out.println("\n*** Misc Operators ***");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int i = 26214;
        long l = 100000000000000000L;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %f\n", ch, c);
        c = i;
        System.out.printf("long = int: c = (float)%d --> c = %f\n", i, c);
        c = l;
        System.out.printf("long = long: c = (float)%d --> c = %f\n", l, c);
        c = (float) d;
        System.out.printf("long = double: c = (float)%f --> c = %f\n", d, c);
        // c = (long)bool;
        System.out.printf("long = boolean: c = (float)%b --> Compile Error\n", bool);
        System.out.println("=============================================\n");
    }
    public static void testDouble(double a_, double b_) {
        double a = a_, b = b_, c;
        System.out.println("===DOUBLE test===");

        System.out.println("\n*** Arithmetical Operators ***");

        //Addition
        c=a+b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        
        //Subtraction
        c=a-b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        
        //Multiplication
        c=a*b;
        System.out.printf("%f * %f = %f\n", a, b, c); 
        
        //Division
        c=a/b;
        System.out.printf("%f / %f = %f\n", a, b, c);  
        
        //Modulus
        c=a%b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        
        a= a_;
        //Unary minus
        c=-a;
        System.out.printf("-%f = %f\n", a, c);
        
        //Unary plus
        c=+a;
        System.out.printf("+%f = %f\n", a, c);
        
        //Prefix increment
        a = a_;
        System.out.printf("++%f = %f\n", a, ++a);
        
        //Postfix increment
        a = a_;
        System.out.printf("%f++ = %f\n", a, a++);
        
        //Prefix decrement
        a = a_;
        System.out.printf("--%f = %f\n", a, --a);
        
        //Postfix decrement
        a = a_;
        System.out.printf("%f-- = %f\n", a, a--);
        
        System.out.println("\n*** Bitwise Operators ***");
        
        System.out.println("Bitwise operators cannot be performed!");
        
        System.out.println("\n*** Assignment Operators ***");
        a = a_;
        c = a + b;
        System.out.printf("%f+= %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f-= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f*= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f/= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        System.out.println("\n*** Relational Operators ***");
        //Greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        //Greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);        
        //Less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);       
        //Less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);       
        //Equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);       
        //Not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        
        System.out.println("\n*** Logical Operations ***");
       
        //Logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        //Bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        //Logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        //Bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        //Logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));
        
        
        System.out.println("\n*** Misc Operators ***");
        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int i = 26214;
        long l = 100000000000000000L;
        float f = 1.9f;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %f\n", ch, c);
        c = i;
        System.out.printf("long = int: c = (float)%d --> c = %f\n", i, c);
        c = l;
        System.out.printf("long = long: c = (float)%d --> c = %f\n", l, c);
        c = (double)f;
        System.out.printf("long = double: c = (float)%f --> c = %f\n", f, c);
        // c = (long)bool;
        System.out.printf("long = boolean: c = (float)%b --> Compile Error\n", bool);
        System.out.println("=============================================\n");
    }
    
    public static void testBoolean(boolean a_,boolean b_) {
        boolean a = a_, b = b_, c;
        System.out.println("===BOOLEAN test===");
        System.out.println("\n*** Arithmetical Operators ***");
        System.out.println("Arithmetical operations cannot be performed!");
        System.out.println("\n*** Bitwise Operators ***");
       
        //Bitwise AND
        c=a&b;
        System.out.printf("\n%b & %b = %b\n", a, b, c);
     
        //Bitwise OR
        c=a|b;
        System.out.printf("\n%b | %b = %b\n", a, b, c);
     
        
        //Bitwise XOR
        c=a^b;
        System.out.printf("\n%b ^ %b = %b\n", a, b, c);


        
        System.out.println("\n*** Assignment Operators ***");
    
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
  
        System.out.println("\n*** Relational Operators ***");
     
        //Equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);       
        //Not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);
        
        System.out.println("\n*** Logical Operations ***");
       
        //Logical AND
        System.out.printf("%b && %b = %b\n", a, b, a && b);
        //Logical OR
        System.out.printf("%b || %b = %b\n", a, b, a || b);
        //Logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, a ^ b);
        //Logical NOT
        System.out.printf("!%b --> %b\n", a, !a);
        
        
        System.out.println("\n*** Misc Operators ***");
        System.out.println("\nCondition Operator:");
        System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
        System.out.println("\nType Cast Operator:");
        System.out.println("any type = boolean: c = (any type)%b --> Compile Error\n");
        System.out.println("================================================\n");
    }
    public static void testString(String a_, String b_) {
        String a=a_, b=b_, c;
        System.out.println("===STRING test===");
        //A+B Concatecatiom
        c = a + b;
        System.out.printf("Concatenation : %s + %s = %s\n", a, b, c); 
        //A+=B Concatecation
        c = a += b;
        System.out.printf("Concatenation : %s += %s = %s\n", a, b, c); 
        a=a_;
        System.out.printf("Comparison %s and %s --> %b\n",a,b, a.equals(b)); 
        System.out.println("\nType Cast Operator:"); 
        byte bt = 1; 
        short sh = -32000; 
        char ch = 'A';
        int i=32767;
        long l = 100000000000000000L;
        float f = 1.9f; 
        double d = 123456789.625; 
        boolean bool = true;

        c = String.valueOf(bt);
        System.out.printf("string = byte: c = %d --> c = %s\n", bt, c);
        c = String.valueOf(sh);
        System.out.printf("string = short: c = %d --> c = %s\n", sh, c);  
        c = String.valueOf(ch);
        System.out.printf("string = char: c = %c --> c = %s\n", ch, c);
        c = String.valueOf(i);
        System.out.printf("string = int: c = %d --> c = %s\n", i, c);  
        c = String.valueOf(l);
        System.out.printf("string = long: c = %d --> c = %s\n", l, c);  
        c = String.valueOf(f);
        System.out.printf("string = float: c = %f --> c = %s\n", f, c);
        c = String.valueOf(d);
        System.out.printf("string = double: c = %f --> c = %s\n", d, c);
        c = String.valueOf(bool);
        System.out.printf("string = boolean: c = %b --> c = %s\n", bool, c);

        System.out.println("========================================\n");
    }
    
        public static void testPhone(Phone ph1, Phone ph2) {
        System.out.println("===PHONE test===");
        System.out.println("List: ");
        ph1.outputData();
        ph2.outputData();
        System.out.println();
        System.out.println("Ascending sorting by price: ");
        Phone.sortPrices(ph1, ph2);
        System.out.println("====================================\n");
    }
}
