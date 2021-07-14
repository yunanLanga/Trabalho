public final class Carro extends Terrestre {

    private String matricula;
    private byte quant_combustivel;
    private float valorPortagem;

    public Carro(String nomeCliente, int bi_Cliente, String data_partida, String data_chegada, String formaPagamento, short codigo, float valor, int nr_kilometros, String matricula, byte quant_combustivel, float valorPortagem) {
        super(nomeCliente, bi_Cliente, data_partida, data_chegada, formaPagamento, codigo, valor, nr_kilometros);
        this.matricula = matricula;
        this.quant_combustivel = quant_combustivel;
        this.valorPortagem = valorPortagem;
    }


    public Carro() {
        this("",0,"","","",(short) 0,(float) 0,(int) 0,"",(byte) 0,(float)0);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setQuant_combustivel(byte quant_combustivel) {
        this.quant_combustivel = quant_combustivel;
    }

    public void setValorPortagem(float valorPortagem) {
        this.valorPortagem = valorPortagem;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nTipo - Carro" +
                "\nMatricula= " + matricula +
                "\nQuantidade combustivel=" + quant_combustivel +
                "\nValor da Portagem=" + valorPortagem;
    }
}
