package classe;

public class Data {
  // Assim eu reservo as variaveis e as deixo para ser usadas em outra classe(DataTeste)
  int dia;
  int mes;
  int ano;
  //char[] obterDataFormatada;
  String obterDataFormatada;
  //private char[] obterDataFormatada;
  //Se os dois construtores tiverem o mesmo nome ,assinatura e mesmo tipo de parametro(ex:chamando int)
  //this referenciar o objeto que esta sendo criado naquele momento,metodo static esta associado a classe e o this a instancia
  //onde nao tiver static pode associar o this 
  //Variavel fora do metodo dentro da classe ,pode ser de instancia,classe,estatico,atributo estatico, e atributo de instancia
  //Atributo de instancia e sinonimo de objeto,atributo de objeto
  
  
  Data() {
    dia = 1;
    mes = 1;
    ano = 1970;
    //this(1,1,1979);
  }

  Data(int diaInicial, int mesInicial, int anoInicial) {
    dia = diaInicial;
    mes = mesInicial;
    ano = anoInicial;
  }
  
  
  /*Data(int dia, int mes, int ano)
   * this.dia = dia;
   * this.mes = mes;
   *  this.ano = ano;
   *  Data(int diaInicial, int mesInicial, int anoInicial) {
   this.dia = diaInicial;
   this.mes = mesInicial;
   this.ano = anoInicial;
   this(1,1,1970); usando como um construtor
   ou 
  }
   * 
   */
  
  

  String obterDataFormatada() {
    return String.format("%d/%d/%d", dia, mes, ano);
    //return String.format("%d/%d/%d",this.dia, mes, ano);

  }

  void imprimirDataFormatada() {
    System.out.println(obterDataFormatada());
  }
}
