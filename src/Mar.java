public final class Mar extends  Bilhete{

    private String tipo;

    public Mar(String nomeCliente, String bi_Cliente, String data_partida, String data_chegada, String formaPagamento, short codigo, float valor, String tipo) {
        super(nomeCliente, bi_Cliente, data_partida, data_chegada, formaPagamento, codigo, valor);
        this.tipo = tipo;
    }

    public Mar() {
        this("","","","","",(short) 0,(float) 0,"");

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Mar{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
