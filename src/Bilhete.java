public abstract class Bilhete {

    protected String nomeCliente,data_partida,data_chegada,formaPagamento,bi_Cliente;
    protected short codigo;
    protected float valor;


    public Bilhete(String nomeCliente, String bi_Cliente, String data_partida, String data_chegada, String formaPagamento, short codigo, float valor) {
        this.nomeCliente = nomeCliente;
        this.bi_Cliente = bi_Cliente;
        this.data_partida = data_partida;
        this.data_chegada = data_chegada;
        this.formaPagamento = formaPagamento;
        this.codigo = codigo;
        this.valor = valor;
    }

    public Bilhete() {
        this("","","","","",(short) 0,(float) 0);
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setBi_Cliente(String bi_Cliente) {
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

    public short getCodigo() {
        return codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getData_partida() {
        return data_partida;
    }

    public String getData_chegada() {
        return data_chegada;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public float getValor() {
        return valor;
    }

    public String getBi_Cliente() {
        return bi_Cliente;
    }

    @Override
    public String toString() {
        return  "Código Bilhete="+codigo+ "\n"+
                "Cliente "+ nomeCliente + '\n' +
                "BI Cliente = " + bi_Cliente + '\n' +
                "Data partida= " + data_partida + '\n' +
                "Data chegada= " + data_chegada + '\n' +
                "Forma de Pagamento= " + formaPagamento + '\n' +
                "Valor= " + valor;
    }
}
