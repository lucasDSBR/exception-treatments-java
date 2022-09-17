/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excessao;

/**
 *
 * @author acerte
 */
public class ChecadoVsNaoChecado {
    public static void main(String[] args) {
        geraErro1();
        geraErro2();

        System.out.println("FIM");
    }

    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro bem legal #01");
    }
    static void geraErro2(){
        new Exception("Ocorreu um erro bem legal #02");
    }
}
