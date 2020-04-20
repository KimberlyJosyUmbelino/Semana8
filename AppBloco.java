import javax.swing.JOptionPane;
public class AppBloco
{
   public static void main(String[] args)
   {
      
      
      String menu = "1)Insira uma nota\n2)Remova uma nota\n3)Altere uma nota\n4) Listar todas as notas\n5)Saia do sistema";
      int opcao;
      String nota="";
      String nota1="";
      BlocoDeNotas blocoDeNotas = new BlocoDeNotas(); 
      do
      {  
        
         
         opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
         //opcao a ser avaliada
         switch(opcao)
         {
            case 1 :
            {
               nota = JOptionPane.showInputDialog("Digite a nota: ");
               blocoDeNotas.inserirNota(nota);
               break;
            }
            case 2 :
            {
               nota1 = JOptionPane.showInputDialog("Digite o que você deseja remover: ");
               blocoDeNotas.removerNota(nota1);
               break;
            }
            case 3 :
            {
               nota = JOptionPane.showInputDialog("Digite o que você deseja alterar: ");
               blocoDeNotas.alterar(nota);
   

               break;
            }
            case 4 :
            {
               blocoDeNotas.listarNotas();
               break;
            } 
            case 5:
            {
               JOptionPane.showMessageDialog(null,"Tchau");
            }
         }
      }
       while(opcao !=5);
   }
}