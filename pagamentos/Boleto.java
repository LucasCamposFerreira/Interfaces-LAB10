public class Boleto implements MetodoPagamento {

    @Override
    public boolean pagar(double valor) {
        System.out.println("Gerando boleto...");
        String codigo = "34191.12345 67890.123456 78901.234567 1 234500000" + (int)valor;
        System.out.println("Código do boleto: " + codigo);
        System.out.println("Pagamento pendente. Aguarde a compensação.");
        return true;
    }

    @Override
    public String getNome() {
        return "Boleto Bancário";
    }
}
