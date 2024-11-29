package poo.aula1;

public class Carro {
    // atributos

    String nome;
    String marca;
    int ano;
    double vel;


    // métodos
    void acelerar(double aceleracao){
        vel += aceleracao;

    }

    void freiar(int reduzir){
        vel -= reduzir;
    }

    void buzinar(){
        System.out.println("bibibiiiii");
    }
}
