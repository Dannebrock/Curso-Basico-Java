package PROJETO;

import java.util.Scanner;


public class Calculadora {
    
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Exibir todas opções de operações para o usuario
    
    int opcao;
    
        do {

            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");   
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");            
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            
            opcao = scanner.nextInt();

            if(opcao >= 1 && opcao <= 4){
                
                //Resgatar os números para a operação usuario 
                System.out.println("Digite o primeiro número:");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                double num2 = scanner.nextDouble();


                double resultado = 0;
                boolean operacaoValida = true;

                System.out.println(num1 + " " + num2);

                // Encontrar o Resultado da operação escolhida

                switch (opcao) {
                    case 1:
                        resultado = adicionar(num1, num2);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        if(num2 != 0){
                            resultado = dividir(num1, num2);
                        } else {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                            operacaoValida = false;
                        }
                        break;
                }
                
                
                //Mostrar o resultado para o usuario

                System.out.println("Resultado: " + resultado);

            }else if(opcao != 0){
                System.out.println("Opção inválida, tente novamente.");
            }

        } while(opcao != 0);

        //liberar recursos da memoria
        System.out.println("Calculadora encerrada. Obrigado por usar!");
        scanner.close();       

    }

    //Operações matemáticas
    
    public static double adicionar(double a, double b){
        return a + b;
    }
    
    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }

}
