import java.util.Scanner;

public class Vehuiculo {
    private String marca;
    private String modelo;
    private String patente;
    private long precio;

   public Vehuiculo(){
   }
   public Vehuiculo(String marca, String modelo, String patente, long precio){
       this.marca = marca;
       this.modelo = modelo;
       this.patente = patente;
       this.precio = precio;
   }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
       Scanner sc = new Scanner(System.in);
       String[] marcasDisponibles = new String[]{"Ford", "Mustang", "Nissan"};

       for(String disponible : marcasDisponibles){
           if(marca.equals(disponible)){
               this.marca = marca;
               return;
           }
       }
        System.out.print("Ingrese una marca disponible: ");
        marca = sc.nextLine();
        setMarca(marca);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
       Scanner sc = new Scanner(System.in);
       String[][] modelosPorMarca = new String[][]{
               {"Ecosport", "Territory", "Ranger"},
               {"EcoBust", "Mach1", "Shelby"},
               {"Sentra", "Versa", "Leaf"}};

       switch (getMarca()){
            case "Ford"->{
                for(String marcaDisponible : modelosPorMarca[0]){
                    if (modelo.equals(marcaDisponible)){
                        this.modelo = modelo;
                        return;
                    }
                }
            }
            case "Mustang"->{
                for (String marcaDisponible : modelosPorMarca[1]){
                    if (modelo.equals(marcaDisponible)){
                        this.modelo = modelo;
                        return;
                    }
                }
            }
            case "Nissan"->{
                for (String marcaDisponible : modelosPorMarca[2]){
                    if (modelo.equals(marcaDisponible)){
                        this.modelo = modelo;
                        return;
                    }
                }
            }
        }
        System.out.print("Ingrese un modelo disponible: ");
        modelo = sc.nextLine();
        setModelo(modelo);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
       Scanner sc = new Scanner(System.in);
        if (patente.length() == 7)
            this.patente = patente;
        else {
            System.out.println("La petente debe tener 7 caracteres");    //Según patente argentina
            patente = sc.nextLine();
            setPatente(patente);
        }
   }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public void rellenarVehiculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos del vehiculo: ");
            System.out.print("Marca (Ford, Mustang, Nissan): ");
            setMarca(sc.nextLine());         // Ingresa marca

            System.out.print("Modelo: \n");
            System.out.println("    Ford: Ecosport    Territory    Ranger \n" +
                               "    Mustang: EcoBust   Mach1   Shelby \n" +
                               "    Nissan: Sentra    Versa    Leaf ");
            setModelo(sc.nextLine());        // Ingresa modelo

            System.out.println("La patente debe tener 7 caracteres de  largo");
            System.out.print("Patente: ");
            setPatente(sc.nextLine());       // Ingresa patente


            System.out.print("Precio: ");
            setPrecio(sc.nextLong());        // Ingresa precio

        }



    }

