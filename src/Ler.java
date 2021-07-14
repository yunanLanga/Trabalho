import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class Ler {

    private Vector v;

    public Ler(){ v = new Vector();}

    public void LerFicheiro(){

        String nome,dataPartida,dataChegada,pagamento,companhia,matricula,tipo,line,criterio,criterio2;
        StringTokenizer key;
        byte combustivel;
        short codigo,milhas;
        float valor,valorPortagem;
        int bi,kilometros;

        try{
            BufferedReader br = new BufferedReader(new FileReader("/home/mingos/Documents/ClassMaterials/PO2/PO1/Programas/TrP1/src/data.txt"));
            line = br.readLine();

            while (line!=null){
                key = new StringTokenizer(line,";");
                codigo = Short.parseShort(key.nextToken());
                nome = key.nextToken();
                bi = Integer.parseInt(key.nextToken());
                dataPartida = key.nextToken();
                dataChegada = key.nextToken();
                valor = Float.parseFloat(key.nextToken());
                pagamento = key.nextToken();
                criterio = key.nextToken();

                if(criterio.equalsIgnoreCase("Terrestre")){
                    kilometros = Integer.parseInt(key.nextToken());
                    criterio2 = key.nextToken();

                    if(criterio2.equalsIgnoreCase("Carro")){
                        matricula = key.nextToken();
                        combustivel = Byte.parseByte(key.nextToken());
                        valorPortagem = Float.parseFloat(key.nextToken());
                        criarBilheteCarro(codigo,nome,bi,dataPartida,dataChegada,valor,pagamento,kilometros,matricula,combustivel,valorPortagem);
                    }

                    if(criterio2.equalsIgnoreCase("Comboio")){
                        tipo = key.nextToken();
                        criarBilheteComboio(codigo,nome,bi,dataPartida,dataChegada,valor,pagamento,kilometros,tipo);
                    }

                }
                else
                {
                    if(criterio.equalsIgnoreCase("Aereo")){
                        milhas = Short.parseShort(key.nextToken());
                        companhia = key.nextToken();
                        criarBilheteAereo(codigo,nome,bi,dataPartida,dataChegada,valor,pagamento,milhas,companhia);
                    }

                    if(criterio.equalsIgnoreCase("Mar")){
                        tipo = key.nextToken();
                        criarBilheteMar(codigo,nome,bi,dataPartida,dataChegada,valor,pagamento,tipo);
                    }
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void criarBilheteMar(short codigo, String nome, int bi, String dataPartida, String dataChegada, float valor, String pagamento, String tipo) {
        Mar mar = new Mar();
        mar.setCodigo(codigo);
        mar.setNomeCliente(nome);
        mar.setBi_Cliente(bi);
        mar.setData_partida(dataPartida);
        mar.setData_chegada(dataChegada);
        mar.setValor(valor);
        mar.setFormaPagamento(pagamento);
        mar.setTipo(tipo);

        v.addElement(mar);
        v.trimToSize();
    }

    private void criarBilheteAereo(short codigo, String nome, int bi, String dataPartida, String dataChegada, float valor, String pagamento, short milhas, String companhia) {
        Aereo aereo = new Aereo();
        aereo.setCodigo(codigo);
        aereo.setNomeCliente(nome);
        aereo.setBi_Cliente(bi);
        aereo.setData_partida(dataPartida);
        aereo.setData_chegada(dataChegada);
        aereo.setValor(valor);
        aereo.setFormaPagamento(pagamento);
        aereo.setMilhas(milhas);
        aereo.setCompanhia(companhia);

        v.addElement(aereo);
        v.trimToSize();
    }

    private void criarBilheteCarro(short codigo, String nome, int bi, String dataPartida, String dataChegada, float valor, String pagamento, int kilometros, String matricula, byte combustivel, float valorPortagem) {
        Carro carro = new Carro();
        carro.setCodigo(codigo);
        carro.setNomeCliente(nome);
        carro.setBi_Cliente(bi);
        carro.setData_partida(dataPartida);
        carro.setData_chegada(dataChegada);
        carro.setValor(valor);
        carro.setFormaPagamento(pagamento);
        carro.setNr_kilometros(kilometros);
        carro.setMatricula(matricula);
        carro.setQuant_combustivel(combustivel);
        carro.setValorPortagem(valorPortagem);

        v.addElement(carro);
        v.trimToSize();
    }

    private void criarBilheteComboio(short codigo, String nome, int bi, String dataPartida, String dataChegada, float valor, String pagamento, int kilometros, String tipo) {
        Comboio comboio = new Comboio();
        comboio.setCodigo(codigo);
        comboio.setNomeCliente(nome);
        comboio.setBi_Cliente(bi);
        comboio.setData_partida(dataPartida);
        comboio.setData_chegada(dataChegada);
        comboio.setValor(valor);
        comboio.setFormaPagamento(pagamento);
        comboio.setNr_kilometros(kilometros);
        comboio.setTipo(tipo);

        v.addElement(comboio);
        v.trimToSize();
    }

    public void adaptadorPesquisa() throws IOException {
        Pesquisar p = new Pesquisar();
        Validar valid = new Validar();
        short cod = valid.validarShort("Introduza o código do bilhete","Código inválido!");
        p.pesqBilhete(v,cod);
    }


    public void adaptadorRemover() throws IOException {
        Remover r = new Remover();
        Validar valid = new Validar();
        short cod = valid.validarShort("Introduza o código do bilhete","Código inválido!");
        r.remover(v,cod);
    }
}
