package notificacoes;

public class Main {
    public static void main(String[] args) {

        GerenciadorNotificacoes g = new GerenciadorNotificacoes();

        Notificavel email = new EmailNotificacao();
        Notificavel sms = new SMSNotificacao();
        Notificavel push = new PushNotificacao();

        g.enviar(email, "Seu pedido foi enviado!");
        g.enviar(sms, "Código de verificação: 123456");
        g.enviar(push, "Você recebeu uma nova mensagem.");
    }
}
