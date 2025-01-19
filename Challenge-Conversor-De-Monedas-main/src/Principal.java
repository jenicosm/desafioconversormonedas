import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaConversion consulta = new ConsultaConversion();
        int opcion = 0;
        String monedaOrigen = "";
        String monedaDestino = "";

        String menu = "=||=||=||=||=||=||=||=||=||=||=||=||=||=||=\n"+
                "Bienvenido(a) al conversor de monedas\n"+
                "[1] Dolar => Sol\n"+
                "[2] Sol => Dolar\n"+
                "[3] Dolar => Euro\n"+
                "[4] Euro => Dolar\n"+
                "[5] Dolar => Reais\n"+
                "[6] Real Brasileño => Dolar\n"+
                "[7] Salir\n"+
                "Pd. Elija una opción válida\n"+
                "=||=||=||=||=||=||=||=||=||=||=||=||=||=||=";

        while (opcion!=7){
            System.out.println(menu);
            opcion = lectura.nextInt();
            if (opcion!=7) {
                if (opcion < 1 || opcion > 7){
                    System.out.println("La opción (" + opcion + ") no es válida, intente de nuevo");
                } else {
                    System.out.println("Ingrese monto a convertir: ");
                    var monto = Double.valueOf(lectura.nextDouble());

                    switch (opcion) {
                        case 1:
                            monedaOrigen = "USD";
                            monedaDestino = "PEN";
                            break;
                        case 2:
                            monedaOrigen = "PEN";
                            monedaDestino = "USD";
                            break;
                        case 3:
                            monedaOrigen = "USD";
                            monedaDestino = "EUR";
                            break;
                        case 4:
                            monedaOrigen = "EUR";
                            monedaDestino = "USD";
                            break;
                        case 5:
                            monedaOrigen = "USD";
                            monedaDestino = "BRL";
                            break;
                        case 6:
                            monedaOrigen = "BRL";
                            monedaDestino = "USD";
                            break;
                        default:
                            System.out.println("La opción (" + opcion + ") no es válida, intente de nuevo");
                            break;
                    }
                    Conversion conversion = consulta.hacerConversion(monedaOrigen, monedaDestino, monto);
                    System.out.println("El valor (" + monto + ") en [" + monedaOrigen + "] es igual a (" + conversion.conversion_result() + ") en [" + monedaDestino + "]");
                }
            } else {
                System.out.println("Gracias por usar el conversor de monedas");
            }
        }
    }
}
