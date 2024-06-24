import java.util.ArrayList;
public class HecaNumber {
  public static void main(String[] args) {
    About_Number perfectnum = new About_Number(6);
    //Testing for Perfect Number
    System.out.println(perfectnum.perfect_number()? "Perfect Number" : "Not Perfect Number");
    //Testing for proper_divisors
    ArrayList<Integer> _enum = new ArrayList<Integer>(perfectnum.proper_divisors());
    for (int i = 0; i<_enum.size(); i++) {
      System.out.println(_enum.get(i));
    }
  }
}


class About_Number {
  int number;
  About_Number(int num) {
    this.number = num;
  }
  
  boolean perfect_number() {
    int a = 0;
    for (int i = this.number; i>0; i--) {
      if (this.number != i && this.number % i == 0) {
        a = a + i;
      }
    }
    return (a == this.number)? true : false;
  }
  
  ArrayList<Integer> proper_divisors() {
    ArrayList<Integer> _n = new ArrayList<Integer>();
    for (int i = this.number; i>0; i--) {
      if (this.number != i && this.number % i == 0) {
        _n.add(i);
      }
    }
    return _n;
  }
  
}