package leitorArquivos;

public class LeitorCSV implements LeitorArquivo {

    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo CSV: " + caminhoArquivo);
        System.out.println("Coluna1, Coluna2, Coluna3");
        System.out.println("A, B, C");
    }

    @Override
    public String getFormato() {
        return "CSV";
    }
}
