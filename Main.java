import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int liczba = scanner.nextInt();
        if (liczba > 0){System.out.println("The number is positive");}
            if (liczba < 0){System.out.println("The number is negative");}
            if (liczba == 0){System.out.println("The value equals 0");}


    }
}