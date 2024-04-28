import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Boolean repetir = true;
    System.out.println("Bienvenido al convertidor de monedas");

    while (repetir){
      System.out.println("1) Dolar Americano (USD) -> Peso Argentino (ARG)");
      System.out.println("2) Peso Argentino (ARG) -> Dolar Americano (USD)");
      System.out.println("3) Dolar Americano (USD) -> Real Brasileño (BRL)");
      System.out.println("4) Real Brasileño (BRL) -> Dolar Americano (USD)");
      System.out.println("5) Dolar Americano (USD) -> Peso Colombiano (COP)");
      System.out.println("6) Peso Colombiano (COP) -> Dolar Americano (USD)");
      System.out.println("7) Salir del Programa");

      Scanner scanner = new Scanner(System.in);
      String opcion = scanner.nextLine();
      switch (opcion){
        case "1":
          System.out.println("Opcion 1");
          break;
        case "2":
          System.out.println("Opcion 2");
          break;
        case "3":
          System.out.println("Opcion 3");
          break;
        case "4":
          System.out.println("Opcion 4");
          break;
        case "5":
          System.out.println("Opcion 5");
          break;
        case "6":
          System.out.println("Opcion 6");
          break;
        case "7":
          System.out.println("Salida");
          repetir = false;
          break;
        default:
          System.out.println("Ingrese una opcion correcta");
      }
    }
  }
}
