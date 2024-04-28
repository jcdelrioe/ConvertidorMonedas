import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    boolean repetir = true;
    CambioMoneda busqueda;
    Double valor;

    System.out.println("Bienvenido al convertidor de monedas");
    ConsultaMoneda consultaMonedasAConvertir = new ConsultaMoneda();

    while (repetir){
      System.out.println("1) Dolar Americano (USD) -> Peso Argentino (ARS)");
      System.out.println("2) Peso Argentino (ARS) -> Dolar Americano (USD)");
      System.out.println("3) Dolar Americano (USD) -> Real Brasileño (BRL)");
      System.out.println("4) Real Brasileño (BRL) -> Dolar Americano (USD)");
      System.out.println("5) Dolar Americano (USD) -> Peso Colombiano (COP)");
      System.out.println("6) Peso Colombiano (COP) -> Dolar Americano (USD)");
      System.out.println("7) Salir del Programa");
      System.out.println("Ingrese una opcion ");

      Scanner scanner = new Scanner(System.in);
      String opcion = scanner.nextLine();
      switch (opcion){
        case "1":
          System.out.println("=========================================");
          System.out.println("Convertir (USD) a (ARG)");
          System.out.println("Ingrese la cantidad de USD a convertir: ");
          valor = scanner.nextDouble();

          busqueda = consultaMonedasAConvertir.buscarCambioMoneda("USD", "ARS");

          System.out.println(valor + " " + busqueda.base_code() + " son " + valor * busqueda.conversion_rate() + " " + busqueda.target_code());
          System.out.println("=========================================");
          break;
        case "2":
          System.out.println("=========================================");
          System.out.println("Convertir (ARS) a (USD)");
          System.out.println("Ingrese la cantidad de ARS a convertir: ");
          valor = scanner.nextDouble();

          busqueda = consultaMonedasAConvertir.buscarCambioMoneda("ARS", "USD");

          System.out.println(valor + " " + busqueda.base_code() + " son " + valor * busqueda.conversion_rate() + " " + busqueda.target_code());
          System.out.println("=========================================");
          break;
        case "3":
          System.out.println("=========================================");
          System.out.println("Convertir (USD) a (BRL)");
          System.out.println("Ingrese la cantidad de USD a convertir: ");
          valor = scanner.nextDouble();

          busqueda = consultaMonedasAConvertir.buscarCambioMoneda("USD", "BRL");

          System.out.println(valor + " " + busqueda.base_code() + " son " + valor * busqueda.conversion_rate() + " " + busqueda.target_code());
          System.out.println("=========================================");
          break;
        case "4":
          System.out.println("=========================================");
          System.out.println("Convertir (BRL) a (USD)");
          System.out.println("Ingrese la cantidad de BRL a convertir: ");
          valor = scanner.nextDouble();

          busqueda = consultaMonedasAConvertir.buscarCambioMoneda("BRL", "USD");

          System.out.println(valor + " " + busqueda.base_code() + " son " + valor * busqueda.conversion_rate() + " " + busqueda.target_code());
          System.out.println("=========================================");
          break;
        case "5":
          System.out.println("=========================================");
          System.out.println("Convertir (USD) a (COP)");
          System.out.println("Ingrese la cantidad de USD a convertir: ");
          valor = scanner.nextDouble();

          busqueda = consultaMonedasAConvertir.buscarCambioMoneda("USD", "COP");

          System.out.println(valor + " " + busqueda.base_code() + " son " + valor * busqueda.conversion_rate() + " " + busqueda.target_code());
          System.out.println("=========================================");
          break;
        case "6":
          System.out.println("=========================================");
          System.out.println("Convertir (COP) a (USD)");
          System.out.println("Ingrese la cantidad de COP a convertir: ");
          valor = scanner.nextDouble();

          busqueda = consultaMonedasAConvertir.buscarCambioMoneda("COP", "USD");

          System.out.println(valor + " " + busqueda.base_code() + " son " + valor * busqueda.conversion_rate() + " " + busqueda.target_code());
          System.out.println("=================================");
          break;
        case "7":
          System.out.println("Gracias por utilizar nuestro convertidor");
          repetir = false;
          break;
        default:
          System.out.println("Ingrese una opcion correcta ");
      }
    }
  }
}
