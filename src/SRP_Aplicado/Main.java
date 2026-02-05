package SRP_Aplicado;

public class Main {
    public static void main(String[] args) {

        ServicoPedido servico = new ServicoPedido();
        Pedido pedido = new Pedido("ID-1", 600.00, 5, "gabrielli@gmail.com");

        try {
            double total = servico.processarPedido(pedido);
            System.out.println("O pedido foi processado - Total: R$" + total);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
