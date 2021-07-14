import java.awt.geom.Area;
import java.util.Vector;
import java.text.DecimalFormat;

public class Visualizar {

    DecimalFormat mt;
    Bilhete b;

    public Visualizar(){ mt = new DecimalFormat("###,###,###.00 Mt"); }

    public void todosDados(Vector v){
        System.out.println("        TABELA DOS BILHETES        ");
        System.out.println("| Código | Nome Cliente | Bilhete de Identidade |  Partida  |  Chegada  |  Valor | Forma de Pagamento |      ");
        for(byte i = 0; i < v.size(); i++){
            b = (Bilhete) v.elementAt(i);
            System.out.printf("%c%6d%2c",'|',b.getCodigo(),'|');
        }
    }

    public void todosBilhetesCarro(Vector v){

        Carro c;

        System.out.println("                                                                 BILHETES - CARRO        ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Código | Nome Cliente |     BI      |  Partida  |  Chegada  |    Valor   | Pagamento | Kilometros | Matricula| Combustivel | Valor Portagem |");
        for(byte i = 0; i < v.size(); i++){
            b = (Bilhete) v.elementAt(i);

            if(b instanceof Carro){
                c = (Carro) b;
                System.out.printf("%c%7d%2c%13s%2c%13s%c%11s%c%11s%c%9s%2c%11s%c%8d%5c%10s%c%9d%5c%10s%7c",'|',c.getCodigo(),'|',c.getNomeCliente(),'|',c.getBi_Cliente(),'|',c.getData_partida(),'|',c.getData_chegada(),'|',mt.format(c.getValor()),'|',c.getFormaPagamento(),'|',c.getNr_kilometros(),'|',c.getMatricula(),'|',c.getQuant_combustivel(),'|',mt.format(c.getValorPortagem()),'|');
                System.out.println();
            }
        }
    }

    public void todosBilhetesComboio(Vector v){

        Comboio c;

        System.out.println("                                           BILHETES - COMBOIO        ");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("| Código | Nome Cliente |     BI      |  Partida  |  Chegada  |    Valor   | Pagamento | Kilometros |   Tipo   |");
        for(byte i = 0; i < v.size(); i++){
            b = (Bilhete) v.elementAt(i);

            if(b instanceof Comboio){
                c = (Comboio) b;
                System.out.printf("%c%7d%2c%13s%2c%13s%c%11s%c%11s%c%9s%2c%11s%c%8d%5c%10s%c",'|',c.getCodigo(),'|',c.getNomeCliente(),'|',c.getBi_Cliente(),'|',c.getData_partida(),'|',c.getData_chegada(),'|',mt.format(c.getValor()),'|',c.getFormaPagamento(),'|',c.getNr_kilometros(),'|',c.getTipo(),'|');
                System.out.println();
            }
        }
    }

    public void todosBilhetesAereo(Vector v){

        Aereo c;

        System.out.println("                                            BILHETES - AEREOS");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("| Código | Nome Cliente |     BI      |  Partida  |  Chegada  |    Valor   | Pagamento | Milhas | Companhia |");
        for(byte i = 0; i < v.size(); i++){
            b = (Bilhete) v.elementAt(i);

            if(b instanceof Aereo){
                c = (Aereo) b;
                System.out.printf("%c%7d%2c%13s%2c%13s%c%11s%c%11s%c%9s%2c%11s%c%8s%c%10s%c",'|',c.getCodigo(),'|',c.getNomeCliente(),'|',c.getBi_Cliente(),'|',c.getData_partida(),'|',c.getData_chegada(),'|',mt.format(c.getValor()),'|',c.getFormaPagamento(),'|',c.getMilhas(),'|',c.getCompanhia(),'|');
                System.out.println();
            }
        }
    }

    public void todosBilhetesMar(Vector v){

        Mar c;

        System.out.println("                                                                BILHETES - MAR  ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Código | Nome Cliente |     BI      |  Partida  |  Chegada  |    Valor   | Pagamento |   Tipo   |");
        for(byte i = 0; i < v.size(); i++){
            b = (Bilhete) v.elementAt(i);

            if(b instanceof Mar){
                c = (Mar) b;
                System.out.printf("%c%7d%2c%13s%2c%13s%c%11s%c%11s%c%9s%2c%11s%c%10s%c",'|',c.getCodigo(),'|',c.getNomeCliente(),'|',c.getBi_Cliente(),'|',c.getData_partida(),'|',c.getData_chegada(),'|',mt.format(c.getValor()),'|',c.getFormaPagamento(),'|',c.getTipo(),'|');
                System.out.println();
            }
        }
    }

}
