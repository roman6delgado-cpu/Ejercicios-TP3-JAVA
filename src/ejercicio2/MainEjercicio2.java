package ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class MainEjercicio2 {
    static void main(String[] args) {
        List<Suscripcion> lista = new ArrayList<>();

        lista.add(new PlanBasico("ana@email.com", "C001", 1500));
        lista.add(new PlanFamiliar("carlos@email.com", "C002", 2200, 4));
        lista.add(new PlanPremium("maria@email.com", "C003", 2800));

        double total = 0;
        for (Suscripcion s : lista) {
            s.mostrarDatos();
            double costo = s.calcularCostoMensual();
            System.out.println("Costo mensual: $" + costo + "\n");
            total += costo;
        }

        System.out.println("Ingresos totales del mes: $" + total);
    }
}