
import java.util.Scanner;

public class App {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        //definir as variaveis e solicitando ao usuário
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe a nota da Prova Semestral: ");
        var psemestral = entrada.nextFloat(); 
        System.out.println("Informe a nota do TCC: ");
        var tconclusao = entrada.nextFloat();
        System.out.println("Informe a nota da Prova Intermediaria 1: ");
        var avaliacao1 = entrada.nextFloat();
        System.out.println("Informe a nota da Prova Intermediaria 2: ");
        var avaliacao2 = entrada.nextFloat();
        entrada.close();
      

        //definir o calculo
        double mediaFinal = (psemestral * 0.5 + tconclusao * 0.3 + ((avaliacao1 + avaliacao2)/2) * 0.2);
        System.out.println("Media Final: " + mediaFinal);
        
        //depois o resultado
        if (mediaFinal >= 6){
            System.out.println("Aluno Aprovado");
        }else if (mediaFinal >= 3){
            System.out.println("Aluno em Recuperação");
        }else{
            System.out.println("Aluno Reprovado");
        }
       
    }
}
