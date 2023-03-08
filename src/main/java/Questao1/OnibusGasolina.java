package Questao1;

public class OnibusGasolina extends Onibus implements AGasolina{

    public OnibusGasolina(int id, int capacidade) {
        super(id, capacidade);
    }
    
    @Override
    public double getAceleracao(double e, int v){
        return e/15;
    }
    
    @Override
    public double getGrauEmissao(int c){
        return Math.pow(c, 2)* Math.log10(c);
    }

    @Override
    public String toString() {
        return "\nOnibus Gasolina\n" + super.toString();
    }
}
