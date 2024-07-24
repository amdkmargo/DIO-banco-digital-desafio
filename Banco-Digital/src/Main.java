public class Main {
    public static void main(String[] args) {


        Cliente amanda = new Cliente();
        amanda.setNome("Amanda Camargo");

        IConta cc = new ContaCorrente(amanda);

        Banco b = new Banco("Banco NuBank");
        b.setContas(cc);


        b.imprimirInfosBank();
        cc.imprimirExtrato();

    }
}