public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Música parada.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    @Override
    public void terminarChamada() {
        System.out.println("Chamada terminada.");
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para " + url + "...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void adicionarAosFavoritos(String url) {
        System.out.println("Adicionando " + url + " aos favoritos...");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        meuIphone.tocar();
        meuIphone.fazerChamada("123456789");
        meuIphone.navegar("http://www.example.com");
    }
}
