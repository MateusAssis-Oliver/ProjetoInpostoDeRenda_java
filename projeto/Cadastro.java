
package pojetinho;
import java.util.Scanner;
public class Cadastro {

  /* Instancioando a class Scarne para poder ler o que vai ser Digitado */
  Scanner sc = new Scanner(System.in);

  private String nome;
  private double salario;
  private int id;

  public Funcionario startCadastro() {

    /* Imput do id do Funcioanrio */
    System.out.print("\nDigite o id do Usuario: ");
    setId(sc.nextInt());

    /* Imput do Nome do Funcioanrio */
    System.out.print("\nDigite o Nome do Usuario: ");
    setNome(sc.next());

    /* Imput do Salario do Funcionario */
    System.out.print("\nDigite o Salario do Usuario: ");
    setSalario(sc.nextDouble());

    /*
     * Instanciando a class funcionario e atribundo os valores adquiridos nos imput
     */
    Funcionario colaborador = new Funcionario(getId(), getNome(), getSalario());

    /*
     * Retorna o colaborador com as caracteristicas inseridas e os metodos que são
     * erdados da class Funcionarios
     */
    return colaborador;

  }

  /* Metodos getts e sets */

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }
}