package SRP_Aplicado;

public class salvaBanco {

    public void salvar(Pedido pedido, double valorFinal) {
        System.out.println("Pedido" + pedido.getId() + "salvo no banco. Valor final: R$" + valorFinal);
    }
}
