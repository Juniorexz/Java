package classe;

public class ProdutoTeste {

  public static void main(String[] args) {

    // Se eu apagar // e notebook o produto vai funcionar,desta maneira esa no
    // construtor

    Produto p1 = new Produto("Notebook", 4356.89, 0.25);
    //Produto p1 = new Produto("Notebook", 4356.89);
    p1.preco = 4356.89;
    p1.desconto = 0.25;
    
    
    var p2 = new Produto();
    p2.nome = "Caneta Preta";
    p2.preco = 12.56;
    p2.desconto = 0.29;
    
    //Produto.desconto = 050;

    //System.out.println(p1.nome + "" + p1.precoComDesconto());
    //System.out.println(p1.nome + "" + p2.precoComDesconto());

    System.out.println(p1.nome);
    System.out.println(p2.nome);

    double precoFinal1 = p1.precoComDesconto(0);
    double precoFinal2 = p2.precoComDesconto(0.1);
    double mediaCarrinho = (precoFinal1 - precoFinal2) / 2;

    System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho);

  }

}
