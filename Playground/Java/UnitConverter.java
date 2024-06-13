public class UnitConverter {
  public static void main(String[] args) {
    LengthConverter conv = new LengthConverter("KilometerToMeter");
    System.out.println(conv.LengthConversion(1));
  }
}

//Length Conversion
class LengthConverter {
  private static String heca;
  LengthConverter(String lengMeasurements) {
    heca = lengMeasurements;
  }
  
  public double LengthConversion(double value) {
    double lengAnsw = 0;
    switch (heca) {
      case "KilometerToMeter":
        lengAnsw = value * 1000;
      break;
      case "MeterToCentimeter":
        lengAnsw = value * 100;
      break;
      case "CentimeterToMillimeter":
        lengAnsw = value * 10;
      break;
      case "MillimeterToCentimeter":
        lengAnsw = value / 10;
      break;
      case "CentimeterToMeter":
        lengAnsw = value / 100;
      break;
      case "MeterKilometer":
        lengAnsw = value / 1000;
      break;
    }
    return lengAnsw;
  }
}
class TemperatureConverter {
  private static String heca;
  TemperatureConverter(String tempmeasurements) {
    heca = tempmeasurements;
  }
  
  public double LengthConversion(double value) {
    double tempAnsw = 0;
  }
}