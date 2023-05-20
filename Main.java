public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = FabricaVeiculos.criarVeiculo("carro");
        Veiculo veiculo2 = FabricaVeiculos.criarVeiculo("moto");

        veiculo1.acelerar();
        veiculo1.frear();

        veiculo2.acelerar();
        veiculo2.frear();
    }
}