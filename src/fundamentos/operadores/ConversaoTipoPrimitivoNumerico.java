package fundamentos.operadores;

public class ConversaoTipoPrimitivoNumerico {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    //implicita
    double a = 1;
    System.out.println(a);
    
    //conversao explicita(Ciente que vai perder informacao)Casting
    float b = (float)1.12345;
    System.out.println(b);
    
    int c = 340;
    byte d = (byte) c;
    System.out.println(d);
    
    double e = 1.9999999;
    int f = (int)e;
    System.out.println(f);
    
  }

}
