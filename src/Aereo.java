public final class Aereo extends Bilhete{

    public static byte cont = 0;
    private short milhas;
    private String companhia;

    public Aereo(String nomeCliente, String bi_Cliente, String data_partida, String data_chegada, String formaPagamento, short codigo, float valor, short milhas, String companhia) {
        super(nomeCliente, bi_Cliente, data_partida, data_chegada, formaPagamento, codigo, valor);
        this.milhas = milhas;
        this.companhia = companhia;
        cont++;
    }

    public Aereo() {
        this("","","","","",(short) 0,(float) 0,(short) 0,"");
    }

    public void setMilhas(short milhas) {
        this.milhas = milhas;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public short getMilhas() {
        return milhas;
    }

    public String getCompanhia() {
        return companhia;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTransporte - Aéreo" +
                "\nMilhas= " + milhas +
                "\nCompanhia= " + companhia;
    }
}
