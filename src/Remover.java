import java.awt.geom.Area;
import java.util.Vector;

public class Remover {

    public void remover(Vector v, short cod) {

        Bilhete b;

        Boolean found = false;

        for(byte i = 0; i < v.size() && found==false; i++){
            b = (Bilhete) v.elementAt(i);
            if(cod == b.getCodigo()){
                found = true;
                v.remove(b);
                System.out.println("Removido com sucesso.");

                if(b instanceof Carro){
                    Carro.cont--;
                }if(b instanceof Comboio){
                    Comboio.cont--;
                }if(b instanceof Aereo){
                    Aereo.cont--;
                }if(b instanceof Mar){
                    Mar.cont--;
                }
            }
        }

        if(found==false){
            System.out.println("Não foi possivel remover!");
        }
    }
}
