/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author dione
 */
public class GeradorArquivoPDF implements GeradorDeArquivo{

    @Override
    public void criarArquivo(String dados) {
        System.out.println("Método gerador de PDF");
    }
    
}
