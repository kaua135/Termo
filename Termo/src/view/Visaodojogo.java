package view;

import java.util.Scanner;

public class Visaodojogo {

    private Scanner sc = new Scanner(System.in);

    public String lerNome() {
        System.out.print("Digite seu nome: ");
        return sc.nextLine();
    }

    public String lerTentativa() {
        System.out.print("Digite uma palavra de 5 letras: ");
        return sc.nextLine();
    }

    public void mostrarResultado(String resultado) {

        for (int i = 0; i < resultado.length(); i++) {

            char c = resultado.charAt(i);

            if (c == 'V') {
                System.out.print("🟩");
            }
            else if (c == 'A') {
                System.out.print("🟨");
            }
            else {
                System.out.print("⬜");
            }
        }

        System.out.println();
    }
}