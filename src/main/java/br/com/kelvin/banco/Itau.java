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
public class Itau implements CalculadoraDeJurosStrategyInterface {
    
    private final BigDecimal VALOR_TETO_SEM_DESCONTO = new BigDecimal(300);
    private final float TAXA_ALTA = 0.1f;
    private final float TAXA_BAIXA = 0.2f;

    @Override
    public BigDecimal getTaxaDeJuros(Pedido pedido) {
        float taxa = TAXA_ALTA; 
        
        if (pedido.getValorTotal().compareTo(VALOR_TETO_SEM_DESCONTO) == 1) {
            taxa = TAXA_BAIXA;
        }
        
        return new BigDecimal(taxa);
    }
    
}
