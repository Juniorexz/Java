package fundamentos.operadores;

public class Pessoa {
  
  private String nome; 
  private String sobrenome; 
  private String nomeCompleto;

  

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
    
    System.out.println(nome);
    System.out.println(sobrenome);
    System.out.println(nomeCompleto);
    
    
  }
  }