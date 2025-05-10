public class TestPronaKlient {
    public static void main(String[] args) {
        Prona prona = new Prona("Apartament 2+1 ne qender");
        System.out.println("U krijua prona: " + prona.getEmri());
        System.out.println("Numri fillestar i klienteve: " + prona.numeroKliente());
        
        Klient klienti1 = new Klient("Agim Beqiri", 50000);
        Klient klienti2 = new Klient("Luljeta Hoxha", 55000);
        Klient klienti3 = new Klient("Besnik Lleshi", 48000);
        Klient klienti4 = new Klient("Miranda Kola", 60000);
        
        prona.shtoKlient(klienti1);
        System.out.println("U shtua klienti: " + klienti1.getEmri() + " me oferte " + klienti1.getOferta());
        
        prona.shtoKlient(klienti2);
        System.out.println("U shtua klienti: " + klienti2.getEmri() + " me oferte " + klienti2.getOferta());
        
        prona.shtoKlient(klienti3);
        System.out.println("U shtua klienti: " + klienti3.getEmri() + " me oferte " + klienti3.getOferta());
        
        prona.shtoKlient(klienti4);
        System.out.println("U shtua klienti: " + klienti4.getEmri() + " me oferte " + klienti4.getOferta());
        
        System.out.println("\nNumri total i klienteve te interesuar: " + prona.numeroKliente());
        
        Klient klientiMeOferteMaksimale = prona.ofertaMaks();
        System.out.println("\nKlienti me oferten me te larte eshte: " + 
                          klientiMeOferteMaksimale.getEmri() + 
                          " me oferte prej " + 
                          klientiMeOferteMaksimale.getOferta());
        
        Klient klienti5 = new Klient("Dritan Malaj", 65000);
        prona.shtoKlient(klienti5);
        System.out.println("\nU shtua klienti i ri: " + klienti5.getEmri() + " me oferte " + klienti5.getOferta());
        
        klientiMeOferteMaksimale = prona.ofertaMaks();
        System.out.println("Tani, klienti me oferten me te larte eshte: " + 
                          klientiMeOferteMaksimale.getEmri() + 
                          " me oferte prej " + 
                          klientiMeOferteMaksimale.getOferta());
        
        Prona pronaTjeter = new Prona("Truall ne periferi");
        System.out.println("\nU krijua prona e re: " + pronaTjeter.getEmri());
        System.out.println("Numri i klienteve: " + pronaTjeter.numeroKliente());
        
        Klient klientiMax = pronaTjeter.ofertaMaks();
        if (klientiMax == null) {
            System.out.println("Prona nuk ka ende kliente te interesuar!");
        } else {
            System.out.println("Klienti me oferten me te larte eshte: " + klientiMax.getEmri());
        }
    }
}