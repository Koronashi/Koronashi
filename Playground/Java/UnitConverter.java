public class UnitConverter {
  public static void main(String[] args) {
    LengthConverter conv = new LengthConverter("KilometerToMeter");
    System.out.println(conv.LengthConversion(1));
  }
}

//Length Conversion
class LengthConverter {
  private static String heca;
  LengthConverter(String measurements) {
    heca = measurements;
  }
  
  public double LengthConversion(double value) {
    double answ = 0;
    switch (heca) {
      case "KilometerToMeter":
        answ = value * 1000;
      break;
      case "MeterToCentimeter":
        answ = value * 100;
      break;
      case "CentimeterToMillimeter":
        answ = value * 10;
      break;
      case "MillimeterToCentimeter":
        answ = value / 10;
      break;
      case "CentimeterToMeter":
        answ = value / 100;
      break;
      case "MeterKilometer":
        answ = value / 1000;
      break;
    }
    return answ;
  }
}