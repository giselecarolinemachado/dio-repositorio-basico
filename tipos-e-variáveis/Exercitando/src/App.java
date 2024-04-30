public class App {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarTv = new SmartTv();
        
        System.out.println("TV ligada ? " + smarTv.ligada);
        System.out.println("Canal atual ? " + smarTv.canal);
        System.out.println("Volume atual : " + smarTv.volume);

        smarTv.ligar();
        System.out.println("Novo status : " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("Novo status : " + smarTv.ligada);

        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        System.out.println("Novo status : " + smarTv.volume);


    }
}
