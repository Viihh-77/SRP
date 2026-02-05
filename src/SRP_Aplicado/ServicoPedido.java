package SRP_Aplicado;

public class ServicoPedido {

    private ValidaEstoque validador = new ValidaEstoque();
    private CalculaFreteImposto calculadora = new CalculaFreteImposto();
    private SalvaBanco salvamento = new SalvaBanco();
    private EnviaEmail email = new EnviaEmail();

    public double processarPedido(Pedido pedido) throws Exception {

        validador.validar(pedido);

        double frete = calculadora.calcularFrete(pedido);
        double impostos = calculadora.calcularImposto(pedido);
        double valorFinal = pedido.getValorTotal() + frete + impostos;

        pedido.setPago(true);

        salvamento.salvar(pedido, valorFinal);

        email.enviarEmail(pedido.getEmailCliente(), pedido.getId());

        return valorFinal;
    }
}
