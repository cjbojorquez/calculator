/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.bc;

import gt.com.bc.buttons.operators.Addition;
import gt.com.bc.buttons.operators.Clean;
import gt.com.bc.buttons.operators.Division;
import gt.com.bc.buttons.operators.Equal;
import gt.com.bc.buttons.operators.Multiplication;
import gt.com.bc.buttons.operators.Operator;
import gt.com.bc.buttons.operators.Sustraction;
import gt.com.bc.buttons.Number;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author cjbojorquez
 */
public class Panel extends JFrame{

    JPanel panel;
    JTextField output;
    int numberOne;
    int numberTwo;
    
    
    private boolean isSecondNumber;
    public Operator btnSelectedOperator;
    private ArrayList<JButton> btnNumber;
    private ArrayList<Operator> btnOperator;
    int width=70;
    int height=70;
        
    public Panel() {
        this.setSize(430,500);
        this.setTitle("Calculator");
        this.setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(300,500));
        this.isSecondNumber=false;
        this.numberOne=0;
        
        begin();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void begin(){
        
        //Array for numbers buttons       
        btnNumber=new ArrayList<>();
        //array for operational buttons
        btnOperator=new ArrayList<>();
        // INITIALIZING 
        panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(null);
        
        output = new JTextField();
        output.setBounds(5, 20, 390, 50);
        panel.add(output);
        // NUMBERS
        printNumbers();
        // OPERATORS
        printOperators();
        
        // ADDING OBJECTS TO PANEL
        
        
        
        this.getContentPane().add(panel);
        
        //startEvents();
    }
    
    public void printNumbers(){
        
        int spaceX=5;
        int spaceY=5;
        int initPosX=(width+spaceX)*2+spaceX;
        int initPosY=100;
        int x=0;
        int y=0;
        for(int i=9;i>=0;i--){
            
            if(y==3)
                x=2;
            btnNumber.add(new Number(i,initPosX-((width+spaceX)*x),initPosY+((height+spaceY)*y),width,height,output,Panel.this));
            x=x+1;
            
            if(x==3){
                x=0;
                y++;
            }
            
        }
        
        for (JButton btn : btnNumber) {
            panel.add(btn);
        }
        
        // adding equal key
        Operator equal= new Equal("Equal","=",initPosX-((width+spaceX)*1),initPosY+((height+spaceY)*(y-1)),width*2+spaceX,height,output,this);
        panel.add(equal);
    }
    
    public void printOperators(){
        
        int spaceX=10;
        int spaceY=5;
        int initPosX=(width+spaceX)*3;
        int initPosY=100;
        int row=0;
        int column=0;
        btnOperator.add(new Clean("Clean","C",initPosX+((width+spaceX)*column),initPosY+((height+spaceY)*row),width*2+spaceX,height,output,this));       
        row++;
        
        btnOperator.add(new Addition("Addition","+",initPosX+((width+spaceX)*column),initPosY+((height+spaceY)*row),width,height,output,this));
        column=1;
        btnOperator.add(new Sustraction("Sustraction","-",initPosX+((width+spaceX)*column),initPosY+((height+spaceY)*row),width,height,output,this));
        row++;
        column=0;
        btnOperator.add(new Multiplication("Multiplication","*",initPosX+((width+spaceX)*column),initPosY+((height+spaceY)*row),width,height,output,this));
        column=1;
        btnOperator.add(new Division("Division","/",initPosX+((width+spaceX)*column),initPosY+((height+spaceY)*row),width,height,output,this));
        row++;
        
        
        btnOperator.add(new Clean("Clean","C",initPosX,initPosY+((height+spaceY)*2),width,height,output,this));
        for (JButton btn : btnOperator) {
            panel.add(btn);
        }
    }
    

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public Operator getBtnSelectedOperator() {
        return btnSelectedOperator;
    }

    public void setBtnSelectedOperator(Operator btnSelectedOperator) {
        this.btnSelectedOperator = btnSelectedOperator;
    }

    public boolean isIsSecondNumber() {
        return isSecondNumber;
    }

    public void setIsSecondNumber(boolean isSecondNumber) {
        this.isSecondNumber = isSecondNumber;
    }
    
}
