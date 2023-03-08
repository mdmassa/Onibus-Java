package Questao1;

public class OnibusHibrido extends Onibus implements AGasolina, Eletrico {
    private int voltagem;

    public OnibusHibrido(int id, int capacidade, int voltagem) {
        super(id, capacidade);
        this.voltagem = voltagem;
    }
    
    @Override
    public double getAceleracao(double e, int v){
        return v/15 * Math.sqrt(e);
    }
    
    @Override
    public double getGrauEmissao(int c){
        return Math.log10(c)*2;
    }
    
    @Override
    public double getConsumo(double a, int c, double e){
        return Math.sqrt(a*c*0.8)*Math.pow(e, 2);
    }

    @Override
    public String toString() {
        return "\nOnibus Hibrido\n" + super.toString() + "\nVoltagem: " + voltagem + " Volts";
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
}
