package Estrutura_Controle;

public class ExemplosControle {
    
    //if - else (condição)

    //operadores de comparação ( ==, !=, >, <, >=, <=)

    public static void main(String[] args) {
    
    
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        double nota = 6.9;

        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        int hora = 14;

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        //2 - operadores de condição (&&, ||, !)

        int x =10;
        int y = 5;

        System.out.println("x == y: " + (x == y)); 
        System.out.println("x != y: " + (x != y)); 
        System.out.println("x > y: " + (x > y)); // true
        System.out.println("x < y: " + (x < y)); // false
        System.out.println("x >= y: " + (x >= y)); // true
        System.out.println("x <= y: " + (x <= y)); // false

        boolean a = true; 

        if(a){
            System.out.println("A é verdadeiro");
        } else {
            System.out.println("A é falso");
        }

        // operadores lógicos 
        //&& (AND) - retorna true se ambas as condições forem verdadeiras
        //|| (OR) - retorna true se pelo menos uma das condições for verdadeira 
        // ! (NOT) - inverte o valor lógico de uma condição

        boolean temDinheiro = true;
        boolean temTempo = false;

        if (temDinheiro && temTempo) {
            System.out.println("Você pode sair para se divertir!");
        } else {
            System.out.println("Você não pode sair para se divertir.");
        }

        //loops (laços de repetição)    
        // Foco em For 
        //Repetir algo até uma condição ser atendida
        //evitar código repetitivo

        int contador = 1;

        while(contador <=5){
            System.out.println(contador);     
            contador++;      
        }

        // iteração = cada repetição do loop

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        //exemplos práticos 

        //analise numerica 

        int [] numeros = {1, 2, 3, 4, 5,6,7,8,9};

        int somaPar = 0;
        int somaImpar = 0;

        //como eu vou chamar a unidade da minha lista : lista 

        
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                somaPar += numero; // somaPar = somaPar + numero
            } else {
                somaImpar += numero; // somaImpar = somaImpar + numero
            }
        }

        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Soma dos números ímpares: " + somaImpar);

        //identificar se o numero é multplo de 3

        for (int num : numeros) {
            if (num % 3 == 0) {
                System.out.println(num + " é múltiplo de 3.");
            } else {
                System.out.println(num + " não é múltiplo de 3.");
            }

            if(num > 5 && num <7){
                System.out.println("O número está entre 5 e 7: " + num);
            }

            //break => ejetar o loop
            //continue => pular a iteração atual e continuar com a próxima 

            //vars temporárias dos loops, elas podem se repetir 

            for( int i = 1; i <= 10; i++){
                if(i == 5){
                    continue; // sai do loop quando i for igual a 5
                }

                if(i == 8){
                    break; // sai do loop quando i for igual a 8
                }
                System.out.println(i);
            }
            
            
        }
        
        

    }

    
    
}
