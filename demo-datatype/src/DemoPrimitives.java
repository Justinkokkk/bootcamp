public class DemoPrimitives {
  public static void main(String[] args) {
    int x = 3;
    int y = 3;
    int a = 4;
    int b = 4;
    int total = (x+ y-a)*b/a%1;
    
    
    System.out.println(total);
    //2024.0.5.10
    double d1 = 10.3;
    double d2 = 10.4;
    //double -> +-*/ will have issue in some scenario
    //ie. double 0.1 + 0.2 = 0.3000000000000004
    //int + double -->double + double,
    //so double value can be stored in an int variable
    //ie. int f3= double + double (read right first), 2 sum of double = double and cannot be stored in int.

    // primitive : char
    char c1 = '!'; //single quote to declare a char value;
    char c2 = ' '; // space value
    //char c3 = ''; error, char must contain a single character
    
    // primitive : String value need double quote " "
    
    // primitive : boolean 

    // primitive for Integer
    // int, long , byte, short
    //byte can only store the integer with range of the value between -128 and 127
    //byte y4 = 128; compile error (java can identify the syntax error)

    //short -32768 to 32767
    //int -2147483648 to 2147483647
    //long l1 = -9123123123123123. // cannot without . 
    //long l2 = 9123123123123123L // L means a way to specify this value is a long value

    //primitive for 小數
    // double and float 
    // 1. 10.2 is a double value
    // 2. you cannot assign a doblue value to float variable, because float is with lower level of data type
    // 3. in short, higher level of data value cannot be convert to lower level data type
    //ie. 10.2f is a float value with f to specific it as a float value.
    double dd1 = 12.3f + 12.3f;

    //local variable
    double dd2; // variable declaration (without value)
    dd2 = 1.2; // value assignment
    double dd3 = 1.2; // declaration and assignment
    dd3=1.4; //re-assignment
    
    
  }
}