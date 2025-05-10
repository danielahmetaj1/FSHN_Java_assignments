import java.util.Scanner;

class FiguraGjeometrike {
    double vlera1, vlera2, vlera3;

    public FiguraGjeometrike(double v1, double v2, double v3) {
        this.vlera1 = v1;
        this.vlera2 = v2;
        this.vlera3 = v3;
    }

    public double llogaritPerimeter(int tipFigura) {
        double perimeter = 0;
        switch (tipFigura) {
            case 1:
                perimeter = 2 * Math.PI * vlera1;
                break;
            case 2:
                perimeter = 2 * (vlera1 + vlera2);
                break;
            case 3:
                if (kontrolloTrekendesh()) {
                    perimeter = vlera1 + vlera2 + vlera3;
                } else {
                    System.out.println("Vlerat nuk formojne nje trekendesh te vlefshem.");
                }
                break;
            default:
                System.out.println("Zgjedhje e pavlefshme.");
                break;
        }
        return perimeter;
    }

    private boolean kontrolloTrekendesh() {
        return (vlera1 + vlera2 > vlera3) && (vlera1 + vlera3 > vlera2) && (vlera2 + vlera3 > vlera1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sa figura gjeometrike do te perzgjedhni? ");
        int n = scanner.nextInt();

        double maxPerimeter = 0;
        int figuraMePerimeterinEMadh = -1;

        for (int i = 0; i < n; i++) {
            System.out.println("\nZgjedhja e figures gjeometrike:");
            System.out.println("1. Rreth");
            System.out.println("2. Drejtkendesh");
            System.out.println("3. Trekendesh");
            int tipFigura = scanner.nextInt();

            System.out.print("Shkruani vleren 1 (ose anen): ");
            double v1 = scanner.nextDouble();

            double v2 = 0, v3 = 0;
            if (tipFigura == 2 || tipFigura == 3) {
                System.out.print("Shkruani vleren 2: ");
                v2 = scanner.nextDouble();
            }
            if (tipFigura == 3) {
                System.out.print("Shkruani vleren 3: ");
                v3 = scanner.nextDouble();
            }

            FiguraGjeometrike figura = new FiguraGjeometrike(v1, v2, v3);
            double perimeter = figura.llogaritPerimeter(tipFigura);

            if (perimeter > maxPerimeter) {
                maxPerimeter = perimeter;
                figuraMePerimeterinEMadh = i + 1;
            }

            System.out.println("Perimetri i figures " + (i + 1) + ": " + perimeter);
        }

        System.out.println("\nFigura me perimeterin me te madh eshte figura numer: " + figuraMePerimeterinEMadh + " me perimeter: " + maxPerimeter);
    }

}
