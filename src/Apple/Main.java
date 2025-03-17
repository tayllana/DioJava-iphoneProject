package Apple;

public class Main {
    public static void main(String[] args) {
        Iphone meuiPhone = new Iphone();

        // Usando funcionalidades do Reprodutor Musical
        meuiPhone.selecionarMusica("Bohemian Rhapsody");
        meuiPhone.tocar();
        meuiPhone.pausar();

        // Usando funcionalidades do Aparelho Telefônico
        meuiPhone.ligar("123456789");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        // Usando funcionalidades do Navegador na Internet
        meuiPhone.exibirPagina("www.exemplo.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
