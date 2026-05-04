package ejercicio2;

public class PlanPremium extends Suscripcion {
    private static final double CARGO_EXTRA = 1200; // 4K + offline

    public PlanPremium(String email, String numCliente, double costoBase) {
        super(email, numCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return getCostoBase() + CARGO_EXTRA;
    }
}