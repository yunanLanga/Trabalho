public final class Comboio extends Terrestre{

    private String tipo;

    public Comboio(String nomeCliente, String bi_Cliente, String data_partida, String data_chegada, String formaPagamento, short codigo, float valor, int nr_kilometros, String tipo) {
        super(nomeCliente, bi_Cliente, data_partida, data_chegada, formaPagamento, codigo, valor, nr_kilometros);
        this.tipo = tipo;
    }

    public Comboio() {
        this("","","","","",(short) 0,(float) 0,(int) 0,"");
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTransporte - Ferroviario{" +
                "\nTipo= " + tipo;
    }
}
