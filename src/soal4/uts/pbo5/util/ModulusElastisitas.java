package soal4.uts.pbo5.util;

public class ModulusElastisitas {
    private static final double k = 100.0; //konstanta pegas
    private double x; //simpangan pegas
    private double A; //luas penampang yang tegak lurus gaya F
    private double Lo; //panjang mula-mula
    private double deltaL; //pertambahan panjang,
    private double stress;
    private double strain;

    public double getX() { return x; }
    public double getA() { return A; }
    public double Lo() { return Lo; }
    public double getDeltaL() { return deltaL; }
    public double getStress() { return stress; }
    public double getStrain() { return strain; }

    public ModulusElastisitas(double x, double A, double Lo, double deltaL) {
        if (x <= 0 || A <= 0 || Lo <= 0 || deltaL <= 0) {
            throw new IllegalArgumentException("Nilai inputan harus positif ( > 0 )");
        }
        this.x = x;
        this.A = A;
        this.Lo = Lo;
        this.deltaL = deltaL;
    }

    public ModulusElastisitas(double stress, double strain) {
        if (strain <= 0) {
            throw new IllegalArgumentException("Strain harus positif");
        }
        this.stress = stress;
        this.strain = strain;
    }

    public double gayaPegas(double x) {
        return k * x;
    }

    public double hitungModulus() {
        double F = gayaPegas(x);
        return  (F * Lo) / (A * deltaL);
    }

    public double hitungModulus(double stress, double strain) {
        return stress/strain;
    }
}
