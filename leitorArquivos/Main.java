package leitorArquivos;

public class Main {
    public static void main(String[] args) {

        ProcessadorArquivos p = new ProcessadorArquivos();

        LeitorArquivo txt = new LeitorTXT();
        LeitorArquivo csv = new LeitorCSV();
        LeitorArquivo json = new LeitorJSON();

        p.processar(txt, "documento.txt");
        p.processar(csv, "planilha.csv");
        p.processar(json, "dados.json");
    }
}

