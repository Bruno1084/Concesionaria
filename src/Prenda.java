
public class Prenda {
    private Vehuiculo vehuiculo;
    private Titular titular;
    private Garante garante;

    public Prenda(){
        this.vehuiculo = new Vehuiculo();
        this.titular = new Titular();
        this.garante = new Garante();
    }

    public Vehuiculo getVehuiculo() {
        return vehuiculo;
    }

    public void setVehuiculo(Vehuiculo vehuiculo) {
        this.vehuiculo = vehuiculo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Garante getGarante() {
        return garante;
    }

    public void setGarante(Garante garante) {
        this.garante = garante;
    }

    public void rellenarPrenda(){
        System.out.println("**** Ingrese los datos de la prenda ****");
        vehuiculo.rellenarVehiculo();
        titular.rellenarTitular();
        garante.rellenarGarante();
    }


    @Override
    public String toString() {
        return "_DATOS DE PRENDA_ \n" +
                "   Datos Vehiculo:" +
                "       Marca: " + vehuiculo.getMarca() +
                "       Modelo: " + vehuiculo.getModelo() +
                "       Patente: " + vehuiculo.getPatente() +
                "       Precio: " + vehuiculo.getPrecio() +
                "\n   Datos Titular:" +
                "       Dni: " + titular.getDni() +
                "       Ingreso Mensual: " + titular.getIngrMensual() +
                "       Nombre: " + titular.getNombre() +
                "       Cuil: " + titular.getCuil() +
                "\n   Datos Garante:" +
                "       Dni: " + garante.getDni() +
                "       Ingreso Mensual: " + garante.getIngrMensual();
    }       // Imprime los datos de una prenda

}
