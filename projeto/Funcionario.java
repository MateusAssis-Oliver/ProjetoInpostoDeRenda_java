package pojetinho;
public class Funcionario {

  /* Atributos da Class Funcionario */
    private int id;
    private String nome;
    private double salarioFuncionario;
		private double salarioDesconto;
		private double salarioDescontoINSS;
		private double salarioDescontoIR;
    private double tetoSalarialMinimoInss = 1212;
    private double tetoSalarialMedioInss = 3500;
    private double tetoSalarialMinimoIR = 2500;
    private double tetoSalarialMedioIR  = 5000;

    public Funcionario (int id, String nome, double salario){
  
      setNome(nome);
      setId(id);
      setSalarioFuncionario(salario);
    }

	public double getSalarioDescont(){
		return this.salarioDesconto;
	}
   /* Metodos getts e setts */
/*-------------------------INSS----------------------------*/

	public double getSalarioDescontoINSS(){
		return this.salarioDescontoINSS;
	}

	public double getSalarioDescontoIR(){
		return this.salarioDescontoIR;
	}

  private double getTetoSalarialMinimoInss(){
    return tetoSalarialMinimoInss;
  }

  private double getTetoSalarialMedioInss(){
    return tetoSalarialMedioInss;
  }

/*  ----------------------IR-------------------------------------------------*/

  public double getTetoSalarialMinimoIR(){
    return tetoSalarialMinimoIR;
  }
	
  public double getTetoSalarialMedioIR(){
    return tetoSalarialMedioIR;
  }

  public double getSalarioFuncionario() {
    return salarioFuncionario;
  }

  private void setSalarioFuncionario(double salarioFuncionario) {
		
    this.salarioFuncionario = salarioFuncionario;
		this.salarioDescontoINSS = impostoInss(salarioFuncionario);
		this.salarioDescontoIR = impostoIR(salarioFuncionario);
		this.salarioDesconto = impostoIR(impostoInss(salarioFuncionario));    
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
      "\nid:" 						+ getId() 	+
      "\nNome:" 					+ getNome() +
      "\nSalario base:" 	+ getSalarioFuncionario());
    }

  /* METODO SPARA CALCULAR IMPOSTO*/
public double impostoInss( double salario) {
  
if (salario <= getTetoSalarialMinimoInss()) {

return ( ( salario - salario * 0.075) );
	
	
}else if (salario > getTetoSalarialMinimoInss() && salario  <= getTetoSalarialMedioInss()){

return (salario - ( salario * 0.09 ) );

} else { return  ( salario - (salario * 0.12) );}
	
}


public double impostoIR(double salario){

if (salario > getTetoSalarialMinimoIR() && salario <= getTetoSalarialMedioIR()) {

return  ( salario - (salario * 0.15)) ;
	
	}else if( salario > getTetoSalarialMedioIR() ){
return  (salario - ( salario * 0.275) );  

  }
	return 0;
    }

}