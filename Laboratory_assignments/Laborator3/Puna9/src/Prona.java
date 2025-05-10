import java.util.ArrayList;
import java.util.List;

public class Prona {
    private String emri;
    private List<Klient> klientet;

    public Prona(String emri) {
        this.emri = emri;
        this.klientet = new ArrayList<>();
    }

    public void shtoKlient(Klient klient) {
        klientet.add(klient);
    }

    public int numeroKliente() {
        return klientet.size();
    }

    public Klient ofertaMaks() {
        if (klientet.isEmpty()) {
            return null;
        }

        Klient klientMeOferteMaksimale = klientet.get(0);
        
        for (Klient klient : klientet) {
            if (klient.getOferta() > klientMeOferteMaksimale.getOferta()) {
                klientMeOferteMaksimale = klient;
            }
        }
        
        return klientMeOferteMaksimale;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public List<Klient> getKlientet() {
        return klientet;
    }

    @Override
    public String toString() {
        return "Prona{" +
                "emri='" + emri + '\'' +
                ", numri i klienteve=" + numeroKliente() +
                '}';
    }
}