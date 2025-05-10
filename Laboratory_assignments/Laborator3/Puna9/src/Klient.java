public class Klient {
    private String emri;
    private double oferta;

    public Klient(String emri, double oferta) {
        this.emri = emri;
        this.oferta = oferta;
    }

    public String getEmri() {
        return emri;
    }

    public double getOferta() {
        return oferta;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setOferta(double oferta) {
        this.oferta = oferta;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "emri='" + emri + '\'' +
                ", oferta=" + oferta +
                '}';
    }
}