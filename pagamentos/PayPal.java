public class PayPal implements MetodoPagamento {

    @Override
    public boolean pagar(double valor) {
        System.out.println("Autenticando usuário no PayPal...");
        System.out.println("Transferindo: R$" + valor);
        System.out.println("Pagamento realizado com sucesso via PayPal!");
        return true;
    }

    @Override
    public String getNome() {
        return "PayPal";
    }
}
