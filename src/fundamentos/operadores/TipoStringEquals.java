package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

  public static void main(String[] args) {
        System.out.println("2" == "2");
        
        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));
        //Equals vai comparar o conteudo
        //trim remove os espacos em branco
        //De preferencia equals ao indes de (==)
        //next tira os espacos em branco o nextLine nao
        
        Scanner  entrada = new Scanner(System.in);
        
        String s2 = entrada.next();
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));

        entrada.close();
        
  }

}
