package classe;

public class Produto {

  String nome;
  double preco;
  double desconto;
  //static double desconto = 0.25;


  Produto(String nomeInicial, double precoInicial, double descontoInicial) {
    nome = nomeInicial;
    preco = precoInicial;
    desconto = descontoInicial;

  }

  Produto(String nomeInicial) {
    nome = nomeInicial;
    // TRes maneiras de criar produto
  }
  
  Produto(){
    
  }


  Produto(String nomeInicial, double precoInicial) {
    nome = nomeInicial;
    preco = precoInicial;
  }


  double precoComDesconto() {
    return preco * (1 - desconto);
  }

  double precoComDesconto(double descontoDoGerente) {
    return preco * (1 - desconto + descontoDoGerente);
  }
}
