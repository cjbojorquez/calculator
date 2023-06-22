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
public class Clean extends Operator {
    
    public Clean(String name, String value, int x, int y, int w, int h, JTextField textbox, Panel calculator) {
        super(name, value, x, y, w, h, textbox, calculator);
    }
    
    @Override
    public String operation(String valueA, String valueB) {
        return "0";
    }
    
    @Override
    public void setTypeOperator() {
        calculator.setBtnSelectedOperator(null);
    }
    
    @Override
    public void executeAction() {
        
        textbox.setText("0");
        setTypeOperator();
        calculator.setIsSecondNumber(false);
        calculator.setNumberOne(0);
    }
    
}
