import java.util.Scanner;

public abstract class Sujeto {
    private String dni;
    private float ingrMensual;

    public Sujeto(){}
    public Sujeto(String dni, float ingrMensual){
        super();
        this.dni = dni;
        this.ingrMensual = ingrMensual;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        Scanner sc = new Scanner(System.in);
        boolean tieneCaracter = false;
        for (int i=0; i <  dni.length(); i++){
            if(!Character.isDigit(dni.charAt(i))){
                System.out.println("    El DNI ingresado solo debe tener números");
                tieneCaracter = true;
                break;
            }
        }
        if (tieneCaracter){
            dni = sc.nextLine();
            setDni(dni);
        }
    }

    public float getIngrMensual() {
        return ingrMensual;
    }

    public void setIngrMensual(float ingrMensual) {
        this.ingrMensual = ingrMensual;
    }
}
