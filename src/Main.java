
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Concesionaria Quique = new Concesionaria();
        Scanner sc = new Scanner(System.in);
        int option;


        System.out.println("MENÚ DE ENTRADA - CONCECIONARIA QUIQUE -");
        do {
            System.out.println("1) Ingresar una prenda");
            System.out.println("2) Ingresar N prendas");
            System.out.println("3) Imprimir prenda de un cliente");
            System.out.println("4) Imprimir todas las prendas");
            System.out.println("5) Modificar prenda");
            System.out.println("6) Vehiculos más vendidos");
            /* Puntos pendientes
            System.out.println("7) Imprimir prendas por vehiculo");
            System.out.println("8) Imprimir prendas de mayor y menor monto");
            */
            System.out.println("9) Borrar prenda por DNI");
            System.out.println("0) Fin del programa");
            option = sc.nextInt();

            switch (option) {
                case 1 -> Quique.agregarPrenda();
                case 2 -> Quique.agregarN_Prendas();
                case 3 -> {
                    System.out.println("    Ingrese DNI para buscar prenda:");
                    System.out.println(Quique.buscarCliente(sc.nextLine()));
                }
                case 4 -> Quique.imprimirPrendas();
                case 5 -> Quique.modificarPrenda();
                case 6 -> Quique.vehiculosMasVendidos();
                case 9 -> Quique.borrarPrenda();

                default -> System.out.println("Seleccione una opción valida");
            }
        }while (option != 0);



    }

}