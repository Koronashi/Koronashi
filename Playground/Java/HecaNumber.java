import java.util.ArrayList;
import java.util.Scanner;
public class HecaNumber {
  public static void main(String[] args) {
    //Debugging
    System.out.print("Compile Successful: ");
    Scanner scan = new Scanner(System.in);
    About_Number md = new About_Number(scan.nextInt());
    System.out.println(md.Croman());
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
  
  String Croman() {
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