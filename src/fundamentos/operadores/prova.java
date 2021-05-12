package fundamentos.operadores;


public class prova { 
 
  static String nome; 
  static String sobrenome; 
  static String nomeCompleto; 
 
  public static void main(String[] args) { 
 
    registrarNome("Carlos"); 
    registrarSobrenome("Junior"); 
    registrarNomeCompleto(nome + " " + sobrenome); 
 
    System.out.println("imprimirNome: "); 
    imprimirNome(nome); 
    System.out.println("imprimirSobrenome: "); 
    imprimirSobrenome(sobrenome); 
    System.out.println("imprimirNomeCompleto: "); 
    imprimirNomeCompleto(nomeCompleto); 
 
    registrarNomeCompleto(nome , sobrenome); 
    System.out.println("imprimirNomeCompleto 2: "); 
    imprimirNomeCompleto(nomeCompleto); 
 
  } 
 
  public static void registrarNome(String novoNome) { 
    nome = novoNome; 
  } 
 
  public static void registrarSobrenome(String novoSobrenome) { 
    sobrenome = novoSobrenome; 
  } 
 
  public static void registrarNomeCompleto(String novoNomeCompleto) { 
    nomeCompleto = novoNomeCompleto; 
  } 
 
  public static void registrarNomeCompleto(String nome, String sobrenome) { 
    nomeCompleto = nome + " " + sobrenome; 
  } 
 
  public static void imprimirNomeCompleto(String nomeCompleto) { 
    System.out.println(nomeCompleto); 
  } 
 
  public static void imprimirNome(String nome) { 
    System.out.println(nome); 
  } 
 
  public static void imprimirSobrenome(String sobrenome) { 
    System.out.println(sobrenome); 
  } 
}