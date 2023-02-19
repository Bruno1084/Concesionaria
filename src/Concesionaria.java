import java.util.ArrayList;
import java.util.Scanner;

public class Concesionaria {
    private ArrayList<Prenda> prenda;

    public Concesionaria(){
        prenda = new ArrayList<>();
    }

    public void agregarPrenda(){
        Prenda ingPrenda = new Prenda();
        ingPrenda.rellenarPrenda();
        prenda.add(ingPrenda);
    }

    public void borrarPrenda(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dni del titular a borrar");
        String dniBuscar = sc.nextLine();

        prenda.remove(buscarCliente(dniBuscar));
    }

    public void agregarN_Prendas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Prendas que desea cargar");
        int cant = sc.nextInt();
        for (int i=0; i < cant; i++)
            agregarPrenda();
    }

    public Prenda buscarCliente(String dni){
        for(Prenda prenda : prenda){
            if (prenda.getTitular().getDni().equals(dni))
                return prenda;
        }
        System.out.println("Cliente no encontrado");
        return null;
    }       // Busca una prenda por dni

    public void imprimirPrendas(){
        for (Prenda prenda : prenda)
            System.out.println(prenda);
    }

    public void modificarPrenda(){
        Prenda modPrenda = new Prenda();
        Scanner sc = new Scanner(System.in);
        String dniBuscar;
        int option;

        System.out.println("Ingrese DNI del titular de la prenda a modificar:");
        dniBuscar = sc.nextLine();
        modPrenda = buscarCliente(dniBuscar);

        System.out.println("    Seleccione una opción para reingresar datos");

        do {
            System.out.println("1_ Titular");
            System.out.println("2_ Garante");
            System.out.println("3_ Vehiculo");
            System.out.println("0_ Salir");
            option = sc.nextInt();

            switch (option){
                case 1 -> {
                    modPrenda.getTitular().rellenarTitular();
                    System.out.println("Datos de Titular actualizados");
                }
                case 2 -> {
                    modPrenda.getGarante().rellenarGarante();
                    System.out.println("Datos de Garante actualizados");
                }
                case 3 -> {
                    modPrenda.getVehuiculo().rellenarVehiculo();
                    System.out.println("Datos de Vehiculo actualizados");
                }
                default -> System.out.println("Ingrese una opción valida");
            }
        }while (option != 0);

        
    }


 }


