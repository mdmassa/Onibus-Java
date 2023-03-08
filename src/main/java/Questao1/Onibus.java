package Questao1;

public abstract class Onibus {
    private int id;
    private int capacidade;
    
    public Onibus(int id, int capacidade) {
        this.id = id;
        this.capacidade = capacidade;
    }
    
    public abstract double getAceleracao(double e, int v);

    @Override
    public String toString() {
        return "Id: " + getId() + "\nCapacidade: " + getCapacidade() + " Litros";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
