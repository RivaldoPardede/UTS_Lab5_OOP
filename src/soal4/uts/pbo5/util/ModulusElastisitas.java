package soal4.uts.pbo5.util;

/*
* Modulus elastisitas atau Young's modulus (E) adalah ukuran dari kekakuan material, dan dapat dihitung menggunakan rumus:

𝐸 = (F*Lo)/(A*deltaL)
atau
E = (Stress/Strain)

keterangan:
F = gaya pegas
Lo = Panjang Mula-mula
A = Luas penampang
deltaL = Pertambahan Panjang

F dapat dicari dengan F = k * x
keterangan:
k = konstanta pegas
x = simpangan pada pegas
*
Source: https://www.slideshare.net/slideshow/kumpulan-rumusfisika/15049601*/
public class ModulusElastisitas {
    private static final double k = 100.0; //konstanta pegas
    private double x; //simpangan pegas
    private double A; //luas penampang yang tegak lurus gaya F
    private double Lo; //panjang mula-mula
    private double deltaL; //pertambahan panjang,

    public double getK() { return k; }
    public double getX() { return x; }
    public double getA() { return A; }
    public double getLo() { return Lo; }
    public double getDeltaL() { return deltaL; }

    public ModulusElastisitas(double x, double A, double Lo, double deltaL) {
        if (x <= 0 || A <= 0 || Lo <= 0 || deltaL <= 0) {
            throw new IllegalArgumentException("Nilai inputan harus positif ( > 0 )");
        }
        this.x = x;
        this.A = A;
        this.Lo = Lo;
        this.deltaL = deltaL;
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
