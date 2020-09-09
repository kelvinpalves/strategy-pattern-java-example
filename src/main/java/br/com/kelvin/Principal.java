/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kelvin;

import br.com.kelvin.banco.Itau;
import br.com.kelvin.banco.Santander;
import java.math.BigDecimal;


/**
 *
 * @author kelvin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pedido pedido = new Pedido(new BigDecimal(1500.60));
        
        CalculadoraDeJuros calculadoraDeJuros;
        
        calculadoraDeJuros = new CalculadoraDeJuros(new Santander());
        BigDecimal jurosSantander = calculadoraDeJuros.calculaJuros(pedido);
        
        calculadoraDeJuros = new CalculadoraDeJuros(new Itau());
        BigDecimal jurosItau = calculadoraDeJuros.calculaJuros(pedido);
        
        
        System.out.println("---------------------------------------------------");
        System.out.println("Valores do Pedido no Banco Santander:\n");
        pedido.imprimirValorTotalComJuros(jurosSantander);
        
        System.out.println("---------------------------------------------------");
        System.out.println("Valores do Pedido no Banco Itau:\n");
        pedido.imprimirValorTotalComJuros(jurosItau);
    }
    
}
