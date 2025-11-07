public class CartaoCredito implements MetodoPagamento {

    private double limite = 1000; // limite fictício

    @Override
    public boolean pagar(double valor) {
        System.out.println("Processando pagamento com Cartão de Crédito...");

        if (valor <= limite) {
            limite -= valor;
            System.out.println("Pagamento aprovado! Novo limite: " + limite);
            return true;
        }

        System.out.println("Pagamento recusado! Limite insuficiente.");
        return false;
    }

    @Override
    public String getNome() {
        return "Cartão de Crédito";
    }
}
