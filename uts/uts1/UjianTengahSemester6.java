package uts.uts1;
import java.util.Scanner;
import uts.uts2.UjianTengahSemester7;

public class UjianTengahSemester6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang alas segitiga: ");
        double panjangAlas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = input.nextDouble();

        System.out.print("Masukkan tinggi limas: ");
        double tinggiLimas = input.nextDouble();

        double volumeLimas = UjianTengahSemester7.hitungVolumeLimasSegitiga(panjangAlas, tinggiSegitiga, tinggiLimas);

        System.out.println("Volume limas segitiga adalah " + volumeLimas);
    }
}
