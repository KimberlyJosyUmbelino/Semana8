import java.util.ArrayList;
import javax.swing.JOptionPane;
public class BlocoDeNotas
{
  //Atributo
   private ArrayList<String> notas;
   
   public BlocoDeNotas()
   {
       notas= new ArrayList<String>();
   }
   public void inserirNota(String nota)
   {
      notas.add(nota);
   }
   public int buscarNota (String nota)
   {
      for(int i=0; i < notas.size(); i++)
      {
         if(notas.get(i).equals(nota))
            return i;            
      }
      return -1;  
   }
   public void removerNota(String nota)
   {
      int posicao = buscarNota(nota);
      
      if (posicao >= 0)
      {
         notas.remove(posicao);   
      } 
    
   }
   public void listarNotas()
   {
      for (int i=0;i<notas.size();i++)
      {  
         JOptionPane.showMessageDialog(null,notas.get(i));
      }
   } 
   public void alterar(String nomeDaNota)
   {
         int indice=buscarNota(nomeDaNota);
        
             String notaProcurada=notas.get(indice);
          
     
           String novaNota=JOptionPane.showInputDialog(null,"Substituindo a nota:" +notaProcurada+ "\n\nDigite a nova nota para ");
         
         notas.add(indice, novaNota);
   }
  
}
