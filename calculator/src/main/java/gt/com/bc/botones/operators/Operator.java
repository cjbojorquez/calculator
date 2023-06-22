/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.bc.botones.operators;

import gt.com.bc.Panel;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author cjbojorquez
 */
public abstract class Operator extends JButton {
    
    private String name;
    private String value;
    public Panel calculator;
    public JTextField textbox;
    public Operator(String name,String value,int x,int y,int w,int h,JTextField textbox,Panel calculator){
        super(String.valueOf(value));
        this.name=name;
        this.value = value;
        this.setBounds(x,y, w, h);
        this.calculator=calculator;
        this.textbox=textbox;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               executeAction();
            }
        });
    }
    
    public void executeAction(){
         if (calculator.getBtnSelectedOperator()==null) {
                    calculator.setNumberOne(Integer.parseInt(textbox.getText().length()>0?textbox.getText():"0"));
                    
                    textbox.setText(value);
                    setTypeOperator();
                    calculator.setIsSecondNumber(false);
                } else {
                    textbox.setText(calculator.btnSelectedOperator.operation(String.valueOf(calculator.getNumberOne()), textbox.getText()));
                    calculator.setNumberOne(Integer.parseInt(textbox.getText()));
                    setTypeOperator();
                    calculator.setIsSecondNumber(false);
                }
    }
    public abstract String operation(String valueA,String valueB);
    public abstract void setTypeOperator();
}
