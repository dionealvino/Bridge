
package bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author dione
 */
public class GeradorArquivoTXT implements GeradorDeArquivo{

    @Override
    public void criarArquivo(String dados) {
        try{
            PrintStream arquivo = new PrintStream("arquivo.txt");
            arquivo.println(dados);
            arquivo.close();
            System.out.println("Arquivo gerado com sucesso");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
    

