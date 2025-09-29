import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double c = sc.nextDouble();

        System.out.println("Temperatura em Celsius: " + c + " °C");
        System.out.println("Temperatura em Fahrenheit: " + ((c * 9/5) + 32) + " °F");
        System.out.println("Temperatura em Kelvin: " + (c + 273.15) + " K");

        sc.close();
    }
}