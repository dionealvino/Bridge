package bridge;

/**
 *
 * @author dione
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         GeradorArquivoTXT arquivoTxt = new GeradorArquivoTXT();
    Recibo recibo = new Recibo("Barbara", "Fernando", 200.00, arquivoTxt);
        recibo.geraArquivo();
    }
    }
    

