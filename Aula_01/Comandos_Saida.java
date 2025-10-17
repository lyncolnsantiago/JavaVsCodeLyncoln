public class Comandos_Saida{
    public static void main(String[] args) {
        //System.out.println() comando de saida no console
        System.out.println("Exibindo a mensagem no console");
        System.out.print("Testando outra opção");
        System.out.print("Usando o print sem o ln");
        /* a diferença entre o println e o print
        println - pula para a proxima linha
        print - fica todo o texto na mesma linha
        */

       System.out.println("\n1º linha \n2º linha \n3º linha");
       System.out.println("\n1º linha \tnome \tendereço \n2º linha \tnome \tendereço \n3º linha \tnome \tendereço");
       System.out.println("\n1º linha \tnome \tendereço \ttelefone"+ 
                          "\n2º linha \tnome \tendereço \ttelefone"+ 
                          "\n3º linha \tnome \tendereço \ttelefone ");
    }
}