package fundamentos.operadores;

public class Wrappers {

  public static void main(String[] args) {
    //Tudo em Java seria objeto menos os tipos primitivos,
    //Wrappers seriam a objetos dos tipos primitivos
    //Wrapper - Classe que acaba envolvendo outro
    //tipos primitivos = int,boolean,string,real
 
    
    //byte
    Byte b = 100;
    Short s = 1000;
 
    //Integer.parseInt(entrada.next());
    Integer i = 10000; //int
    Long l = 10000L;

    System.out.println(b.byteValue());
    System.out.println(s.toString());
    System.out.println(i * 3);
    System.out.println(l / 3);
    
    Float f = 123.0F;
    System.out.println(f);
    
    Double d = 1234.5678;
    System.out.println(d);
    
    Boolean bo = Boolean.parseBoolean("true");
    System.out.println(bo);
    System.out.println(bo.toString().toUpperCase());
    
    Character c = '#'; //char
    System.out.println(c + "...");
    
    
    
  }

}
