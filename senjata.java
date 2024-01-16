
package game3;


public class senjata {

    private String jenisSenjata;
    private String namaSenjata;
    private int amunisi;
    private double berat;
    private String warna;

    public senjata(String jenisSenjata, String namaSenjata, int amunisi, double berat, String warna) {
        this.jenisSenjata = jenisSenjata;
        this.namaSenjata = namaSenjata;
        this.amunisi = amunisi;
        this.berat = berat;
        this.warna = warna;
    }

    public String getNamaSenjata() {
        return namaSenjata;
    }

    public void tembak() {
        System.out.println("Menembak " + jenisSenjata + " - " + namaSenjata + "!");
    }

    public void lempar() {
        System.out.println("Melempar " + jenisSenjata + " - " + namaSenjata + "!");
    }

    public void reload() {
        System.out.println("Mengisi ulang amunisi " + jenisSenjata + " - " + namaSenjata + ".");
    }
}