public class Funcionario {

  /* Atributos da Class Funcionario */
    private int id;
    private String nome;
    private double salarioFuncionario;
    private double salarioDesconto;

    public Funcionario (int id, String nome, double salario){
  
      setNome(nome);
      setId(id);
      setSalarioFuncionario(salario);
    }
    
    /* Metodos getts e setts */

    private void setSalarioDesconto(double salarioDesconto) {
        this.salarioDesconto = salarioDesconto;
    }

    public double getSalarioDesconto() {
        return salarioDesconto;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    private void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
        
        impostoInss();
        impostoIR();
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void showFuncionario() {

        System.out.println(
                ">>Funcionario<<\n" +
                        "\nid:" + getId() +
                        "\nNome:" + getNome() +
                        "\nSalario base:" + getSalarioFuncionario());
    }

    public void impostoInss() {

        if (getSalarioFuncionario() <= 1212) {

            setSalarioDesconto(getSalarioFuncionario() - getSalarioFuncionario() * 0.075);
            System.out.print("desconto de 75%");
        } else if (getSalarioFuncionario() > 1212 && getSalarioFuncionario() <= 3500) {

            setSalarioDesconto(getSalarioFuncionario() - getSalarioFuncionario() * 0.09);
            System.out.print("desconto de 9%");

        } else {
            setSalarioDesconto(getSalarioFuncionario() - getSalarioFuncionario() * 0.12);
            System.out.print("desconto de 12%");
        }

    }

    public void impostoIR() {

        if (getSalarioFuncionario() >= 2500 && getSalarioFuncionario() <= 5000) {

            System.out.print("desconto de 15%");
            setSalarioDesconto(getSalarioDesconto() - (getSalarioFuncionario() * 0.15));

        }else if(getSalarioFuncionario() > 5000) {
            System.out.print("desconto de 12%");
            setSalarioDesconto(getSalarioDesconto() - (getSalarioFuncionario() * 0.12) );
        }
    }

}
