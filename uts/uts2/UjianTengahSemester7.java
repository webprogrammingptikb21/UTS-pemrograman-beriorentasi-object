package uts.uts2;

public class UjianTengahSemester7 {

    public static double hitungLuasAlasSegitiga(double panjangAlas, double tinggiSegitiga) {
        return 0.5 * panjangAlas * tinggiSegitiga;
    }

    public static double hitungVolumeLimasSegitiga(double panjangAlas, double tinggiSegitiga, double tinggiLimas) {
        double luasAlas = hitungLuasAlasSegitiga(panjangAlas, tinggiSegitiga);
        return (1.0/3.0) * luasAlas * tinggiLimas;
    }
}
