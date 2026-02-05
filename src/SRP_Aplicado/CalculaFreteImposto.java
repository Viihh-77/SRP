package SRP_Aplicado;

public class CalculaFreteImposto {

    public double calcularFrete(Pedido pedido) {
        if (pedido.getValorTotal() < 500.00) {
            return 50.00;
        }
        return 0.0;
    }

    public double calcularImposto(Pedido pedido) {
        return pedido.getValorTotal() * 0.15;
    }
}
