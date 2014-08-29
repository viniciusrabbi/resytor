/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stopwords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class StopWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String msn = "Vou  do estudar que ; e respectiva esse pessoa na, de  modulo.";
        
        //Excluindo pontuação...
        msn = msn.replace(";", " ");
        msn = msn.replace(".", " ");
        msn = msn.replace(",", " ");
        
        //Excluindo pronomes artigos preposiçoes e conjuções...
        msn = msn.replaceAll(" e |esse| de |na| da | a ", " ");
        msn = msn.replaceAll(" que | do | no ", " ");
    
        
        //Excluindo acento gráfico...
        //msn = msn.replace(";", "");
        //msn = msn.replace("é","e");
        //msn = msn.replace("ó", "o");
        //msn = msn.replace("ô", "o");
        //msn = msn.replace("á","a");
        

        //utilizar caracter especial para quebrar as Strings e inserir no vetor ...
        String subStr[] = msn.split(" ");
        
        
        int cont = subStr.length;
        int cmp = 0;
        
        System.out.println("Nº Substring: " + cont);
        System.out.println(msn);

        while(cmp < cont){
            
            System.out.println(subStr[cmp]);
            cmp=cmp+1;
        }
        
        System.out.println("-----------Palavras sem stopwords-----------------");
        cmp=0;
        
        
        LinkedList lista = new LinkedList();
        
        //Inserindo valores na lista sem espaços em branco ... 
        while(cmp < cont){
            
          if(!subStr[cmp].equals(""))
            lista.add(subStr[cmp]);
                    
            cmp=cmp+1;
        }
        
        
        Iterator it = lista.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        System.out.println("-----------Palavras a serem pesquisadas-----------------");
        String pesq;
        Iterator itPesq = lista.iterator();
        
        while(itPesq.hasNext()){
            
            pesq = itPesq.next().toString();
            System.out.println("Pesquisa: " + pesq);
        }
        
        //=======Fim StopWords===================================================================================================================
        
        
        //Frequencia de ocorrencia de substring pesquisadas ========================================================================
         try {
            FileInputStream fil = new FileInputStream("mensagens.txt");
            Scanner scan = new Scanner(fil);
            
            String mensagem;
            int contMsn = 0;//utilizado para indice das frases
            int contPesq = 0;
                    
            
            //Exibindo mensagens armazenadas no arquivo
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("                                   Mensagens do Arquivo                                                  ");
            System.out.println("---------------------------------------------------------------------------------------------------------");
            
            while (scan.hasNext()) {
                
                String pesqMsn = "start";
                Iterator itPesqMsn = lista.iterator();
                
                //selecionando primeira string da lista para iniciar pesquisa
                while(itPesqMsn.hasNext()){
                    pesqMsn = itPesqMsn.next().toString();
                    System.out.println("Pesquisa: " + pesqMsn);
                }
                
                 //Incluindo linha do arquivo texto na variavel mensagem
                 mensagem = scan.nextLine();
                 mensagem = mensagem.replace(";", " ");
                 mensagem = mensagem.replace(".", " ");
                 mensagem = mensagem.replace(",", " ");
                 mensagem = mensagem.replace("!", " ");
                 mensagem = mensagem.replace("?", " ");
                 mensagem = mensagem.replace("(", " ");
                 mensagem = mensagem.replace(")", " ");
                 mensagem = mensagem.replace("...", " ");
        
                 String mensagemVet[]=mensagem.split(" ");
                 contPesq = mensagemVet.length;
                 int comp = 0;
                 
                 LinkedList lst = new LinkedList();
        
                 //Inserindo valores na lista
                 while(comp < contPesq){
                    lst.add(mensagemVet[comp]);
                    comp=comp+1;
                 }
                 //PAREI AQUI
                 
                 
                 
                 System.out.println("  "+"("+contMsn+")" + mensagem);
                 contMsn++;
            }
            scan.close();
            
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
        }

      
        
    }
        
        
   
    
}
