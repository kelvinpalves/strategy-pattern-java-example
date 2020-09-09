/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kelvin.banco;

import br.com.kelvin.CalculadoraDeJurosStrategyInterface;
import br.com.kelvin.Pedido;
import java.math.BigDecimal;

/**
 *
 * @author kelvin
 */
public class Santander implements CalculadoraDeJurosStrategyInterface {

    @Override
    public BigDecimal getTaxaDeJuros(Pedido pedido) {
        return new BigDecimal(0.2);
    }
    
}
