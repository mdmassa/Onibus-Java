package Questao1;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Onibus> listaOnibus =  new ArrayList<>();
        
        Onibus o1 = new OnibusGasolina(001, 50);
        Onibus o2 = new OnibusHibrido(002, 25, 110);
        Onibus o3 = new OnibusEletrico(003, 0, 220);

        listaOnibus.add(o1);
        listaOnibus.add(o2);
        listaOnibus.add(o3);
        
        for(Onibus it : listaOnibus){
            System.out.println(it.toString());
        }
    }
}
