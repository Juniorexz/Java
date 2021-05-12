package classe;

public class DataTeste {

  public static void main(String[] args) {
    
    Data d1 = new Data();
    d1.ano = 2021;//a variavel foi modificada
    
    var d2 = new Data(31,12,2020);
    
    String dataFormatada1 = d1.obterDataFormatada();
    
    //System.out.printf("%d/%d%d",d1.dia,d1.mes,d1.ano);
    //System.out.printf("%d/%d%d",d2.dia,d2.mes,d2.ano);
    //System.out.println(d1.obterDataFormatada());
    //System.out.printf("%d/%d/%d",d2.dia, d2.mes, d2.ano);
    
    System.out.println(dataFormatada1);
    System.out.println(d2.obterDataFormatada());
    
    d1.imprimirDataFormatada();
    d2.imprimirDataFormatada();
    
  
    
  }

}
