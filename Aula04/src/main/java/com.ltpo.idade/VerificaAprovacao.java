package com.ltpo.idade;
public class VerificaAprovacao {
    private int nota;
    public VerificaAprovacao(int nota) {
        this.nota = nota;
    }
    public String verificarNota() {
        if (this.nota >= 7) {
            return "Aprovado!";
        } else {
            return "Reprovado!";
        }
    }
}
