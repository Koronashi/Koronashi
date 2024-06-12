public class BitDecimalConverter {
  public static void main(String[] args) {
    System.out.println(Heca.decimalTobinary(33));
    System.out.println(Heca.binaryTodecimal("00100011"));
  }
}


class Heca {
  public static String decimalTobinary(int userInput) {
    //initialize the variable =>
    int bit = 256; //Max-Range of 8 bit (Unsigned Value)
    int local = 0;
    String binary_result = "";
    
    //bit - 1 for loop =>
    for (int i=7;i>=0;i--) {
      bit = bit/2; //reduced bit by dividing by 2.
      local = bit+local;
      
      if (userInput>=bit && local<=userInput) {
        binary_result = binary_result + "1";
      } else {
        if (userInput==local) {
          //if the local meet the requirements of value.
          binary_result = binary_result + "0";
        } else {
          //if the local not meet the requirements of value.
          binary_result = binary_result + "0";
          local = local-bit;
        }
      }
    }
    return binary_result;
  }
  public static int binaryTodecimal(String userInput) {
    int decimal_result = 0;
    int local_dec = userInput.length() - 1;
    //loop
    for (int i = 0; i<userInput.length(); i++) {
      if (userInput.charAt(i) == '1'){
        decimal_result = (int)Math.pow(2,local_dec) + decimal_result;
      }
      local_dec--;
    }
    return decimal_result;
  }
}