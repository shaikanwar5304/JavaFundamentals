// about data types and how it circulates when it exceeds the limit
public class H_ByteDataType {
    public static void main(String[] args) {
        byte b= 127;
        //byte b2= 128;//Error as maximum limit is -128 to 127
        System.out.println(b);
        b += 1;
        System.out.println(b);// -128 the value wraps around (circles back to the minimum value)
    }
}
//BYTE => 8 BITS -> 2^8 -> 256 VALUES (-128 to 127)
//CHAR => 16 BITS -> 2 BYTES -> 2^16 -> 65536 VALUES (0 to 65535)
//INT => 32 BITS -> 4 BYTES -> 2^32 VALUES (-2^31 to 2^31-1)
//FLOAT => 32 BITS -> 4 BYTES -> 2^32 VALUES 
//LONG => 64 BITS -> 8 BYTES -> 2^64 VALUES (-2^63 to 2^63-1)
//DOUBLE => 64 BITS -> 8 BYTES -> 2^64 VALUES 