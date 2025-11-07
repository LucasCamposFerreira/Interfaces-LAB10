public class LojaVirtual {

    public void processarCompra(double valor, MetodoPagamento metodo) {
        System.out.println("=== PROCESSANDO COMPRA ===");
        System.out.println("Método: " + metodo.getNome());

        boolean sucesso = metodo.pagar(valor);

        if (sucesso)
            System.out.println("Compra concluída com sucesso!");
        else
            System.out.println("Falha no pagamento.");

        System.out.println("-----------------------------\n");
    }
}
