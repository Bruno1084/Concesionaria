import java.util.*;
import java.util.stream.Collectors;

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

    public void modificarPrenda() {
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

            switch (option) {
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
        } while (option != 0);
    }

        public void vehiculosMasVendidos(){
            Map <String, Integer> ventasPorMarca = new HashMap<>();
            int i = 0;
            //Marca Ford
            ventasPorMarca.put("Ecosport", i);
            ventasPorMarca.put("Territory", i);
            ventasPorMarca.put("Ranger", i);
            //Marca Mustang
            ventasPorMarca.put("Ecobust", i);
            ventasPorMarca.put("Mach1", i);
            ventasPorMarca.put("Shelby", i);
            //Marca Nissang
            ventasPorMarca.put("Sentra", i);
            ventasPorMarca.put("Versa", i);
            ventasPorMarca.put("Leaf", i);

            for(Prenda prenda : prenda){
                ventasPorMarca.forEach((clave, valor)->{               //Expresión Lambda
                    if (prenda.getVehuiculo().getModelo().equals(clave)){
                        ventasPorMarca.replace(clave, i+1);
                        System.out.println("Se ha sumado 1 al modelo: " + clave);
                    }
                });
            }

            // Convertir el HashMap en un Stream de pares clave-valor y ordenarlo por el valor de los enteros
            LinkedHashMap<String, Integer> sortedMap = ventasPorMarca.entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            // Recorrer las entradas del mapa ordenado en orden inverso e imprimir las claves y valores en forma vertical
            Iterator<Map.Entry<String, Integer>> iterator = sortedMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = iterator.next();
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }


        }


 }


