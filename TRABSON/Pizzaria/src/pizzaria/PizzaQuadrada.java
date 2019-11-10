/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

/**
 *
 * @author ronaldoniz
 */
public class PizzaQuadrada extends FormaPizza {
    
    private float lado;

    public PizzaQuadrada(float lado, float area) {
        super(area);
        this.lado = lado;
    }
    
    
}
