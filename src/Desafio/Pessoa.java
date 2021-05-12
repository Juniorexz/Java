package Desafio;

public class Pessoa {
  
    String nome; 
    double peso;
          
   Pessoa(String nome, double peso) {
      //Pessoa o construtor
        this.nome = nome;
        this.peso = peso;  
    
      }
    //metodo comer
    //+= atribuicao aditiva
    void comer(Comida comida) {
      if(comida != null) {
        this.peso += comida.peso;
        //assim acrescento peso e a pessoa vai engordar
      }
    }
     
    String apresentar() {
      return "Ola eu sou o " + nome + " e tenho " + peso + " Kgs.";

    
    }    
   }

