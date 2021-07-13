public final class Aereo extends Bilhete{
    //O Aéreo tem como característica a quantidade de
    //milhas e a companhia aérea escolhida

    private short milhas;
    private String companhia;

    public Aereo(String nomeCliente, String bi_Cliente, String data_partida, String data_chegada, String formaPagamento, short codigo, float valor, short milhas, String companhia) {
        super(nomeCliente, bi_Cliente, data_partida, data_chegada, formaPagamento, codigo, valor);
        this.milhas = milhas;
        this.companhia = companhia;
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

    @Override
    public String toString() {
        return super.toString()+
                "Aereo{" +
                "milhas=" + milhas +
                ", companhia='" + companhia + '\'' +
                '}';
    }
}
