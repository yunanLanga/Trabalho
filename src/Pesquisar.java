import java.util.Vector;

public class Pesquisar {

    public Bilhete pesqBilhete(Vector v, short cod) {
        Bilhete b = null;

        Boolean found = false;

        for(byte i = 0; i < v.size() && found==false; i++){
            b = (Bilhete) v.elementAt(i);
            if(cod == b.getCodigo()){
                found = true;
                System.out.println("----------------------------------------------");
            }
        }
        if(found != false){
            return b;
        }else {
            return null;
        }
    }
}
