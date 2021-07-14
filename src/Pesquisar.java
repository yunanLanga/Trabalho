import java.util.Vector;

public class Pesquisar {

    public void pesqBilhete(Vector v, short cod) {
        Bilhete b;
        Boolean found = false;

        for(byte i = 0; i < v.size() && found==false; i++){
            b = (Bilhete) v.elementAt(i);
            System.out.println(b.getCodigo());
            if(cod == b.getCodigo()){
                found = true;
                System.out.println("Resultado:");
                System.out.println("-------------------------");
                System.out.println(b);
                System.out.println("-------------------------");
            }
        }
        if(found==false){
            System.out.println("Sem resultados.");
        }
    }
}
