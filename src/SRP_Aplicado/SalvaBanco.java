package SRP_Aplicado;

public class SalvaBanco {

    public void salvar(Pedido pedido, double valorFinal) {
        System.out.println("Pedido" + pedido.getId() + "salvo no banco. Valor final: R$" + valorFinal);
    }
}
