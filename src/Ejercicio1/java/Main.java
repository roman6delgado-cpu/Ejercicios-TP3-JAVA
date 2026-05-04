package Ejercicio1.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Vehiculo> flota = new ArrayList<>();

        flota.add(new Furgoneta("Fort","F100",100,1000.0));
        flota.add(new Furgoneta("Chevrolet","corsa",80,500.0));
        flota.add(new Motocicleta("Honda","C90",30,89));
        flota.add(new Motocicleta("Corven","Triax",60,150));

        System.out.println("REPORTE DE FLOTA");
        System.out.println();

        for (Vehiculo vehiculos: flota){
            vehiculos.mostrarInfo();
            System.out.println();
        }
        System.out.println("Total de Vehiculos: "+ flota.size());
    }
}