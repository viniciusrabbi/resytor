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
       
        String msn = "Vou precos do estudar que ; e respectiva compra esse pessoa na, de  modulo.";
        
        //Excluindo pontuação...
        msn = msn.replace(";", " ");
        msn = msn.replace(".", " ");
        msn = msn.replace(",", " ");
        msn = msn.replace("!", " ");
        msn = msn.replace("?", " ");
        msn = msn.replace("(", " ");
        msn = msn.replace(")", " ");
        msn = msn.replace("...", " ");
        
        
        
        //Excluindo pronomes artigos preposiçoes e conjuções...
        msn = msn.replaceAll(" e |esse| de |na| da | a ", " ");
        msn = msn.replaceAll(" que | do | no ", " ");
    
        
        //Excluindo acento gráfico...
        //msn = msn.replace(";", "");
        //msn = msn.replace("é","e");
        //msn = msn.replace("ó", "o");
        //msn = msn.replace("ô", "o");
        //msn = msn.replace("á","a");
        

        //utilizar caracter especial para quebrar as Strings...
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
        
        //Inserindo valores na lista
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
        
        //==============================================================
        String msn2 = "Inflacao e um precos aumento generalizado de precos e resulta em perda do poder de compra.";
        msn2 = msn2.replace(";", " ");
        msn2 = msn2.replace(".", " ");
        msn2 = msn2.replace(",", " ");
        msn2 = msn2.replace("!", " ");
        msn2 = msn2.replace("?", " ");
        msn2 = msn2.replace("(", " ");
        msn2 = msn2.replace(")", " ");
        msn2 = msn2.replace("...", " ");
        
        
        
        String subStr2[] = msn2.split(" ");
        int comp=0;
        int contSub = subStr2.length;
        
        LinkedList lst = new LinkedList();
        
        //Inserindo valores na lista
        while(comp < contSub){
            lst.add(subStr2[comp]);
            comp=comp+1;
        }
        
        Iterator iter = lst.iterator();
        int contVet = 0;
        System.out.println("-----------Palavras COM stopwords-----------------");
        
        while(iter.hasNext()){
            System.out.println(iter.next());
            contVet=contVet+1;
        }
        
        Iterator lstFrase1 = lista.iterator();
        
        String strPesqFrase1;
        String strPesqFrase2;
        int contStrFrase1 = 0;
        
        comp=0;
        System.out.println("-----------Testando COMPARAÇÃO de Palavras-----------------");
        while(lstFrase1.hasNext()){
            strPesqFrase1 = lstFrase1.next().toString();
            System.out.println(">> Palavra ha ser pesquisada: " +strPesqFrase1);

            Iterator lstFrase2 = lst.iterator();
            
            while(lstFrase2.hasNext()){
                strPesqFrase2 = lstFrase2.next().toString();
                if(strPesqFrase1.equals(strPesqFrase2.toString())){
                    contStrFrase1 = contStrFrase1+1;
                }
                System.out.println(strPesqFrase2);
            }
            System.out.println("N de Frequencia: " +contStrFrase1+ "  da Palavra: " +strPesqFrase1);
            System.out.println("-------------------------------------------------------------------");
            contStrFrase1=0;
        }
        
        
        //==============================================================
        
        
        
        
        
        
        
         try {
            FileInputStream fil = new FileInputStream("mensagens.txt");
            Scanner scan = new Scanner(fil);
            int contPesq = 0;
            
            String mensagem;
        
  
            
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("                                    Mensagens do Arquivo                                        ");
            System.out.println("------------------------------------------------------------------------------------------------");
  
            while (scan.hasNext()) {
                 mensagem = scan.nextLine();
                
                 System.out.println("  " + mensagem);
                
                
             
            }
            scan.close();
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
        }

      
        
    }
        
        
   
    
}
