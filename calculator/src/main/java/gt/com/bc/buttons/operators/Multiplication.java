/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.bc.buttons.operators;

import gt.com.bc.Panel;
import javax.swing.JTextField;

/**
 *
 * @author cjbojorquez
 */
public class Multiplication extends Operator {

    public Multiplication(String name, String value, int x, int y, int w, int h, JTextField textbox, Panel calculator) {
        super(name, value, x, y, w, h, textbox, calculator);
    }

    @Override
    public String operation(String valueA, String valueB) {
        return String.valueOf(Integer.parseInt(valueA)*Integer.parseInt(valueB));
    }

    @Override
    public void setTypeOperator() {
        calculator.setBtnSelectedOperator(Multiplication.this);
    }
    
}
