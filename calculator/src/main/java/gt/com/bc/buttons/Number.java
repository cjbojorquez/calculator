/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.bc.buttons;

import gt.com.bc.Panel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author cjbojorquez
 */
public class Number extends JButton{
    
    private String name;
    private int value;
    

    public Number(int value,int x,int y,int w,int h,JTextField textbox,Panel calculator) {
        super(String.valueOf(value));
        this.name=valueToText(value);
        this.value = value;
        this.setBounds(x,y, w, h);
        addActionListener((java.awt.event.ActionEvent evt) -> {
            if(calculator.isIsSecondNumber()){
                
                textbox.setText(textbox.getText()+this.value);
            }
            else {
                textbox.setText(this.value+"");
                calculator.setIsSecondNumber(true);
            }
        });
        
        
        
    }

    public String valueToText(int value){
        
        ArrayList<String> numbers=new ArrayList<>(Arrays.asList("Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"));
        
        return numbers.get(value);
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
}
