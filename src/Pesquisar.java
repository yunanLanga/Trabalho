import java.util.Vector;

public class Pesquisar {

    public void pesqBilhete(Vector v, short cod) {
        Bilhete b;
        Boolean found = false;
        for(byte i = 0; i < v.size() && found!=false; i++){
            b = (Bilhete) v.elementAt(i);
            if(cod == b.codigo){
                found = true;
                System.out.println(b);
            }
        }
        if(found=false){
            System.out.println("Empty");
        }
    }
}
