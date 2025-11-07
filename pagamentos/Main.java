public class Main {
    public static void main(String[] args) {

        LojaVirtual loja = new LojaVirtual();

        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento paypal = new PayPal();
        MetodoPagamento boleto = new Boleto();

        loja.processarCompra(200, cartao);
        loja.processarCompra(80, paypal);
        loja.processarCompra(500, boleto);
    }
}
