public class Operadores {
    public static void main(String[] arg) throws Exception {
        String nomeUm = "Gisele";
        String nomeDois = new String ("Gisele");

        System.out.println(nomeUm == nomeDois);
           
    int numero1 = 1;
    int numero2 = 2;
    boolean simNao = numero1 == numero2;
        if (numero1 == numero2) {
            System.out.println("A nossa condição é verdadeira!");
        }
    System.out.println("numero 1 é igual a numero 2 ? " + simNao);

    simNao = numero1 > numero2;
    System.out.println("numero 1 é maior que o numero 2 ? " + simNao);
    }
}