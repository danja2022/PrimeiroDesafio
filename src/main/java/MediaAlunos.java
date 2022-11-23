
import java.util.Scanner;



public class MediaAlunos {

 
  
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner leia = new Scanner(System.in);
        Scanner leiaString = new Scanner (System.in);
        int media;
        String MediaFinal;
        
        System.out.print ("Nome do aluno: ");
        aluno.setNome(leiaString.nextLine());
        
        System.out.print ("Valor nota 1: ");
        aluno.setNota1(leia.nextFloat());
        
        System.out.print ("Valor nota 2: ");
        aluno.setNota2(leia.nextFloat());
        
        System.out.print ("Valor nota 3: ");
        aluno.setNota3(leia.nextFloat());
        
        System.out.print ("Valor nota 4: ");
        aluno.setNota4(leia.nextFloat());
        
        aluno.media =aluno.CalcularMedia(aluno.getNota1(),aluno.getNota2(),aluno.getNota3(),aluno.getNota4());
        
        System.out.println("Nome do Aluno: " + aluno.nome);
                
        System.out.println ("Média Final: " + aluno.media);
        
        
        
    }
    
}
