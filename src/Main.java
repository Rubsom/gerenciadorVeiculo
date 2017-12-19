import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Mostrar botao de fechar o sistema
        frame.setSize(500,450); // Tamanho da janela
        frame.setLocation(300, 200); // Centralizar Tela

        //Menus
        JMenu  menuCliente = new JMenu("Cliente");
        JMenu menuVenda = new JMenu("Venda");
        JMenuBar barraMenu = new JMenuBar();

        //Itens Menu Cliente
        JMenuItem itemCadastroCliente = new JMenuItem("Cadastrar");


        //Cadastro Cliente
        Cliente cliente = new Cliente();
        cliente.setNome(JOptionPane.showInputDialog("Informe o nome do Locatário: "));
        cliente.setCpf(JOptionPane.showInputDialog("Informe o CPF do Locatário: "));
        cliente.setEndereco(JOptionPane.showInputDialog("Informe o Endereço do Locatário"));
        cliente.setEndereco(JOptionPane.showInputDialog("Informe o Telefone do Locatário"));
        cliente.imprimeLocatario();





        frame.setVisible(true); // Tornar Painel visível



    }
}
