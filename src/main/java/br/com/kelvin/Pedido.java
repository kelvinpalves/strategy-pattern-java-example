/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kelvin;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author kelvin
 */
public class Pedido {
    
    private BigDecimal valorTotal;
    
    public Pedido(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    
    public void imprimirValorTotalComJuros(BigDecimal juros) {
        BigDecimal valorTotal = this.valorTotal.add(juros);
        String valorComJuros = NumberFormat.getCurrencyInstance().format(valorTotal);
        String valorSemJuros = NumberFormat.getCurrencyInstance().format(this.valorTotal);
        
        System.out.println("Valor Total do Pedido: " + valorSemJuros);
        System.out.println("Valor Total do Pedido com Juros: " + valorComJuros);
        System.out.println("---------------------------------------------------");
    }
}
