// Importamos a biblioteca Scanner, que permite capturar entrada do usuário pelo teclado.
import java.util.Scanner;

public class Calculadora { // Declaração da classe principal do programa. Toda aplicação Java precisa estar dentro de uma classe.
    public static void main (String[] args) { // Método principal, onde o programa começa a executar.
        
        // Criamos um objeto da classe Scanner chamado "leitor", que permite a leitura de dados do teclado.
        Scanner leitor = new Scanner(System.in);
        
        // Declaração de variáveis:
        // numero1 -> Armazena o primeiro número digitado pelo usuário.
        // numero2 -> Armazena o segundo número digitado pelo usuário.
        // resultado -> Armazena o resultado da soma.
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;

        // Exibe uma mensagem pedindo para o usuário digitar o primeiro número.
        System.out.print("Digite o primeiro numero: "); 
        
        // Captura o número digitado pelo usuário e armazena na variável numero1.
        numero1 = leitor.nextInt();

        // Exibe uma mensagem pedindo para o usuário digitar o segundo número.
        System.out.print("Digite o segundo numero: ");
        
        // Captura o número digitado pelo usuário e armazena na variável numero2.
        numero2 = leitor.nextInt();

        // Fecha o objeto Scanner para liberar memória do sistema.
        // Depois de fechar o Scanner, ele não pode ser usado novamente.
        leitor.close();

        // Realiza a soma dos dois números digitados e armazena o resultado na variável "resultado".
        resultado = numero1 + numero2;

        // Exibe o resultado da soma na tela.
        System.out.println("O resultado da soma é: " + resultado);
    }
}
