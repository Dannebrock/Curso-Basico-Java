package POO;

//Novos objetos para poder fazer ações no programa com eles
//interação entre objetos, atributos e métodos

//Classe -> molde para criar objetos, é uma estrutura que define as características e comportamentos de um tipo específico de objeto. Ela serve como um modelo ou template a partir do qual os objetos podem ser criados. Uma classe pode conter atributos (variáveis) e métodos (funções) que definem o estado e o comportamento dos objetos criados a partir dela.
//molde do objeto = classe
// Cria um novo objeto = instanciar a classe


public class Pessoa {
    
    //Atributos (características)
    private String nome;
    private int idade;
    private String genero;
    private double peso;

    //private => só pode ser acessado dentro da classe

    //função construtora => método especial para criar objetos da classe, tem o mesmo nome da classe e não tem tipo de retorno
    public Pessoa(){

        this.nome = "Desconecido";
        this.idade = 0;
        this.genero = "Desconecido";
        this.peso = 0.0;

    }

    //função construtora com atributos ( mais comuns)

    public Pessoa(String nome, int idade, String genero, double peso){

        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.peso = peso;

    }

    //Métodos (comportamentos)/ Ações que o objeto pode realizar
    // setters e getters => métodos para acessar e modificar os atributos privados

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return this.genero;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }

    public double calcularIMC(){
        //IMC = peso / (altura * altura)
        //altura = 1.75
        double altura = 1.75;
        return this.peso / (altura * altura);
    }

    public String classificarIMC(){
        double imc = calcularIMC();
        if(imc < 18.5){
            return "Abaixo do peso";
        } else if(imc >= 18.5 && imc < 25){
            return "Peso normal";
        } else if(imc >= 25 && imc < 30){
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    // void falar(String mensagem){
    //     System.out.println(nome + " diz: " + mensagem);
    // }

    // void envelhecer(){
    //     idade++;
    //     System.out.println(nome + " agora tem " + idade + " anos.");
    // }
}
