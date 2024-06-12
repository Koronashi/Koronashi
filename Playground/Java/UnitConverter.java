public class UnitConverter {
  public static void main(String[] args) {
    System.out.println(Length.meterTomile(2));
  }
}

class Length {
  public static double meterTomile(double m) {
    double a = m * 0.0006214;
    return a;
  }
}