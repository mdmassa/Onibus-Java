package Questao1;

public class OnibusEletrico extends Onibus implements Eletrico {
    private int voltagem;

    public OnibusEletrico(int id, int capacidade, int voltagem) {
        super(id, capacidade);
        this.voltagem = voltagem;
    }
    
    @Override
    public double getAceleracao(double e, int v){
        return v/15;
    }
    
    @Override
    public double getConsumo(double a, int c, double e){
        return a*c*0.8;
    }

    @Override
    public String toString() {
        return "\nOnibus Eletrico\n" +  super.toString() + "\nVoltagem: " + getVoltagem() + " Volts \n";
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
    
}
