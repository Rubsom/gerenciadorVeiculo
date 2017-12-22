import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        boolean continuar = true;
        do {
            Veiculo veiculo = obterVeiculo();
            Venda venda = new Venda(veiculo);
            venda.vender();
            String mensagem = "O valor pago foi %s, com desconto de %s";
            String continuarCalculando = JOptionPane.showInputDialog("Deseja continuar vendendo? S(Sim) N(Não). ");
            continuar = continuarCalculando.toUpperCase().equals("S");
        } while (continuar);

        //Itens Menu Cliente


        //Cadastro  Veículo
        //Veiculo veiculo = new Veiculo();

        //veiculo.setFabricante(JOptionPane.showInputDialog("Informe o fabricante: "));
       //veiculo.setModelo(JOptionPane.showInputDialog("Informe o modelo: "));
        //veiculo.setAno(JOptionPane.showInputDialog("Informe o ano: "));

        //Imprime Veiculo
        //veiculo.imprimeVeiculo();


        //Cadastro Cliente
        Cliente cliente = new Cliente();

        cliente.setNome(JOptionPane.showInputDialog("Informe o nome do Locatário: "));
        cliente.setCpf(JOptionPane.showInputDialog("Informe o CPF do Locatário: "));
        cliente.setEndereco(JOptionPane.showInputDialog("Informe o Endereço do Locatário"));
        cliente.setTelefone(JOptionPane.showInputDialog("Informe o Telefone do Locatário"));

        //imprime Cliente
        cliente.imprimeLocatario();

        //Obter Veiculo

        private Veiculo obterVeiculo() {

            String fabricanteStr = JOptionPane.showInputDialog("Informe o Fabricante:");
            String modeloStr = JOptionPane.showInputDialog("Informe o Modelo:");
            String anoStr = JOptionPane.showInputDialog("Informe o Ano:");
            String valorStr = JOptionPane.showInputDialog("Informe o Valor(R$): ");
            String fabricante = fabricanteStr;
            String modelo = modeloStr;
            Integer ano = Integer.parseInt(anoStr);
            Double valor = Double.parseDouble(valorStr);
            Veiculo veiculo = new Veiculo(fabricante, modelo, ano, valor);
            return veiculo;
        }

}
