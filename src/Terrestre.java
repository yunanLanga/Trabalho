public abstract class Terrestre extends Bilhete  {

    protected int nr_kilometros;

    public Terrestre(String nomeCliente, String bi_Cliente, String data_partida, String data_chegada, String formaPagamento, short codigo, float valor, int nr_kilometros) {
        super(nomeCliente, bi_Cliente, data_partida, data_chegada, formaPagamento, codigo, valor);
        this.nr_kilometros = nr_kilometros;
    }

    public Terrestre() {
        this("","","","","",(short) 0,(float) 0,(int)0);
    }

    public void setNr_kilometros(int nr_kilometros) {
        this.nr_kilometros = nr_kilometros;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Terrestre{" +
                "nr_kilometros=" + nr_kilometros +
                '}';
    }
}
