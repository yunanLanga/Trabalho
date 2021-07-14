public final class Mar extends  Bilhete{

    public static byte cont = 0;
    private String tipo;

    public Mar(String nomeCliente, int bi_Cliente, String data_partida, String data_chegada, String formaPagamento, short codigo, float valor, String tipo) {
        super(nomeCliente, bi_Cliente, data_partida, data_chegada, formaPagamento, codigo, valor);
        this.tipo = tipo;
        cont++;
    }

    public Mar() {
        this("",0,"","","",(short) 0,(float) 0,"");

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nTransporte - Náutico{" +
                "\nTipo= " + tipo;
    }
}
