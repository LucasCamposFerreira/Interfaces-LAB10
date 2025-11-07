package leitorArquivos;

public class LeitorJSON implements LeitorArquivo {

    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo JSON: " + caminhoArquivo);
        System.out.println("{ \"nome\": \"Lucas\", \"idade\": 25 }");
    }

    @Override
    public String getFormato() {
        return "JSON";
    }
}
