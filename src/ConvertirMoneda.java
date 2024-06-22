import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMonedas(monedaBase,monedaTarget);
        System.out.println("La tasa de conversion es:\n"+monedaBase +" = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese la candtidad de "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+">>>>" +cantidadConvertida + monedas.target_code());

    }
}
