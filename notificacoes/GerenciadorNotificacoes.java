package notificacoes;

public class GerenciadorNotificacoes {

    public void enviar(Notificavel canal, String mensagem) {
        canal.enviarNotificacao(mensagem);
    }
}
