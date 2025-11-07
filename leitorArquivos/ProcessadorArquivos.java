package leitorArquivos;

public class ProcessadorArquivos {

    public void processar(LeitorArquivo leitor, String caminho) {
        System.out.println("Formato detectado: " + leitor.getFormato());
        leitor.lerArquivo(caminho);
        System.out.println();
    }
}
