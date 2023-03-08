package examen.e5;

public class Reiniciar implements Estado {
    @Override
    public void handle(Celular celular) {
        celular.setProgramasAbiertos(0);
        celular.setCPU(0);
        System.out.println("El celular está reiniciando, cerrando programas");
        System.out.println("Programas abiertos: " + celular.getProgramasAbiertos());
        System.out.println("Uso de recursos: " + celular.getCPU());
        System.out.println("Memoria:" + celular.getMemoria());
        System.out.println("RAM:" + celular.getRAM());
    }
}
