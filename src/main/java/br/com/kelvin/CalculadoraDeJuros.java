/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kelvin;

import java.math.BigDecimal;

/**
 *
 * @author kelvin
 */
public class CalculadoraDeJuros {
    
    private final CalculadoraDeJurosStrategyInterface calculadoraDeJurosStrategyInterface;
    
    public CalculadoraDeJuros(CalculadoraDeJurosStrategyInterface calculadoraDeJurosStrategyInterface) {
        this.calculadoraDeJurosStrategyInterface = calculadoraDeJurosStrategyInterface;
    }
    
    public BigDecimal calculaJuros(Pedido pedido) {
        return pedido.getValorTotal()
                .multiply(this.calculadoraDeJurosStrategyInterface.getTaxaDeJuros(pedido));
    }
    
}
