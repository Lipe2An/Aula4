package com.ltpo.idade;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do Aluno: ");
        int notaDigitada = scanner.nextInt();
        VerificaAprovacao verificaAprovacao = new VerificaAprovacao(notaDigitada);
        String resultadoFinal = verificaAprovacao.verificarNota();
        System.out.println("Resultado: "+resultadoFinal);
        scanner.close();
    }
}