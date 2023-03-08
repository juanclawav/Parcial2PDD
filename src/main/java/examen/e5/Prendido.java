package examen.e5;

import java.util.Random;

public class Prendido implements Estado {
    @Override
    public void handle(Celular celular) throws InterruptedException {
        System.out.println("El celular está encendido");
        celular.setProgramasAbiertos(new Random().nextInt(10));
        System.out.println("Programas abiertos: " + celular.getProgramasAbiertos());
        System.out.println("Memoria: " + celular.getMemoria());
        System.out.println("RAM: " + celular.getRAM());
        double currentValue = celular.getCPU();
        while (currentValue < 100) {
            currentValue = currentValue + (double) celular.getProgramasAbiertos() * 5;
            celular.setCPU(currentValue);
            System.out.println("Uso de recursos: " + celular.getCPU() + "%");
        }
        System.out.println("Los recursos llegaron al 100%");
    }
}
