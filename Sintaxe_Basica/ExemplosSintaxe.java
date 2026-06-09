package Sintaxe_Basica;

public class ExemplosSintaxe {
    
    public static void main(String[] args){

        // 1- Impressao de texto
        System.out.println("Podemos imprimir texto usando System.out.println()");

        System.out.println("Podemos imprimir números também: " + 42);

        //2 - Tipos Primitivos ( Dados básicos)
        // Variáveis para armazenar diferentes tipos de dados
        //int: para números inteiros

        int idade = 10; // Armazena um número inteiro

        System.out.println("Sua idade é : " + idade);

        //3 -double: para números decimais
        double altura = 1.75; // Armazena um número decimal

        System.out.println("Sua altura é : " + altura);

        //4- Texto: para palavras ou frases
        String nome = "Matheus"; // Armazena um texto
        

        System.out.println("Seu nome é : " + nome);
        

        // 5- boolean: para valores verdadeiros ou falsos
        boolean estudante = true; // Armazena um valor booleano
        boolean temAcesso = false; // Armazena um valor booleano

        System.out.println("Você é estudante : " + estudante);
        System.out.println("Tem Acesso? " + temAcesso);

        // 6 - Variáveis e Atribuição

        int numero; // Declaração e atribuição de uma variável inteira

        numero = 5; // Atribuição de valor à variável   

        System.out.println("O valor da variável é: " + numero);

        // 7 Operadores Aritméticos ( +, -, *, /, %)

        double a = 10;
        double b = 3;

        // () Resolve a operação dentro dos parênteses primeiro
        // 1º operação -> 2º exibição 
        System.out.println("Soma A + B: " + (a + b)); // Adição
        System.out.println("Subtração A - B: " + (a - b)); // Subtração 
        System.out.println("Multiplicação A * B: " + (a * b)); // Multiplicação
        System.out.println("Divisão A / B: " + (a / b)); //

        // 8 - Incremento e Decremento ( ++, --)

        int contador = 0; // Variável para contar   

        contador++; // Incrementa o contador em 1       
        System.out.println("Valor do Contador com incremento: " + contador);

        contador--; // Decrementa o contador em 1
        System.out.println("Valor do Contador após decremento: " + contador);

        // 9 - Operadores Compostos ( +=, -=, *=, /=)
        
        // Em vez de escrever a = a + 5, podemos usar o operador composto +=
        //a += 5; // Equivalente a a = a + 5

        double c = 10;
        double d = 3;

        System.out.println("Operação Composta Soma C + D: " + (c += d)); // Adição composta
        System.out.println("Operação Composta Subtração C - D: " + (c -= d)); // Subtração composta
        System.out.println("Operação Composta Multiplicação C * D: " + (c *= d)); // Multiplicação composta
        System.out.println("Operação Composta Divisão C / D: " + (c /= d)); // Divisão composta




    }
}
