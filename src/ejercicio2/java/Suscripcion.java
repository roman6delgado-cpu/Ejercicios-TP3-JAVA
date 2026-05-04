package ejercicio2.java;

public abstract class Suscripcion {
    private String correoElectronico;
    private String numCliente;
    private double costoBase;

    public Suscripcion(String correoElectronico, String numCliente, double costoBase) {
        this.correoElectronico = correoElectronico;
        this.numCliente = numCliente;
        this.costoBase = costoBase;
    }
// Cada plan calcula su costo de forma diferente
    public abstract double calcularCostoMensual();

    public void mostrarDatos() {
        System.out.printf("Cliente: " + numCliente + " | Email: " + correoElectronico);
        System.out.println("Costo base: $" + costoBase);
    }

    protected double getCostoBase() {
        return costoBase;
    }
}