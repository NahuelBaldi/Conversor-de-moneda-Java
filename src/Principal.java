import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        int opcion = 0;

        while(opcion!=7){
            System.out.println("""
                    **************************************************
                    Bienvenidos la conversor de monedas!
                    Elija que conversion desea realizar:
                    1. Dólar a Peso Argentino
                    2. Peso Argentino a Dólar
                    3. Dólar a Real Brasilero
                    4. Real Brasilero a Dólar
                    5. Dólar a Peso Colombiano
                    6. Peso Colombiano a Dólar
                    7. Salir
                    """);
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","ARS",consulta,lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS","USD",consulta,lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL",consulta,lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD",consulta,lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP",consulta,lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD",consulta,lectura);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
