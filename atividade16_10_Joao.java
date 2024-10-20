package vetores;
import java.util.Scanner;

public class atividade16_10_Joao {
    public static void main(String[] args) {
      
        String nomes[] = new String[5];
        double notas[] = new double[5];
        int ras[] = new int[5];
        String resultados[] = new String[5];
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nomes dos alunos: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º nome");
            nomes[i] = s.nextLine();
        }
        
        System.out.println("RAs dos alunos: ");
        for (int i = 0; i < ras.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º RA: ");
            ras[i] = s.nextInt();
        }
        
        System.out.println("Notas dos alunos: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota do " + nomes[i]);
            notas[i] = s.nextDouble();
        }
        
        // Avaliando se os alunos foram aprovados ou reprovados
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = (notas[i] >= 6.0) ? "Aprovado" : "Reprovado";
        }
        
        System.out.println("Resultado final: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + "- " + nomes[i] + " - " + ras[i] + " - " + notas[i] + " - " + resultados[i]);
        }
        
        s.close();  // Fecha o Scanner
    }
}
 