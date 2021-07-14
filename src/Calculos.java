import java.util.Vector;

public class Calculos {

    public void vooMaisLongo(Vector v) {

        Boolean found = false;
        Bilhete b;
        Aereo aux = null,a;
        short max = 0;

        for(byte i = 0; i < v.size(); i++){
            b = (Bilhete) v.elementAt(i);

            if(b instanceof Aereo){
                a = (Aereo) b;
                if(a.getMilhas() > max ){
                    max = a.getMilhas();
                    aux = a;
                }
                found = true;
            }
        }

        if(found == false){
            System.out.println("Não foi encontrado nenhum bilhete aéreo!");
        }
        else{
            System.out.println("Voo mais longo:");
            System.out.println(aux);
        }
    }
}
