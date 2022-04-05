package pojetinho;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        ArrayList<Funcionario> colaboradorList = new ArrayList<>();
        Menu menuSystema = new Menu();

        /*  Limpar o console ao iniciar o plograma*/
        System.out.print("\033[H\033[2J");

        int opc;
        int criterioDeParada;

        while (true) {

            while (true) {

                /*
                    Imprementar verificação de codigo, para validar o codigo       
                    digitado
                */
                menuSystema.clearMenu();
                menuSystema.showMenu();
                opc = menuSystema.getOpc();
                break;
            }

            switch (opc) {

                /* Cadastrar o colaborador  */
                case 1: {

                    menuSystema.clearMenu();
                    Cadastro cadastro = new Cadastro();

                    System.out.println("Cadastrar Funcionario");

                    colaboradorList.add(cadastro.startCadastro());

                    break;
                }
                /*Liistar os colaboradoes que estão cadastrados no sistema  */
                case 2: {
                    System.out.println("Lista de Funcionarios");
                    break;
                }

                /*Deletar o funcionario pelo id digitado  */
                case 3: {
                    System.out.println("Deletar  Funcionarios");
                    break;
                }
                /*Gerar um relatorio completo do estado atual dos colaborador  */
                case 4: {

                    menuSystema.clearMenu();
                    System.out.println("Folha de Pagamneto");

                    for (int i = 0; i < colaboradorList.size(); i++) {

                        System.out.println(">>\t\tFuncionarios<<\n"
                                + "id:" + colaboradorList.get(i).getId()
                                + "\nNome:" + colaboradorList.get(i).getNome()
                                + "\nSalario:R$ " + colaboradorList.get(i).getSalarioFuncionario()
                                + "\nDeconto Inss:R$"
                                + colaboradorList.get(i).getSalarioDescontoINSS()
                                + "\nSalario Deconto Ir:R$"
                                + colaboradorList.get(i).getSalarioDescontoIR()
                                + "\n\n");
                    }

                    System.out.println("Para sair digit ( 1 )");
                    criterioDeParada = es.nextInt();
                    if (criterioDeParada == 1) {
                        break;
                    }

                }
                case 5: {
                    int id;

                    do {
                        menuSystema.clearMenu();
                        System.out.println(">>\t\tINSS Funcionarios<<\n");
                        System.out.println("Digite o Id Do funcionario");
                        id = es.nextInt();

                        for (Funcionario i : colaboradorList) {
                            if (i.getId() == id) {
                                System.out.println(
                                        "COLABORADOR : " + i.getNome()
                                        + "\nID: " + i.getId()
                                        + "\nSalario Desconto INSS: " + i.getSalarioDescontoINSS());
                            }
                        }

                        System.out.println("Deseja fazer uma nova pesquisa ? (1 - S)/(0 - N) ");
                        criterioDeParada = es.nextInt();

                    } while (criterioDeParada != 0);

                    break;
                }
                case 6: {
                    int id;

                    do {
                        menuSystema.clearMenu();
                        System.out.println(">>\t\tINSS Funcionarios<<\n");
                        System.out.println("Digite o Id Do funcionario");
                        id = es.nextInt();

                        for (Funcionario i : colaboradorList) {
                            if (i.getId() == id) {
                                System.out.println(
                                        "COLABORADOR : " + i.getNome()
                                        + "\nID : " + i.getId()
                                        + "\nSalario : " + i.getSalarioFuncionario()
                                        + "\nSalario Desconto IR : " + i.getSalarioDescontoINSS());
                            }
                        }

                        System.out.println("Deseja fazer uma nova pesquisa ? (1 - S)/(0 - N) ");
                        criterioDeParada = es.nextInt();

                    } while (criterioDeParada != 0);

                    break;
                }
                default: {
                    break;
                }

            }
            if (opc == 00) {
                break;
            }

        }

    }

}
