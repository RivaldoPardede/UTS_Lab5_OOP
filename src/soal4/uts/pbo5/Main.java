package soal4.uts.pbo5;

import soal4.uts.pbo5.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Material 1");
        ModulusElastisitas material1 = new ModulusElastisitas(0.01, 10.0, 2.0, 5.3);
        System.out.println("Konstanta Pegas = " + material1.getK() + " N/m");
        System.out.println("Simpangan pegas = " + material1.getX() + " m");
        System.out.println("Luas Penampang = " + material1.getA() + " m^2");
        System.out.println("Panjang Awal = " + material1.getLo() + " m");
        System.out.println("Pertambahan Panjang = " + material1.getDeltaL() + " m");
        System.out.println("Modulus Elastisitas Material 1 (Cara 1) = " + material1.hitungModulus()+ " N/m^2");

        double stress = 100000.0;
        double strain = 0.002;

        System.out.println("\nStress = " + stress + " Pa");
        System.out.println("Strain = " + strain);
        double modulus2 = material1.hitungModulus(stress, strain);
        System.out.println("Modulus Elastisitas Material 1 (Cara 2) = " + modulus2 + " N/m^2");
    }
}
