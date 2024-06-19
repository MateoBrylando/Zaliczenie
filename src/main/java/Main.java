// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę znaków w tablicy: ");
    int n = scanner.nextInt();
    char[] tablica = new char[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Podaj znak: ");
      tablica[i] = scanner.next().charAt(0);
    }
    for (int i = 0; i < n; i++) {
      System.out.print(tablica[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < n; i++) {
      if (i == 2) {
        continue;
      }
      System.out.print(tablica[i] + " ");
    }
        
  

 
  }
}