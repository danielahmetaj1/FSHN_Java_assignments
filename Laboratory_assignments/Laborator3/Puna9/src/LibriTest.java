import java.util.ArrayList;
import java.util.Scanner;

public class LibriTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Libri> listaLibrave = new ArrayList<>();
        int zgjedhja;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Shfaq te gjithe librat");
            System.out.println("2. Kerko nje liber me ISBN");
            System.out.println("3. Shto nje liber");
            System.out.println("4. Hiq nje liber me ISBN");
            System.out.println("0. Dalje");
            System.out.print("Zgjedhja juaj: ");
            zgjedhja = scanner.nextInt();
            scanner.nextLine();

            switch (zgjedhja) {
                case 1:
                    if (listaLibrave.isEmpty()) {
                        System.out.println("Nuk ka libra ne liste.");
                    } else {
                        for (Libri l : listaLibrave) {
                            System.out.println(l);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Jep ISBN e librit qe kerkon: ");
                    String isbnKerkuar = scanner.nextLine();
                    boolean gjetur = false;
                    for (Libri l : listaLibrave) {
                        if (l.getIsbn().equals(isbnKerkuar)) {
                            System.out.println("Libri u gjet:\n" + l);
                            gjetur = true;
                            break;
                        }
                    }
                    if (!gjetur) {
                        System.out.println("Libri nuk u gjet.");
                    }
                    break;

                case 3:
                    System.out.print("Jep autorin: ");
                    String autori = scanner.nextLine();
                    System.out.print("Jep titullin: ");
                    String titulli = scanner.nextLine();
                    System.out.print("Jep ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Jep numrin e faqeve: ");
                    int faqet = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Jep llojin: ");
                    String lloji = scanner.nextLine();
                    System.out.print("Jep cmimin: ");
                    double cmimi = scanner.nextDouble();
                    scanner.nextLine();

                    Libri liberiRi = new Libri(autori, titulli, isbn, faqet, lloji, cmimi);
                    listaLibrave.add(liberiRi);
                    System.out.println("Libri u shtua me sukses.");
                    break;

                case 4:
                    System.out.print("Jep ISBN e librit qe deshiron te heqesh: ");
                    String isbnPerHeqje = scanner.nextLine();
                    boolean hoq = listaLibrave.removeIf(l -> l.getIsbn().equals(isbnPerHeqje));
                    if (hoq) {
                        System.out.println("Libri u hoq me sukses.");
                    } else {
                        System.out.println("Libri nuk u gjet.");
                    }
                    break;

                case 0:
                    System.out.println("Programi u mbyll.");
                    break;

                default:
                    System.out.println("Zgjedhje e pavlefshme!");
            }
        } while (zgjedhja != 0);

        scanner.close();
    }
}
