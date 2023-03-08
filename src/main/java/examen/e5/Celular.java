package examen.e5;

public class Celular {
    private int programasAbiertos;
    private String memoria;
    private String RAM;
    private double CPU;
    private Estado state;

    public Celular() {
        state = new Apagado();
        memoria = "8GB";
        RAM = "4GB";
    }

    public int getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(int programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public Estado getState() {
        return state;
    }

    public void setState(Estado state) {
        this.state = state;
    }

    public void request() throws InterruptedException {
        this.state.handle(this);
    }
}
