package comparandostrings;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String password = "123456";
        System.out.println("Digite a sua senha: ");

        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        //compara conteúdo
        System.out.println(password.equals(pass));

        // == não compara conteúdo, ele compara a referência (lugar da memória) dos objetos.
        System.out.println(pass == password);


    }
}
