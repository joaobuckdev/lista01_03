import java.util.Scanner;

public class App {
  
  public static void main(String[] args) {
    double number1;
    double number2;


    System.out.print("Informe o primeiro número: ");
    Scanner teclado = new Scanner(System.in);
    number1 = teclado.nextDouble();
    System.out.print("Informe o segundo número: ");
    number2 = teclado.nextDouble();
    teclado.close();

System.out.println("O resultado da soma é: " + (number1 + number2));

  }
}