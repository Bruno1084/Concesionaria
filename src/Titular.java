import java.util.Scanner;

public class Titular extends Sujeto{
    private String nombre;
    private String cuil;

    public Titular(){}
    public Titular(String nombre, String cuil, String dni, float ingrMensual){
        super(dni, ingrMensual);
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        Scanner sc = new Scanner(System.in);
        boolean tieneCarater = false;

        for (int i=0; i < cuil.length(); i++){
            if(!Character.isDigit(cuil.charAt(i))){
                System.out.println("    El cuil ingresado solo debe tener números");
                tieneCarater = true;
                break;
            }
        }
        if (tieneCarater){
            cuil = sc.nextLine();
            setCuil(cuil);
        }
    }

    public void rellenarTitular(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos del titular: ");
        System.out.print("Nombre: ");
        setNombre(sc.nextLine());                // Ingresa nombre


        System.out.print("Cuil: ");
        setCuil(sc.nextLine());                  // Ingresa  Cuil

        System.out.print("DNI: ");
        setDni(sc.nextLine());                    // Ingresa DNI


        System.out.print("Ingreso mensual: ");
        setIngrMensual(sc.nextFloat());          // Ingresa ingreso mensual
    }

}
