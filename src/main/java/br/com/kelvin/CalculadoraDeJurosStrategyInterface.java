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
public interface CalculadoraDeJurosStrategyInterface {
    
    public BigDecimal getTaxaDeJuros(Pedido pedido);
    
}
