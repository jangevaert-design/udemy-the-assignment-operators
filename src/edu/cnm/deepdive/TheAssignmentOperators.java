package edu.cnm.deepdive;

public class TheAssignmentOperators {

  public static void main(String[] args) {
    //int x = 1.0; does not compile
    //short y = 1234567889; too large
    //int z = 9f; cannot assign a float to an int
    //long t = 12345678909876; integer number too large

    //Solutions:
    int x = (int)1.0;
    short y = (short)1234567889;
    int z = (int)9f;
    //long t = (long)12345678909876; still integer is too large
    long t = 12345678909876L;

    System.out.println("x = " + x + ", y = " + y + ",z = " + z + " and t = " + t);
    //y is giving an overflow. Java wraps around.

    //overflow and underflow with byte (-128 to 127)
    byte myByte = 127;
    byte mySecondByte = -128;
    System.out.println("myByte = " + myByte + " and mySecondByte = " + mySecondByte);

    //myByte = myByte + 1; this does not compile because the myBite on the rightward side is automatically
    //promoted to int while the one on the left side is still a Byte.
    myByte++;//overflows to -128
    mySecondByte--;//underflows to 127
    System.out.println("myByte = " + myByte + " and mySecondByte = " + mySecondByte);

    short a = 10;
    short b = 20;
    //short c = a * b; Java auto promotes the two shorts a and b to two ints while the left side needs
    // a short.
    short c = (short)((a * b));
    System.out.println("c = " + c);
  }

}
