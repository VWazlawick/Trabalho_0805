/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.atv_08_05;

import br.unipar.atv_08_05.models.Pessoa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author victo
 */
public class Atv_08_05 {

    public static void main(String[] args) throws IOException {
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
        String arquivo2 = "C:\\pessoa.csv";
        
        try (BufferedReader bf = new BufferedReader(new FileReader(arquivo2))){
                String linha;
                List<Pessoa> pessoaList = new ArrayList<>();
                
                bf.readLine();
                while((linha = bf.readLine()) != null){
                    String[] campos = linha.split(",");
                    int id = 0;
                    Pessoa pessoa = new Pessoa();
                    
                     pessoa.setId(id++);
                    pessoa.setNome(campos[0]);
                    pessoa.setIdade(Integer.parseInt(campos[1]));
                    pessoa.setCpf(campos[2]);
                    pessoa.setRg(campos[3]);

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(campos[4], formatter);
                    pessoa.setDtNasc(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
                    pessoa.setSexo(campos[5]);
                    pessoa.setSigno(campos[6]);
                    pessoa.setNmMae(campos[7]);
                    pessoa.setNmPai(campos[8]);
                    pessoa.setDsEmail(campos[9]);
                    pessoa.setSenha(campos[10]);
                    pessoa.setCep(campos[11]);
                    pessoa.setEndereco(campos[12]);
                    pessoa.setNrCasa(campos[13]);
                    pessoa.setBairro(campos[14]);
                    pessoa.setCidade(campos[15]);
                    pessoa.setEstado(campos[16]);
                    pessoa.setTelefone(campos[17]);
                    pessoa.setCelular(campos[18]);
                    pessoa.setAltura(Double.valueOf(campos[19]));
                    pessoa.setPeso(Double.valueOf(campos[20]));
                    pessoa.setTpSanguineo(campos[21]);
                    pessoa.setCor(campos[22]);
                    
                    pessoaList.add(pessoa);
                }
                    for(Pessoa pessoa: pessoaList){
                    System.out.println(pessoa.toString());
                }
            }catch (IOException ex) {
                System.out.println("Algo deu errado - " + ex.getMessage());
            }
            
}
    
}

    

