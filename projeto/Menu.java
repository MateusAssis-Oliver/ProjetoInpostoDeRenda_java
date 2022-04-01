import java.util.Scanner;
public class Menu{
Scanner sc = new Scanner(System.in);
   
private int opc;

public void showMenu(){
  
System.out.println("\t\t\t\t>>MENU<<\n"
+ "\n>>Funcionarios<<\n"
+ "\n1 - Cadastra\n"
+ "2 - Lista\n"
+ "3 - Deletar\n"
+ "4 - Folha de Pagamento\n");

  System.out.println("00 - Exit System");
  opc = sc.nextInt(); 
};

   public int getOpc(){
    return opc;
  }
  public void clearMenu(){
    System.out.print("\033[H\033[2J");
  }  
}