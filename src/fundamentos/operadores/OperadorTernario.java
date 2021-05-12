package fundamentos.operadores;

public class OperadorTernario {

  public static void main(String[] args) {
    //Atribuicao condicional
    
    double media = 4.6;
    //String resultadoParcial 
    String resultadoFinal = media >= 7.0 ?
        "aprovado" : media >= 5.0 ? "em recuperacao" :  "reprovado"; 
        
     //String resultadoFinal = media >= 7.0 ?
       // "aprovado."em recuperacao."; 

    System.out.println("O aluno esta " + resultadoFinal);
    
    double nota = 9.9;
    boolean bomComportamento = false;
    boolean passouPorMedia = nota >= 7;
    boolean temDesconto = bomComportamento && passouPorMedia;
    String resultado = temDesconto ? "Sim" : "Nao.";
    
    
    System.out.printf("Tem desconto? %s",  resultado);
  }

}
