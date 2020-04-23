import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;



public class Aparecida {
    

    
    public static void main(String[] args) throws IOException {
        
        FileWriter arq = new FileWriter("\\Users\\loren\\OneDrive\\Documentos\\Arquivos Faculdade\\EPs\\AED\\GrafoDaAlegria2.txt");
        PrintWriter saida = new PrintWriter(arq);

    
        String caminho = "\\Users\\loren\\OneDrive\\Documentos\\Arquivos Faculdade\\EPs\\AED\\OD_graph.txt";
        Reader reader = Files.newBufferedReader(Paths.get(caminho));
 

        File graph = new File(caminho);
        Scanner sc = new Scanner(graph);
                
        LinkedList<LinkedList<Integer>> nosss = new LinkedList<LinkedList<Integer>>();
        
        for(int i = 0; i < 86319; i++) nosss.add(new LinkedList<Integer>());
        
        
        sc.nextLine();
        sc.nextLine();
        int m = 0;
        while(sc.hasNext()){
         
            String afff = sc.nextLine();
            String [] saco = afff.split(" ");
            
            int maria = Integer.parseInt(saco[1]);
            
            nosss.get(maria).add(1);
            m++;
            System.out.println(m);
        }
        sc.close();

        System.out.println("---Fim da Leitura do Arquivo---");
        for(int meu = 0; meu < 86319; meu++){
            
            int jorge = nosss.get(meu).size();            
           
            saida.println(jorge);  
            m++;
            System.out.println(m);
        } 

        saida.close();

    }
}    
            
            
                