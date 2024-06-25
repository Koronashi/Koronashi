import java.util.ArrayList;
import java.util.Scanner;
public class HecaNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //Test
    System.out.println("Compile Successful: ");
    for (int i = 0; i<=10; i++) {
      About_Number md = new About_Number(i);
      System.out.println(md.CRoman());
    }
  }
}


class About_Number {
  int number;
  About_Number(int num) {
    this.number = num;
  }
  private static int indexAt(int number, int index) {
    return (int)(number/Math.pow(10,index)) % 10;
  }
  private static int indexTo(int number, int index_To) {
    double i = (number/Math.pow(10,index_To)) % 10;
    double j = Math.round(i / Math.pow(10, -index_To));
    return (int)j;
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
  
  boolean even() {
    return (this.number % 2 == 0)? true:false;
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
  
  String CRoman() {
    String romanCharacter[] = {"M","D","C","L","X","IX","V","IV","I"};
    int romanCvalue[] = {1000,500,100,50,10,9,5,4,1};
    int arrIndex = 0, insideValue = 0;
    String _results = "";
    while (insideValue != this.number && arrIndex<romanCharacter.length) {
      if (this.number>=romanCvalue[arrIndex] && (insideValue + romanCvalue[arrIndex])<=this.number) {
        _results = _results + romanCharacter[arrIndex];
        insideValue = insideValue + romanCvalue[arrIndex];
      }
      if ((insideValue + romanCvalue[arrIndex]) > this.number) {
        arrIndex++;
      }
    }
    return _results;
  }
}