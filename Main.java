import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int rozmiar = scanner.nextInt();

        int[] tablica = new int[rozmiar];

        System.out.println("Podaj elementy tablicy:");
        for (int i = 0; i < rozmiar; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }
      int iloczyn = 1;

        for (int i = 0; i < rozmiar; i++) {
            iloczyn *= tablica[i];
        }

        System.out.println("Iloczyn elementów tablicy: " + iloczyn);
    }
}