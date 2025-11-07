package leitorArquivos;

public class LeitorTXT implements LeitorArquivo {

    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo TXT: " + caminhoArquivo);
        System.out.println("Conteúdo simulado...");
    }

    @Override
    public String getFormato() {
        return "TXT";
    }
}
