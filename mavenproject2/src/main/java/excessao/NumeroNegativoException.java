/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excessao;

/**
 *
 * @author acerte
 */
public class NumeroNegativoException extends RuntimeException {

    private String nomeDoAtributo;

    public NumeroNegativoException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo %s está negativo.", nomeDoAtributo);
    }
}
