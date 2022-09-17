/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excessao;

/**
 *
 * @author acerte
 */
public class basico {
    public static void main(String[] args) {
        Aluno a1 = null;
        try {
            imprimirNomeDoAluno(a1);
        }catch(Exception execao){
            System.out.println("Ocorreu um erro no momento de imprimir o nome de ususário");
        }
    }

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
