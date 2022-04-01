import java.util.ArrayList;
public class Main {

  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    Menu menu = new Menu();
      
    ArrayList<Funcionario> colaboradorList = new ArrayList<Funcionario>();

    //String parametrParada;
    int opc;

    while(true){
      
      Menu menuSystema = new Menu();
      while(true){
      
        /*Imprementar verificação de codigo, para validar o codigo       
         digitado*/
        menuSystema.showMenu();
        opc = menuSystema.getOpc();
        break ;
      }

      switch (opc) {

      case 1:{

        menu.clearMenu();
        Cadastro cadastro = new Cadastro();
        
        System.out.println("Cadastrar Funcionario");
         
        colaboradorList.add(cadastro.startCadastro());
        
        break;
      }
      case 2:{
        System.out.println("Lista de Funcionarios");
        break;
      }
      case 3:{
        System.out.println("Deletar  Funcionarios");
        break;
      }
      case 4:{
        System.out.println("Folha de Pagamneto");
        break;
      }
      default:{
        break;
      }
    
      }
      if(opc == 00){
          break;  
        }
        
    }


    System.out.println(
        "id:"   + colaboradorList.get(0).getId()
     +"\nNome:" + colaboradorList.get(0).getNome()
     +"\nSalario:R$ "+colaboradorList.get(0).getSalarioFuncionario()
     +"\nSalario Deconto Inss:R$" + colaboradorList.get(0).getSalarioDesconto());
    
        
  }

}
