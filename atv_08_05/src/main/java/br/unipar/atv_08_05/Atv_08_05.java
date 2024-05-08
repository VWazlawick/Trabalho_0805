/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.atv_08_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author victo
 */
public class Atv_08_05 {

    public static void main(String[] args) {
        File arquivo = new File("C:\\pasta");
        File bloco = new File(arquivo.getAbsolutePath() + "\\arquivo.txt");
        
        if(arquivo.exists()){
            System.out.println("Arquivo existente");
        }else{
            System.out.println("Arquivo inexistente");
                arquivo.mkdir();
                System.out.println("Arquivo criado");
                
                if(bloco.exists()){
                    System.out.println("arquivo já existente");
                }
                else{
                    try {
                        bloco.createNewFile();
                        System.out.println("Arquivo de texto criado");
                    } catch (IOException ex) {
                        System.out.println("Erro ao gerar arquivo " + ex.getMessage());
                    }
                }

        }
        
        if(bloco.exists()){
            try(FileWriter escritor = new FileWriter(bloco);
                    BufferedWriter buffer = new BufferedWriter(escritor))
                {
                    for(int i = 0; i<=10; i++){
                        buffer.write(i + "x" + 9 + "=" + (i*9) + "\n");
                    }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        
        if(bloco.exists()){
            try(FileReader leitor = new FileReader(bloco);
                    BufferedReader buffer = new BufferedReader(leitor)) {
                String linha;
                while((linha=buffer.readLine())!=null){
                    System.out.println(linha);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        if(bloco.exists()){
            try {
                bloco.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
