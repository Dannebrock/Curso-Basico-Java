package POO;

public class ProgramaPrincipal {
    
    public static void main(String[] args) {
        //Criar um objeto da classe Pessoa (new Pessoa() => instanciar a classe ))
        // tipo(classe) var = new Classe();
        Pessoa pessoa1 = new Pessoa();

        //Acessar os métodos do objeto para definir os atributos
        pessoa1.setNome("Matheus");
        pessoa1.setIdade(25);
        pessoa1.setGenero("Masculino");
        pessoa1.setPeso(70.5);

        //Acessar os métodos do objeto para obter os atributos
        System.out.println("Nome da pessoa: " + pessoa1.getNome());
        System.out.println("Idade da pessoa: " + pessoa1.getIdade());
        System.out.println("Gênero da pessoa: " + pessoa1.getGenero());
        System.out.println("Peso da pessoa: " + pessoa1.getPeso());

        //pessoa1.falar("Olá, tudo bem?");
        //pessoa1.envelhecer();

        Pessoa pessoa2 = new Pessoa("Ana", 30, "Feminino", 60.0);   
        System.out.println("Nome da pessoa: " + pessoa2.getNome());
        System.out.println("Idade da pessoa: " + pessoa2.getIdade());   
        System.out.println("Gênero da pessoa: " + pessoa2.getGenero());
        System.out.println("Peso da pessoa: " + pessoa2.getPeso());

        System.out.println("IMC da pessoa: " + pessoa2.calcularIMC());

        System.out.println("Classificação do IMC: " + pessoa2.classificarIMC());
    }

}
