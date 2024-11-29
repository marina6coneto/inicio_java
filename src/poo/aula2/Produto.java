package poo.aula2;

public class Produto {
    //atributos
    String nome;
    String marca;
    float valor;

    Produto(){
    }
    Produto(String nome){
        this.nome = nome;
    }

    Produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}
