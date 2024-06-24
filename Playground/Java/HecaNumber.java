import java.util.ArrayList;
import java.util.Scanner;
public class HecaNumber {
  public static void main(String[] args) {
    //Debugging
    System.out.print("Compile Successful: ");
    Scanner scan = new Scanner(System.in);
    About_Number md = new About_Number(scan.nextInt());
    System.out.println(md.CEnglish());
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
  public static int indexTo(int number, int index_To) {
    double i = (number/Math.pow(10,index_To)) % 10;
    double j = i / Math.pow(10, -index_To);
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
  
  String CEnglish() {
    String lib_text1[] = {"zero","one", "two", "three", "four", "five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    String lib_text2[] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    String place_value[] = {"hundred","thousand"};
    String eng = "";
    int a;
    
    switch (String.valueOf(this.number).length()) {
      case 1:
        eng = lib_text1[this.number];
      break;
      case 2:
        if (this.number<20) {
          eng = lib_text1[this.number];
        } else if (this.number == 20) {
          eng = lib_text1[20];
        } else {
          a = About_Number.indexAt(this.number, 1);
          eng = lib_text2[a - 2];
          a = About_Number.indexAt(this.number, 0);
          eng = eng + lib_text1[a];
        }
      break;
      case 3:
        a = About_Number.indexAt(this.number, 2);
        eng = lib_text1[a] + " " + place_value[0] + " ";
        if (!(About_Number.indexAt(this.number, 1) == 0 || About_Number.indexAt(this.number, 0) == 0))
        if (About_Number.indexTo(this.number, 1)<=10) {
          a = About_Number.indexAt(this.number, 1);
          eng = eng + lib_text1[a];
        } else if (About_Number.indexTo(this.number, 1)<20) {
          a = About_Number.indexTo(this.number, 1);
          eng = eng + lib_text1[a];
        } else {
          a = About_Number.indexAt(this.number, 1);
          eng = eng + lib_text2[a - 2];
          a = About_Number.indexAt(this.number, 0);
          eng = eng + lib_text1[a];
        }
      break;
    }
    return eng;
  }
}