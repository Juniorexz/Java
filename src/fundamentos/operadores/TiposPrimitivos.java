package fundamentos.operadores;

public class TiposPrimitivos {

  public static void main(String[] args) {
    //Dados do funcionario
    
    //Tipos inteiros
    byte anosDeEmpresa = 23;
    short numeroDeVoos = 542;
      int id = 56789;
      long pontosAcumulados = 3_234_845_223L;
      
      
      //Tipos n�mericos reais
      float salario = 11_445.44F;
      double vendasAcumuladas = 2_991_797_103.01;
      
      //Tipos booleano
      boolean estaDeFerias = false;// true
      
      //Tipo caractere
      char status = 'A'; // ativo
      
      // Dias de empresa
      System.out.println(anosDeEmpresa * 365);
      
      // Quantidade de viagens
      System.out.println(numeroDeVoos / 2);
      
      // Pontos por real
      System.out.println(pontosAcumulados / vendasAcumuladas);
     
      System.out.println(id + ": ganha ->" + salario);
      System.out.println("F�rias" + estaDeFerias);
      System.out.println("Status:" +status);
  }

}
