public abstract class Bilhete {

    protected String nomeCliente,data_partida,data_chegada,formaPagamento;
    protected short codigo;
    protected float valor;
    protected int bi_Cliente;


    public Bilhete(String nomeCliente, int bi_Cliente, String data_partida, String data_chegada, String formaPagamento, short codigo, float valor) {
        this.nomeCliente = nomeCliente;
        this.bi_Cliente = bi_Cliente;
        this.data_partida = data_partida;
        this.data_chegada = data_chegada;
        this.formaPagamento = formaPagamento;
        this.codigo = codigo;
        this.valor = valor;
    }

    public Bilhete() {
        this("",0,"","","",(short) 0,(float) 0);
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setBi_Cliente(int bi_Cliente) {
        this.bi_Cliente = bi_Cliente;
    }

    public void setData_partida(String data_partida) {
        this.data_partida = data_partida;
    }

    public void setData_chegada(String data_chegada) {
        this.data_chegada = data_chegada;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Bilhete{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", bi_Cliente='" + bi_Cliente + '\'' +
                ", data_partida='" + data_partida + '\'' +
                ", data_chegada='" + data_chegada + '\'' +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", codigo=" + codigo +
                ", valor=" + valor +
                '}';
    }
}
