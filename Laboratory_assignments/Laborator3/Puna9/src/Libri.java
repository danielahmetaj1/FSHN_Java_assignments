/*1. Krijoni klasën Libri që përmban informacion rreth autorit, titullit, isbn-së, numrit të
faqeve, llojit dhe çmimit të një libri.
a) Krijoni klasën LibriTest_gui që përmban një menu ku nëse shtypet një numër i caktuar
kryen veprimet si më poshtë:
Shtyp 1 për të shfaqur të gjithë librat që ndodhen në listë
Shtyp 2 për të kërkuar një libër në listë
Shtyp 3 për të shtuar një libër në listë
Shtyp 4 për të hequr një libër nga lista
Shtyp 0 për të dalë nga programi
Në varësi të numrit të shtypur nga përdoruesi kryeni veprimet përkatëse.
b) Zgjidhni ushtrimin duke ndërvepruar me përdoruesin përmes ndërfaqes.*/
public class Libri {
    private String autori;
    private String titulli;
    private String isbn;
    private int numriFaqeve;
    private String lloji;
    private double cmimi;
    public Libri(String autori, String titulli, String isbn, int numriFaqeve, String lloji, double cmimi) {
        this.autori = autori;
        this.titulli = titulli;
        this.isbn = isbn;
        this.numriFaqeve = numriFaqeve;
        this.lloji = lloji;
        this.cmimi = cmimi;
    }
    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return "Titulli: " + titulli + ", Autori: " + autori + ", ISBN: " + isbn +
                ", Faqet: " + numriFaqeve + ", Lloji: " + lloji + ", Cmimi: " + cmimi + "€";
    }
}

