import java.util.Scanner;

public class Garante extends Sujeto{

    public Garante(){}
    public Garante(String dni, float ingrMensual){
        super(dni, ingrMensual);
    }

    public void rellenarGarante(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos del garante: ");
        System.out.print("DNI: ");
        setDni(sc.nextLine());                    // Ingresa DNI
        System.out.print("Ingreso mensual: ");
        setIngrMensual(sc.nextFloat());          // Ingresa ingreso mensual
    }

}
