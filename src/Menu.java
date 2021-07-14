import java.io.IOException;

public class Menu {

    Ler l;

    public Menu(){l = new Ler();}

    public void execMenu() throws IOException {

        byte op,op2;
        Validar v = new Validar();

        do{
            menuPrincipal();
            op = v.validarByte((byte) 1,(byte) 9,"Escolha uma opção.","Opção Inválida!");

            switch (op){
                case 1:
                    l.LerFicheiro();
                    break;

                case 2:
                    //
                    break;

                case 3:
                    //
                    break;

                case 4:
                    l.adaptadorPesquisa();
                    break;

                case 5:
                    l.adaptadorRemover();
                    break;

                case 6:
                    l.adaptadorQuantMilhas();
                    break;

                case 7:
                    //Introduzir novos dados do teclado e escrever no ficheiro de texto
                    break;

                case 8:
                    do {
                        menuVisualizar();
                        op2 = v.validarByte((byte) 1, (byte) 7, "Escolha uma opção.", "Opção Inválida!");

                        switch (op2) {
                            case 1:
                                l.adaptadorVisualizarTodos();
                                break;

                            case 2:
                                l.adaptadorVisualizarCarro();
                                break;

                            case 3:
                                l.adaptadorVisualizarComboio();
                                break;

                            case 4:
                                l.adaptadorVisualizarMar();
                                break;

                            case 5:
                                l.adaptadorVisualizarAereo();
                                break;

                            case 6:
                                l.adaptadorVooLongo();
                                break;
                        }
                    }while (op2!=7);
                    break;
            }

        }while (op!=9);

    }



    public void menuPrincipal(){
        System.out.println("\n----------------------------------------------");
        System.out.println("                      MENU                   ");
        System.out.println("----------------------------------------------");
        System.out.println("1.ler dados do ficheiro de texto");
        System.out.println("2.Escrever os dados no ficheiro de Objectos.");
        System.out.println("3.Ler os dados do ficheiro de Objectos.");
        System.out.println("4.Pesquisar um determinado Bilhete pelo código");
        System.out.println("5.Remover um determinado Bilhete através do código");
        System.out.println("6.Alterar a quantidade de milhas de um bilhete aéreo recebendo o código do bilhete");
        System.out.println("7.Introduzir novos dados do teclado e escrever no ficheiro de texto");
        System.out.println("8.Visualizar");
        System.out.println("9.Sair");
        System.out.println("----------------------------------------------");
    }

    public void menuVisualizar(){
        System.out.println("----------------------------------------------");
        System.out.println("                  VISUALIZAR                ");
        System.out.println("----------------------------------------------");
        System.out.println("1.Visualizar uma tabela contendo todos os dados");
        System.out.println("2.Visualizar Bilhete - Carro");
        System.out.println("3.Visualizar Bilhete - Comboio");
        System.out.println("4.Visualizar Bilhete - Mar");
        System.out.println("5.Visualizar Bilhete - Aereo");
        System.out.println("6.Visualizar o voo mais longo de todos.");
        System.out.println("7.Voltar");
        System.out.println("----------------------------------------------");
    }

}
