package uts;
public class UjianTengahSemester5 {
  double sisi; 
  
  public UjianTengahSemester5(double sisi) {
      this.sisi = sisi;
  }

  public void Kubus(double sisi) {
      this.sisi = sisi;
  }
  
  public double hitungVolume() {
      return sisi * sisi * sisi;
  }
  
  public static void main(String[] args) {
      UjianTengahSemester5 kubus1 = new UjianTengahSemester5(5);
      System.out.println("Volume Kubus = " + kubus1.hitungVolume());
  }
}
