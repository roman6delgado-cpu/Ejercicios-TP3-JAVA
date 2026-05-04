package ejercicio2.java;

public class PlanBasico extends Suscripcion {

    public PlanBasico(String email, String numCliente, double costoBase) {
        super(email, numCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return getCostoBase();
    }
}